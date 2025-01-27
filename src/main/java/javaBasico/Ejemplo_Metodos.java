package javaBasico;

public class Ejemplo_Metodos {

	public static void main(String[] args) {
		int resultado = suma(2,80);
		System.out.println(resultado);
		int resultado2 = suma(27,780,200);
		System.out.println(resultado2);
		System.out.println(carro(2));
		ejemplovoid();
	}
	
	public static int suma(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public static int suma(int a, int b, int c) {
		int d = a+b+c;
		return d;
	}
	
	public static String carro (int a) {
		String[] cars = {"volvo", "BMW", "Ford", "Mazda"};
		return cars [a];
	}
	public static void ejemplovoid() {
		System.out.println("Metodo void");
	}
}
//metodos se usan por ejemplo para login que se usa varias veces, para modificar una sola vez