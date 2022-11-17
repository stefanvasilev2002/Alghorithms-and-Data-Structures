import java.util.Scanner;

class RabotnaNedela{

    private int [] casovi;
    private int brNedela;

    public RabotnaNedela(int[] casovi, int brNedela) {
        super();
        this.casovi = casovi;
        this.brNedela = brNedela;
    }
    @Override
    public String toString() {
        return "";
    }

    public int getSum() {
        int sum=0;
        for(int i=0; i<casovi.length; i++)
        {
            sum+=casovi[i];
        }
        return sum;
    }
}

class Rabotnik{

    private String ime;
    private RabotnaNedela [] nedeli;

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setNedeli(RabotnaNedela[] nedeli) {
        this.nedeli = nedeli;
    }

    public String getIme() {
        return ime;
    }

    public Rabotnik(String ime, RabotnaNedela[] nedeli) {
        super();
        this.ime = ime;
        this.nedeli = nedeli;
    }
    public int sumNedeli(Rabotnik r)
    {
        int sum=0;
        for(int i=0; i<nedeli.length; i++)
        {
            sum+=nedeli[i].getSum();
        }
        return sum;
    }
    @Override
    public String toString() {
       String a="";
       a+=ime;
       a+="   ";
       for(int i=0; i<4; i++)
       {
           a+=nedeli[i].getSum();
           a+="   ";
       }

       a+=sumNedeli(this);
       return a;
    }

}

public class Main {

    public static Rabotnik najvreden_rabotnik(Rabotnik [] niza)
    {
        int maxI=0;
        for(int i=0;i< niza.length; i++)
        {
            if(niza[i].sumNedeli(niza[i])>niza[maxI].sumNedeli(niza[maxI]))
            {
                maxI=i;
            }
        }
        return niza[maxI];
    }
    public static void table(Rabotnik [] niza)
    {
        System.out.println("Rab   1   2   3   4   Vkupno");
        for(int i=0; i<niza.length; i++)
        {
            System.out.println(niza[i]);
        }
    }

    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        Rabotnik [] niza = new Rabotnik[n];
        for(int i=0;i<n;i++)
        {
            String ime;
            scanner.nextLine();
            ime = scanner.nextLine();

            RabotnaNedela [] rabotniNedeli = new RabotnaNedela[4];
            for(int j = 0; j < 4; j++)
            {
                int[] casovi = new int[5];
                for (int k = 0; k < 5; k++)
                {
                    casovi[k] = scanner.nextInt();
                }
                rabotniNedeli[j] = new RabotnaNedela(casovi, j + 1);
            }
            niza[i] = new Rabotnik(ime, rabotniNedeli);
        }


        table(niza);
        System.out.println();
        System.out.println("NAJVREDEN RABOTNIK: " +najvreden_rabotnik(niza).getIme());

    }
}

