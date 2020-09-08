import java.util.Scanner;

public class IsDividableBySeven{

     public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo: ");
        int num = sc.nextInt();
        
        if (num % 7 == 0) {
            System.out.println("Cislo je delitelne 7 beze zbytku");
        }
        else {
            System.out.println("Cislo neni delitelne 7 beze zbytku");
        }
   
    }
}