package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
import java.util.Scanner;
public class Ex_m11 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int num, ant, suc;

System.out.println("Digite um Numero Inteiro:");
num = sc.nextInt();

ant = num - 1;
suc = num + 1;
System.out.println("O Antecessor de " +num+ " É = " +ant );
System.out.println("O Sucessor de " +num+ " É = " +suc );
	}

}
