
package ejercicio_9;

/**
 *
 * @author Janina Fernanda Zari Mora
 */
import java.util.Scanner;
public class Ejercicio_9 {

    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
    int num;
    int solut;
    
     System.out.println("Bienvenido");
     System.out.println("-----------"); 
     
     System.out.println("Ingrese un numero entero: ");
     num = sc.nextInt();
     
      System.out.println("-----------"); 
     System.out.println("Tabla del " + num + ":");
     
     for (int i=1;i<=12; i++) {
      solut = num*i;
      
    System.out.println(num + "X" + i + "=" + solut);  
                  

     }
    }
    
}
