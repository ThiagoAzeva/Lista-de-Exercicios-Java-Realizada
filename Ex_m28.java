package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
import java.util.Scanner;
public class Ex_m28 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int cont1 = 0, cont2 = 0, cont3 = 0;
System.out.println("Digite 20 numeros:");
for(int i = 0; i < 20; i++) {

	int n = sc.nextInt();	
	
	if(n >= 0 && n <= 100) {
		cont1++;
	}

	if(n >= 101 && n <= 200) {
		cont2++;
	}

	if(n > 200) {
		cont3++;
	}

}

System.out.println(cont1+ " numeros dentro do intervalo 0 a 100.");
System.out.println(cont1+ " numeros dentro do intervalo 101 a 200.");
System.out.println(cont1+ " numeros dentro do intervalo + 200.");
	}

}
