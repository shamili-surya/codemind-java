import java.util.Scanner;
public class Prime{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int i,c=0;
        int n=scanner.nextInt();
        for(i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}