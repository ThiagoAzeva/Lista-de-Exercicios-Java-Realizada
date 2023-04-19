package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
public class Ex_m30 {
public static void main(String[] args) {
// Arrey nao ordenado
int[] numeros = {8, 10, 2, 1, 6, 4, 7, 3, 5, 9};

// Aplicando Bubble Sort para ordenar
bubbleSort(numeros);

// Imprimir o arrey ordenado
System.out.println("O Array Ordenado: ");
for (int numero : numeros) {
	System.out.println(numero+ " ");
	
	
	}
	
}

public static void bubbleSort(int[] array) {
int n = array.length;
boolean trocou;

do {
trocou = false;
for(int i = 1; i < n; i++) {
	
	if(array[i - 1] > array[i]) {
		int temp = array[i - 1];
		array[i - 1] = array[i];
		array[i] = temp;
		trocou = true;
	}
	
}
	n = n - 1;
	
}while(trocou);
	
	
}

}
