package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
import java.util.Scanner;
public class Ex_8 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double saldo, reaj;

System.out.println("Insira seu Saldo: ");
saldo = sc.nextDouble();

reaj = (saldo *0.01 ) + saldo;

System.out.println("Seu Saldo Com Reajuste De 1% É: " +reaj);

	}

}
