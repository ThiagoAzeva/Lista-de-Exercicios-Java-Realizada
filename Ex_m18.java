package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
import java.util.Scanner;
public class Ex_m18 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String nom;
int n;

System.out.println("Digite seu nome:");
nom =sc.next();

System.out.println("Digite a quantidade de vezes que ele vai ser repetido:");
n = sc.nextInt();

System.out.println("-----------");

for(int i = 0; i < n; i++) {
	System.out.println(nom);
}

	}

}
