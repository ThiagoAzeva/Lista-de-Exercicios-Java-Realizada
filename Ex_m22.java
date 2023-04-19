package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
import java.util.Scanner;
public class Ex_m22 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int maior = 0;
for(int i = 0; i < 20; i++ ) {
	System.out.println("Digite a idade " + (i+1) + ":");
int idade = sc.nextInt();

if(idade >= 18) {
	maior++;
}


	}

System.out.println("Dentro da lista tem " +maior+ " maiores de idade");


}



	}


