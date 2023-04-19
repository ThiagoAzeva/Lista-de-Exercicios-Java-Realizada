package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
import java.util.Scanner;
public class Ex_m20 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int sum = 0;

System.out.println("Digite a idade de 20 pessoas:");

for(int i = 1; i <= 20; i++) {
int num = sc.nextInt();
sum += num;
}
System.out.println("---------");
System.out.println("A soma das idades é: " +sum);
	}

}
