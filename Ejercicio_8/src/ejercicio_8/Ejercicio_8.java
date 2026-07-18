
package ejercicio_8;

/**
 *
 * @author Janina Fernanda Zari Mora
 */
import java.util.Scanner;
public class Ejercicio_8 {

   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
     String contra =  "java2026";
     String intent;
     
     System.out.println("Bienvenido");
     System.out.println("-----------"); 
     
    
     do {
     System.out.println("Ingrese la contrasenia: ");
     intent = sc.nextLine();
     
      if (!intent.equals(contra)) {
         System.out.println("contrasenia incorrecta, intente de nuevo");
        }
     } while (!intent.equals(contra));
     
    System.out.println("--------------------");
    System.out.println("Acceso concedido."); 
      
    } 

} 
    
    

