package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
import java.util.Scanner;
public class Ex_m21 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double sum = 0;
System.out.println("DIgite a idade de 20 pessoas:");

for(double i = 1; i <= 20; i++) {
	double num = sc.nextInt();
	sum += num;
}
double med = sum / 20;
System.out.println("---------");
System.out.println("A média das idades é: " +med);
	}

}
