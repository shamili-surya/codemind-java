import java.util.Scanner;
 public class CountNumbers {
         public static void main(String[]args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int n=scanner.nextInt();
        int count=0;
        for(int i=m;i<=n;i++){
            if(i%3==0)
            count=count+1;
        }
        System.out.printf("%d",count);
       }
}
