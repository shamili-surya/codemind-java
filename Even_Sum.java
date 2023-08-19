import java.util.Scanner;
public class Arrays {
         public static void main(String[]args) {
           Scanner scanner=new Scanner(System.in);
           int n=scanner.nextInt();
           int arr[]=new int[n];
           for(int i=0;i<n;i++){
               arr[i]=scanner.nextInt();
               
           }
           int sum=0;
           for(int eachElement:arr){
             if(eachElement%2==0){  
               sum+=eachElement;
                 
             }
           }
           System.out.println(sum);
          }
        }