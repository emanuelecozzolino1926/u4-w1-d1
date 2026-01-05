public class Es1 {
    public int molti(int num1, int num2){
        return num1 * num2;
    }

    public String conc(String parola, int parola1){
        return parola + parola1;
    }

    public String[] arrayList(String[] lista, String parolaDaInserire){
        String[] newArr = new String[6];
        newArr[0] = lista[0];
        newArr[1] = lista[1];
        newArr[2] = parolaDaInserire;
        newArr[3] = lista[2];
        newArr[4] = lista[3];
        newArr[5] = lista[4];

        return newArr;
    }
}
