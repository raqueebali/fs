
// import java.util.*;
// class BinaryNumber{
//     static boolean binary(String value){
//         int n=Integer.parseInt(value);
//         int b=0;
//         for(int i=0;i<value.length();i++){
//             int temp=value.charAt(i);
//             if(temp=='0'|| temp=='1'){
//                 if(temp%10==0|| temp%10==1){
//                     b=b+1;
//                 }
//                 return true;
//             }
//             else if(temp!='0'|| temp!='1'){
//                 return false;
//             }
//             else{
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         String n=sc.next();
//         System.out.println(binary(n));
//     }
// }


import java.util.*;
class BinaryNumber{
    public static int Binary(int n){
        int arr[]=new int [n];
        for(int i=0;i<arr.length;i++){
            if(i==0||i==1){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
            }
}
public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(Binary(n));
            }
    }
