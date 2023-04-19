package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
import java.util.Scanner;
public class Ex_m10 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double su, sm = 788, qs;

System.out.println("Digite Seu Salario, Sr/Sra Usuario:");
su = sc.nextDouble();

qs = su/sm;

System.out.println("Seu Salario de " +su+ " Equivale a " +qs+ " Salarios Minimos.");


	}

}
