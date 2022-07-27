package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        write your code here
        //stage 1/5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int n = scanner.nextInt();
//        //checking if the no. is a natural no.
//        if(n > 0){
//            System.out.print("This number is ");
//            if(n%2==0){
//                System.out.println("Even.");
//            }else{
//                System.out.println("Odd.");
//            }
//            if(n%10==7 || n%7==0){
//                System.out.println("It is a Buzz number.");
//            }else{
//                System.out.println("It is not a Buzz number.");
//            }
//            System.out.println("Explanation:");
//            if(num==7 && n%7==0){
//                System.out.println(n + " is divisible by 7 and ends with 7.");
//            }else if(num == 7 && n%7 != 0){
//                System.out.println(n + " ends with 7.");
//            }else if(num != 7 && n%7==0){
//                System.out.println(n+" is divisible by 7.");
//            }else{
//                System.out.println(n+" is neither divisible by 7 nor does it end with 7.");
//            }
//        }else{
//            System.out.println("This number is not natural!");
//        }
        //stage 2/5
        int num =n;
        int zeroCount=0;
        int q=n;
        while(n>0){
            q=n%10;
            n=n/10;
            if(q==0){
                zeroCount+=1;
            }
        }
        if(num > 0){
            System.out.println("Properties of "+num);
            System.out.println("\teven: "+(num%2==0));
            System.out.println("\todd: "+(num%2!=0));
            System.out.println("\tbuzz: "+(num%10==7 || num%7==0));
            System.out.println("\tduck: "+(zeroCount>0));
        }else{
            System.out.println("This number is not natural!");
        }
    }
}
