package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
public class Ex_m32 {
public static void main(String[] args) {
	int[] numeros = {1, 2, 3, 4, 5};
	
	int elementoAlvo = 5;
	
	int indice = encontrarIndice(numeros, elementoAlvo);
	
	if (indice != -1) {
		
		System.out.println("O elemento " +elementoAlvo+ " foi encontrado no índice: " +indice);
}

	else {
		System.out.println("O elemento " +elementoAlvo+ " não foi encontrado no array.");
}
	
	}

public static int encontrarIndice(int[] array, int elemento) {
	
	for(int i = 0; i < array.length; i++) {
		if(array[i] == elemento) {
			return i;
		}
	}
	
return -1;
	}

}
