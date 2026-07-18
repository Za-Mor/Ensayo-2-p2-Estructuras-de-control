
package ejercicio_4;

/**
 *
 * @author Janina Fernanda Zari Mora
 */
import java.util.Scanner;
public class Ejercicio_4 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
       double nota;
      
       System.out.println("Bienvenido");
       System.out.println("---------------");
       
       System.out.println("Ingrese su nota: ");
       nota = sc.nextDouble();
       
       if (nota >= 7) {
        System.out.println("Estado: Aprobado ");
           } else  { 
         System.out.println("Estado: Reprobado");
    } 
      
    }
    
}
