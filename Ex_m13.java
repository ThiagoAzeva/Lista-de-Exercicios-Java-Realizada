package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
import java.util.Scanner;
public class Ex_m13 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	        System.out.println("Insira os coeficientes a, b e c da equação quadrática (ax^2 + bx + c):");

	        double a = scanner.nextDouble();
	        double b = scanner.nextDouble();
	        double c = scanner.nextDouble();

	        double discriminant = b * b - 4 * a * c;

	        if (discriminant > 0) {
	            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

	            System.out.println("A equação possui duas raízes reais distintas:");
	            System.out.println("Raiz 1: " + root1);
	            System.out.println("Raiz 2: " + root2);
	        } else if (discriminant == 0) {
	            double root = -b / (2 * a);

	            System.out.println("A equação possui uma raiz real dupla:");
	            System.out.println("Raiz: " + root);
	        } else {
	            System.out.println("A equação não possui raízes reais.");
	        }

	        scanner.close();
	    }
	}

	
