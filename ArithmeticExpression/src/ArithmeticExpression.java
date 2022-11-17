import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArithmeticExpression {

    // funkcija za presmetuvanje na izrazot pocnuvajki
    // od indeks l, zavrsuvajki vo indeks r
    static int presmetaj(char c[], int l, int r) {
        // Vasiot kod tuka
        l++;
        r--;

        if(r-l==2){
            if (c[l+1] == '+')
                return c[l]-'0'+c[r]-'0';
            else
                return c[l]-'0'-c[r]+'0';

        }
        int f1=l;
        int e1=najdiZagrada(c, f1);

        int f2=e1+2;
        int e2=najdiZagrada(c, f2);

        if (c[e1+1] == '+')
            return presmetaj(c, f1, e1)+presmetaj(c, f2, e2);
        else
            return presmetaj(c, f1, e1)-presmetaj(c, f2, e2);

    }

    private static int najdiZagrada(char[] c, int f2) {
        int i;
        int brojNaOtvoreni = 1;

        for (i=f2 + 1;;i++) {

            if (c[i] == '(') {
                brojNaOtvoreni++;
            } else if (c[i] == ')') {
                brojNaOtvoreni--;
                if (brojNaOtvoreni == 0) {
                    return i;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int i,j,k;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String expression = br.readLine();
        char exp[] = expression.toCharArray();

        int rez = presmetaj(exp, 0, exp.length-1);
        System.out.println(rez);

        br.close();

    }

}
