/*Write a Java Program to Find the Non-Repeated Elements in an Array

Example:
input=
8
12 25 8 12 43 5 8 43

output=
25 5

*/
import java.util.*;
class Test{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
     for(int i=0;i<arr.length;i++){
         int count=0;
         for(int j=0;j<arr.length;j++){
             if(i!=j){
                 if(arr[i]==arr[j]){
                     count++;
                 }
             }
         }
             if(count==0){
                 System.out.println(arr[i]);
             }
         
     }
    }
}