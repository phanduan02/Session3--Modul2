import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        return this.b * this.b - 4 * this.a * this.c;
    }
    public double getRoot1(){
        return ((0 - this.b) + Math.pow((this.b * this.b - 4 * this.a * this.c), 0.5)) / 2 * this.a;
    }
    public double getRoot2(){
        return ((0 - this.b) - Math.pow((this.b * this.b - 4 * this.a * this.c), 0.5)) / 2 * this.a;
    }
    public String disPlay(){
        return "giai he phuong trinh bac 2 biet" + " a = " + a + " b = " + b + " c = " + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input a : ");
        double a = scanner.nextDouble();
        System.out.println(" Input b : ");
        double b = scanner.nextDouble();
        System.out.println(" Input c :");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticequation = new QuadraticEquation( a, b, c);
        System.out.println(quadraticequation.disPlay());
        if ( quadraticequation.getDiscriminant() >= 0){
            System.out.println(" phuong tring co 2 nghiem   r1 = : " + quadraticequation.getRoot1());
            System.out.println(" r2 = " + quadraticequation.getRoot2());
        } else if ( quadraticequation.getDiscriminant() < 0){
            System.out.println(" phuong tring vo nghiem ");
        }

    }

}
