import java.util.ArrayList;
import java.util.Scanner;

class Gragjanin{
    private String name;
    private int licna, pasos, vozacka;

    public Gragjanin(String name, int licna, int pasos, int vozacka) {
        this.name = name;
        this.licna = licna;
        this.pasos = pasos;
        this.vozacka = vozacka;
    }
    public String getName(){
        return name;
    }
}
public class MVR {

    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);

        int N = Integer.parseInt(br.nextLine());

        ArrayList<Gragjanin> nizaLicna=new ArrayList<Gragjanin>(0);
        ArrayList<Gragjanin> nizaPasos=new ArrayList<Gragjanin>(0);
        ArrayList<Gragjanin> nizaVozacka=new ArrayList<Gragjanin>(0);
        ArrayList<Gragjanin> nizaLicnaAndVozacka=new ArrayList<Gragjanin>(0);
        ArrayList<Gragjanin> nizaLicnaAndPasos=new ArrayList<Gragjanin>(0);
        ArrayList<Gragjanin> nizaPasosAndVozacka=new ArrayList<Gragjanin>(0);
        ArrayList<Gragjanin> ALL=new ArrayList<Gragjanin>(0);

        for (int i = 1; i <= N; i++) {
            String imePrezime = br.nextLine();
            int lKarta = Integer.parseInt(br.nextLine());
            int pasos = Integer.parseInt(br.nextLine());
            int vozacka = Integer.parseInt(br.nextLine());
            Gragjanin covek = new Gragjanin(imePrezime, lKarta, pasos, vozacka);
            if(lKarta==1 && pasos==0 && vozacka==0){
                nizaLicna.add(covek);
            }
            else if(lKarta==0 && pasos==1 && vozacka==0){
                nizaPasos.add(covek);
            }
            else if(lKarta==0 && pasos==0 && vozacka==1){
                nizaVozacka.add(covek);
            }
            else if(lKarta==1 && pasos==1 && vozacka==0){
                nizaLicnaAndPasos.add(covek);
            }
            else if(lKarta==1 && pasos==0 && vozacka==1){
                nizaLicnaAndVozacka.add(covek);
            }
            else if(lKarta==0 && pasos==1 && vozacka==1){
                nizaPasosAndVozacka.add(covek);
            }
            else {
                ALL.add(covek);
            }
        }
        for(int i=0; i<nizaLicna.size(); i++){
            System.out.println(nizaLicna.get(i).getName());
        }
        for(int i=0; i<nizaPasos.size(); i++){
            System.out.println(nizaPasos.get(i).getName());
        }
        for(int i=0; i<nizaLicnaAndPasos.size(); i++){
            System.out.println(nizaLicnaAndPasos.get(i).getName());
        }
        for(int i=0; i<nizaVozacka.size(); i++){
            System.out.println(nizaVozacka.get(i).getName());
        }
        for(int i=0; i<nizaLicnaAndVozacka.size(); i++){
            System.out.println(nizaLicnaAndVozacka.get(i).getName());
        }
        for(int i=0; i<nizaPasosAndVozacka.size(); i++){
            System.out.println(nizaPasosAndVozacka.get(i).getName());
        }

        for(int i=0; i<ALL.size(); i++){
            System.out.println(ALL.get(i).getName());
        }

    }
}
