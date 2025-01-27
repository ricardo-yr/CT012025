package javaBasico;

public class Ejemplo_Arreglo {

	public static void main(String[] args) {
		int intArray[];
		int[] intArray2;

		short shortArray[];
		char charArray [];
		
		//Declarar un array de string
		String[] arr;
		arr = new String[5]; //empiezan en cero
		arr[0] = "cero";
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		//System.out.println("El elemento en la posicion 1 es "+ arr[1]);
		for (int i=0; i<arr.length; i++) { //Lenght regresa la longitud del arreglo
			System.out.println("Elemento en el indice " + i + ": " +arr[i]);
		}
	}

}
