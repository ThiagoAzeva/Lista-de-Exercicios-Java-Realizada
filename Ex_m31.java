package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
public class Ex_m31 {
public static void main(String[] args) {
	int[] numeros = {1, 2, 3, 4, 5};
	int soma = calcularSoma(numeros);
	
	System.out.println("A soma dos valores do array é: " +soma);
	
}
public static int calcularSoma(int[] array) {
	int soma = 0;
	
	for(int numero : array) {
		soma += numero;
	}
		
	

return soma;	
}

}
