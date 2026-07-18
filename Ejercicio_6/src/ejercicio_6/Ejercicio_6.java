
package ejercicio_6;

/**
 *
 * @author Janina Fernanda Zari Mora
 */
import java.util.Scanner;
public class Ejercicio_6 {

 
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
     
     int opcion;
     
     System.out.println("Bienvenido");
     System.out.println("-----------");
     
     
     
     System.out.println("Elija una opcion: ");
     System.out.println("1. ");
     System.out.println("2.  ");
     System.out.println("3. ");
     System.out.println("4. ");
     System.out.println("5. ");
     System.out.println("6. ");
     System.out.println("7. ");
     System.out.println("-----------");
     opcion = sc.nextInt();
     
     System.out.println("-----------");
     
     switch (opcion){
         case 1:
             System.out.println("1. Lunes");
             break;
         case 2:
             System.out.println("2. Martes");
             break;
         case 3:
             System.out.println("3. Miercoles");
             break;
         case 4:
             System.out.println("4. Jueves");
             break;
         case 5: 
             System.out.println("5. Viernes");
             break;
         case 6:
              System.out.println("6. Sabado");
             break;
         case 7:
              System.out.println("7. Domingo");
             break;
             
         default:
             System.out.println("Opcion invalida");
             
     }
    }
    
}
