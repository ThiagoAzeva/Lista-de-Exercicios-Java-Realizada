package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
import java.util.Scanner;
public class Ex_m27 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int cont = 0;
System.out.println("Digite 20 numeros:");
for(int i = 0; i < 5; i++) {
	int n = sc.nextInt();
	
	if(n >= 0 && n <= 100) {
		cont++;
	}
	
}
System.out.println(cont+ "numeros entre 0 e 100.");
	}

}
