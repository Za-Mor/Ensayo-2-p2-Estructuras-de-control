
package ejercicio_11;

/**
 *
 * @author Janina Fernanda Zari Mora
 */
import java.util.Scanner;
public class Ejercicio_11 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      
      double num;
      double mayor;
      double menor;
       
     System.out.println("Bienvenido");
     System.out.println("-----------"); 
     
     System.out.println("Ingrese un numero: ");
     num = sc.nextDouble();
     mayor = num;
     menor = num;
     
     for ( int i=2; i<=10; i++){
       System.out.println("Ingrese otro numero: ");
       num = sc.nextDouble();
       
       if (num >= mayor){
          mayor = num;
        }
       if (num <= menor) {
           menor = num;
          }  
       }
     
     System.out.println("El numero mayor es: " +mayor );
     System.out.println("El numero menor es:" +menor);
      }  
    }
    

