public class Es3 {
    public int perimetro(int l1, int l2){
        return (l1 + l2) * 2;
    }

    public int pari(int n1){
        if(n1 % 2 == 0){
            return 0;
        } else {
            return 1;
        }
    }

    public double area(double l1, double l2, double l3){
        double perimetro = (l1 + l2 + l3) / 2;
        double area = Math.sqrt(perimetro * (perimetro - l1) * (perimetro - l2) * (perimetro - l3));
        return area;
    }
}
