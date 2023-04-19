package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
import java.util.Scanner;
public class Ex_m29 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int soma = 0;
int na;// Numero Atual digitado pelo Usuario.

System.out.println("DIgite uma sequencia de numeros. (Um numero negativo encerra a operação.)");

while((na = sc.nextInt()) >= 0) {
System.out.println("----");	
	soma+=na;
	
}

sc.close();

System.out.println("A soma dos Numeros Digitados É: " +soma);

	}

}
