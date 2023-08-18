import java.util.Scanner;
public class First_N_Even_Natural_Numbers{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int i;
        int n=scanner.nextInt();
        for(i=n;i>=1;i--){
           System.out.printf("%d ",2*i); 
        }
    }
}