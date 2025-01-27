package javaBasico;

public class Ejemplo_Loop_DoWhile {

	public static void main(String[] args) {
		
		int b = 10;
//diferencia con while se ejecuta al menos una vez, se ejecuta incluso si la condicion es falsa
		do {
			System.out.println("el valor de B es: " +b);
			b++;
		} while (b<=20);
	}

}
