import java.util.Scanner;
 public class palindrome{
         public static void main(String[]args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int reverse_number=0;
        int temp_number=number;
        while(number!=0){
            reverse_number=reverse_number*10;
            reverse_number=reverse_number+number%10;
            number=number/10;
        }
        if(temp_number==reverse_number){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }
       }
}
