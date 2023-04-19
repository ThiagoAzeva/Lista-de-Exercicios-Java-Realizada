package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
import java.util.Scanner;
public class Ex_2 {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
double n1, n2, soma;
 
	System.out.println("Digite Um numero Para Ser Somado Ao Proximo:");
	n1 = sc.nextDouble();
	
	System.out.println("Digite O Segundo Numero:");
	n2 = sc.nextDouble();
	
	soma = n1 + n2;
	
	System.out.println("O Resultado Da Soma É: " +soma);
	
	
	}

}
