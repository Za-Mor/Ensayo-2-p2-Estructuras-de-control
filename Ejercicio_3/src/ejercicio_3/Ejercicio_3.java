
package ejercicio_3;

/**
 *
 * @author Janina Fernanda Zari Mora
 */
import java.util.Scanner;
public class Ejercicio_3 {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int edad;
      
       System.out.println("Bienvenido");
       System.out.println("---------------");
       
       System.out.println("Ingrese su edad: ");
       edad = sc.nextInt();
       
       if (edad >= 18) {
        System.out.println("Eres mayor de edad ");
           } 
    } 
    
}
