import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Stack;

public class CheckXML {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        String [] redovi = new String[n];

        for(int i=0;i<n;i++)
            redovi[i] = br.readLine();

        int valid=1;
        Stack<String> stack=new Stack<String>();
        for (int i = 0; i < redovi.length; i++) {
            String red = redovi[i];
            if(red.charAt(1)!='/' && red.charAt(0)=='[')
                stack.push(red);
            else{
                if(red.charAt(0)!='[')
                    continue;
                if (!stack.pop().substring(1).equals(red.substring(2))){
                    valid = 0;
                    break;
                }
                }
        }

        System.out.println(valid);

        br.close();
    }
}