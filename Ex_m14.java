package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
import java.util.Scanner;
public class Ex_m14 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int num1, num2, num3;

System.out.println("Digite 3 Numeros Para A Ordem Ser Definida:");
num1 = sc.nextInt();
num2 = sc.nextInt();
num3 = sc.nextInt();

int temp;

if(num1 > num2) {
	temp = num1;
	num1 = num2;
	num2 = temp;
}

if (num1 > num3) {
	temp = num1;
	num1 = num3;
	num3 = temp;
}

if (num2 > num3) {
	temp = num2;
	num2 = num3;
	num3 = temp;
}
	
System.out.println("Numeros em Ordem Crescente:");
System.out.println(num1);
System.out.println(num2);
System.out.println(num3);

	}

}
