package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
import java.util.Scanner;
public class Ex_m12 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int num;

System.out.println("Digite um Numero");
num = sc.nextInt();

if (num > 0) {
	System.out.println("O Numero É Positivo!");
}

else {
	System.out.println("O Numero É Negativo!");
}

	}

}
