//Area of Rectangle
import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        double width;
        double height;
        double area;
        Scanner myObj = new Scanner(System.in);
        width = myObj.nextInt();
        height = myObj.nextInt();
        area = width*height;
        System.out.println("The Area of The Rectangle : "+ area );
    }

}