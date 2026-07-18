
package ejercicio_7;

/**
 *
 * @author Janina Fernanda Zari Mora
 */
import java.util.Scanner;
public class Ejercicio_7 {

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      double num;
      double suma = 0;
      int conta = 0;
     
     System.out.println("Bienvenido");
     System.out.println("-----------");
     
     System.out.println("ingrese un numero: ");  
     num = sc.nextDouble();
     
     while (num >= 0 ){
     suma = (suma + num);
     conta++;
     
     System.out.println("Ingrese otro numero: ");
            num = sc.nextDouble();
      }      
    System.out.println("-----------");
    System.out.println("Cantidad de numeros ingresados: " + conta);
    System.out.println("Suma total: " + suma); 
      }   
    }
    

