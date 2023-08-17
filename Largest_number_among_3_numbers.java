import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if(a>b&&a>c){
            System.out.printf("%d",a);
        }
        else if(b>a&&b>c){
            System.out.printf("%d",b);
        }
        else{
            System.out.printf("%d",c);
        }
    }
}