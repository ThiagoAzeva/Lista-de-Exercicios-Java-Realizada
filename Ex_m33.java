package LISTA_DE_EXERCÍCIOS_JAVA_BÁSICO;
public class Ex_m33 {
public static void main(String[] args) {
		
	int[] numeros = {1, 2, 3, 4, 5};
	
	int elementoRemovido = 2;
	
	int[] novoArray = removerElemento(numeros, elementoRemovido);
	
	System.out.println("anovo array: ");
	for( int numero : novoArray) {
		System.out.println(numero+ "");
	}
	
}

public static int[] removerElemento(int[] array, int elemento) {
	
	int[] novoArray = new int[array.length - 1];
	
	int indicador = 0;
	for(int i = 0; i < array.length; i++) {
		if (array[i] != elemento) {
			novoArray[indicador] = array[i];
			indicador++;
}
	}
	return novoArray;	
}



}
