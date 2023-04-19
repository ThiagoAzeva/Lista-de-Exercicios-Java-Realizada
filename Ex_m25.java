package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
import java.util.Scanner;
public class Ex_m25 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int cont = 0;

for(int i = 0; i < 20; i++) {
	
	System.out.println("Digite 20 numeros:");
	int n = sc.nextInt();
	
	if(n >= 8) {
		cont++;
	}
	
}
System.out.println(cont+ " Numeros maiores que 8.");

	}

}
