import java.util.Scanner;
public class Arrays {
         public static void main(String[]args) {
           Scanner scanner=new Scanner(System.in);
           int size,i,sum=0;
           int n=scanner.nextInt();
           int arr[]=new int[n];
           for(i=0;i<n;i++){
               arr[i]=scanner.nextInt();
               
           }
           for(int eachElement:arr){
               sum+=eachElement;
           }
           System.out.println(sum);
          }
        }