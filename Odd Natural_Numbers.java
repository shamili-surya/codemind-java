import java.util.Scanner;
public class OddNaturalNumbers{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int i;
        int number=scanner.nextInt();
        for(i=1;i<=number;i++){
            if(i%2!=0){
                System.out.printf("%d ",i);
            }
        }
    }
}