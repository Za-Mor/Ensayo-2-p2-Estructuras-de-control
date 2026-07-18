
package ejercicio_2;

/**
 *
 * @author Janina Fernanda Zari Mora
 */

import java.util.Scanner;
public class Ejercicio_2 {

    
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       
     double a;
     double b;
     int opcion;
     
     System.out.println("Bienvenido");
     System.out.println("-----------");
     
     System.out.println("Ingrese el primer numero: ");
      a = sc.nextDouble();
     System.out.println("Ingrese el segundo numero: ");
      b = sc.nextDouble();
      
    System.out.println("-----------");
     
     System.out.println("Elija una opcion: ");
     System.out.println("1. SUMA ");
     System.out.println("2. RESTA ");
     System.out.println("3. MULTIPLICACION");
     System.out.println("4. DIVISION  ");
     System.out.println("5.RESIDUO ");
     System.out.println("-----------");
     opcion = sc.nextInt();
     
     System.out.println("-----------");
     
     switch (opcion){
         case 1:
             System.out.println("1. SUMA:" +(a + b));
             break;
         case 2:
             System.out.println("2. RESTA: "+(a-b));
             break;
         case 3:
             System.out.println("3. MULTIPLICACION: "+(a*b));
             break;
         case 4:
             if (b != 0) { 
             System.out.println("4. DIVISION: " +(a/b));
            } else { 
            System.out.println("no se puede dividir entre 0");
            }
             break;
         case 5: 
             System.out.println("5. RESIDUO: " +(a%b));
             break;
         default:
             System.out.println("Opcion invalida");
             
     }
    }
}
    
    
