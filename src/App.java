import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int num1,num2;
        try{
            System.out.println("Hello, World!");
            System.out.print("Escriba dos números separados por un espacio: ");
            num1= sc.nextInt();
            num2= sc.nextInt();
            int res=num1/num2;
        System.out.printf("El resultado de la división es: %d \n",res);
        }catch(InputMismatchException e){
            System.err.println("se tiene que introducir números, no letras");
        }        
    }
}
