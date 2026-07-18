
package ejercicio_1_;

/**
 *
 * @author Janina Zari
 */
import java.util.Scanner;
public class Ejercicio_1_ {

  
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int edad;
     double altura;
     String carrera;
     String nom;

        System.out.println("Bienvenido");
        System.out.println("-------------------------");

        System.out.println("Ingrese su nombre: ");
        nom = sc.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        
        sc.nextLine(); // Limpieza de buffer

        System.out.println("Ingrese su carrera: ");
        carrera = sc.nextLine(); 

        System.out.println("Ingrese su estatura: ");
        altura = sc.nextDouble();

        System.out.println("-------------------------");
        System.out.println("   DATOS REGISTRADOS ");
        System.out.println("-------------------------");
        System.out.println("Nombre: " + nom);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + altura);

    }
    
}
