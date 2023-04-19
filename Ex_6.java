package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
import java.util.Scanner;
public class Ex_6 {
public static void main(String[] args) {
int ano;
int mes; 
int dia;


Scanner sc = new Scanner(System.in);


System.out.println("Digite Sua Idade Em Anos:");
	ano = sc.nextInt();
	mes = ano * 12;
	dia = mes * 30;
	System.out.println(+ano + " anos " + mes + " meses e " + dia + " dias.  " );

	}

}
