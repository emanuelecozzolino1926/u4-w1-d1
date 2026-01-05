import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Es1 esercizio1 = new Es1();
        int risutlato = esercizio1.molti(5,8);
        System.out.println("Il risultato è: " + risutlato);

        String risulatoConc = esercizio1.conc("Epi",22);
        System.out.println("La concatenazione è: " + risulatoConc);

        String[] primoArray = {"A","B","C","D","E"};
        String[] risultatoArray = esercizio1.arrayList(primoArray, "Z");
        for(int i = 0; i < risultatoArray.length ; i++){
            System.out.println(risultatoArray[i]);
        }

        Es2 escericio2 = new Es2();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserici la prima parola: ");
        String parola1 = scanner.nextLine();

        System.out.println("Inserici la seconda parola: ");
        String parola2 = scanner.nextLine();

        System.out.println("Inserici la terza parola: ");
        String parola3 = scanner.nextLine();

        escericio2.conc(parola1, parola2, parola3);

        Es3 esercizio3 = new Es3();
        int risultatoPerimetro = esercizio3.perimetro(20,25);
        System.out.println("Il perimetro del rettangolo è: " + risultatoPerimetro);

        System.out.println("Inserici il numero: ");
        int n1 = Integer.parseInt(scanner.nextLine());

        int risultatopPari = esercizio3.pari(n1);
        System.out.println("Se è pari uscirà 0 se dispari uscirà 1");
        System.out.println(risultatopPari);

        double risutatoArea = esercizio3.area(11.0,10.0,2.0);
        System.out.println("Il risultato area è: " + risutatoArea);
    }
}