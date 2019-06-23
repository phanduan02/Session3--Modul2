import java.util.Scanner;

public class RectAngel {
    double width, height;
    public RectAngel( double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width + this.height) * 2;
    }
    public String display(){
        return " RectAngel {" + " width " + width + " height " + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input width : ");
        double width = scanner.nextDouble();
        System.out.println(" Input height : ");
        double height = scanner.nextDouble();
        RectAngel rectangel = new RectAngel(width, height);
        System.out.println(rectangel.display());
        System.out.println( "Area is " + rectangel.getArea());
        System.out.println( "Perimeter is " + rectangel.getPerimeter());
    }

}
