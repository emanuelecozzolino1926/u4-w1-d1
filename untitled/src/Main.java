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
    }
}