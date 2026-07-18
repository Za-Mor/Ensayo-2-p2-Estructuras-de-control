
package ejercicio_10;

/**
 *
 * @author Janina Fernanda Zari Mora
 */
import java.util.Scanner;
public class Ejercicio_10 {


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    
      double num;
      double suma = 0;
      double prom;
      
     System.out.println("Bienvenido");
     System.out.println("-----------"); 
     
     for (int i=1; i<= 10; i++){
     
      System.out.println("Ingrese un numero");
      num = sc.nextDouble();
      suma = suma+num;
       
      }
     
     prom = (suma/10);
     System.out.println("-----------"); 
     
     System.out.println("Suma total: " +suma );
     System.out.println("Promedio: " +prom );
     
     
      
    }
    
}
