import java.util.Scanner;
 public class SumOfFactors {
         public static void main(String[]args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i,sum=0;
        for(i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        System.out.printf("%d",sum);
       }
}