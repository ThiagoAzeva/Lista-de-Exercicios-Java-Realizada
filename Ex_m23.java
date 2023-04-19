package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
import java.util.Scanner;
public class Ex_m23 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String nomeMaisNovo = "";
int idadeMaisNovo = Integer.MAX_VALUE;

for(int i = 0; i < 10; i++) {
	System.out.println("Digite o nome da pessoa " +(i+1)+ ":");
	String nome = sc.next();
	
	System.out.println("Digite a idade da pessoa " +(i+1)+ ":");
	int idade = sc.nextInt();
	
	if(idade < idadeMaisNovo) {
	idadeMaisNovo = idade;
	nomeMaisNovo = nome;
	}
}
System.out.println("A pessoa mais nova é " +nomeMaisNovo+ " com " +idadeMaisNovo+ " anos.");

	}

}
