import java.util.Scanner;
public class vote_eligible{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int age = myObj.nextInt();
        if (age>=18){
            System.out.println("You are Eligible to Vote");
        }
        else{
            System.out.println("You are Not Eligible to Vote");
        }
    }
}