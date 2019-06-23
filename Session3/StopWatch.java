import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap 1 : ");
        int a = scanner.nextInt();
        System.out.println("nhap 2 : ");
        int b = scanner.nextInt();
        long stopTime = System.currentTimeMillis();
        float sec = (stopTime - startTime)/1000F;
        System.out.println(sec + " seconds");



    }
}