package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
import java.util.Scanner;
public class Ex_9 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double cod1, cod2, v1, v2, q1, q2, ipi, total;

System.out.println("Digite o Codigo do Produto 1:");
cod1 = sc.nextDouble();

System.out.println("Digite o Valor do Protudo 1:");
v1 = sc.nextDouble();

System.out.println("Digite a Quntidade de Pordutos 1");
q1 = sc.nextDouble();

System.out.println("Digite o Codigo do Produto 2:");
cod2 = sc.nextDouble();

System.out.println("Digite o Valor do Protudo 2:");
v2 = sc.nextDouble();

System.out.println("Digite a Quntidade de Pordutos 2");
q2 = sc.nextDouble();
		
System.out.println("Por Fim, Digite a Porcentagem do IPI a Ser Acrecido No Vallor Das Peças:");
ipi = sc.nextDouble();

total = (v1 * q1 + v2 * q2) * (ipi /100 + 1);

System.out.println("O Valor Total a Ser Pago É: " +total);
		
	}

}
