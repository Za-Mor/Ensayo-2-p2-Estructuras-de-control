package ejercicios_practica_java;

/**
 * @author janina Zari
 */
import java.util.Scanner;

public class Ejercicio_1 {
    
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido");
        System.out.println("-------------------------");

        System.out.println("Ingrese su nombre: ");
        String nom = sc.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        sc.nextLine(); // Limpieza de buffer

        System.out.println("Ingrese su carrera: ");
        String carrera = sc.nextLine(); 

        System.out.println("Ingrese su estatura: ");
        double altura = sc.nextDouble();

        System.out.println("-------------------------");
        System.out.println("   DATOS REGISTRADOS ");
        System.out.println("-------------------------");
        System.out.println("Nombre: " + nom);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + altura);
    
    }
    
}

