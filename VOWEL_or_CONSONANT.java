import java.util.Scanner;

public class VowelOrConsonant{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c=scanner.next().charAt(0);
       
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("VOWEL");
        }
        else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            System.out.println("VOWEL");
        }
        else {
            System.out.println("CONSONANT");
        }
    }
}