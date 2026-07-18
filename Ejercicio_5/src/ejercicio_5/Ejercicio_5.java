
package ejercicio_5;

/**
 *
 * @author Janina Fernanda Zari Mora
 */
import java.util.Scanner;
public class Ejercicio_5 {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
     double cali;      
      System.out.println("Bienvenido");
      System.out.println("---------------");
       
     System.out.println("Ingrese su calificacion:  ");
        cali = sc.nextDouble();
        
        if (cali >= 9 && cali <= 10) {
            System.out.println("Resultado: Excelente");
        } 
        else if (cali >= 8 && cali < 9) {
            System.out.println("Resultado: Muy Bueno");
        } 
        else if (cali >= 7 && cali < 8) { 
            System.out.println("Resultado: Bueno");
        } 
        else if (cali >= 5 && cali < 7) { 
            System.out.println("Resultado: Regular");
        } 
        else if (cali >= 0 && cali < 5) { 
            System.out.println("Resultado: Deficiente");
        } 
        else {
            System.out.println("Error: La calificacion ingresada no es valida.");
        }

    } 
}
    
    

