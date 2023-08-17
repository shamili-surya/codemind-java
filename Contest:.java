import java.util.Scanner;
public class Contest{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        if(x<=(1*a)+(2*b)){
            System.out.println("Qualify");
        }
        else{
            System.out.println("Not Qualify");
        }
    }
}