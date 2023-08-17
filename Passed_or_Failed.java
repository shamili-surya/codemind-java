import java.util.Scanner;
public class PassorFail{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if(a<=35){
            System.out.println("FAILED");
        }
        else{
            System.out.println("PASSED");
        }
    }
}