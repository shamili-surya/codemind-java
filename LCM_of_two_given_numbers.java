import java.util.Scanner;
 public class LcmOfTwoGivenNumbers {
         public static void main(String[]args) {
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int i,gcd=0,LCM;
        for(i=1;i<=num1&&i<=num2;++i){
            if(num1%i==0&&num2%i==0)
            gcd=i;
        }
        LCM=(num1*num2)/gcd;
             System.out.printf("%d",LCM);
         }
}