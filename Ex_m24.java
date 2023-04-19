package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
import java.util.Scanner;
public class Ex_m24 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int cont = 0, num, x;
System.out.println("Digite um numero inteiro:");
num = sc.nextInt();
for(int i = 0; i <= 10; i++) {
x = num * cont;
System.out.println(num+ " X " +cont+ " = " +x);
cont++;	
}

	}

}
