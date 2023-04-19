package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
import java.util.Scanner;
public class Ex_3 {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);		

double div, n1, n2;

System.out.println("Digite um numero Para Ser Divido Pelo Proximo:");
n1 = sc.nextDouble();

System.out.println("Digite O Segundo Numero:");
n2 = sc.nextDouble();

div = n1 / n2;

System.out.println("O Resultado Da Divisão É: " + div);
	}

}
