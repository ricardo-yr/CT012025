package ejemploEncapsulamiento;

public class demoEncapsulamiento {

	public static void main(String[] args) {
		MiClase mc = new MiClase();
		
		mc.setTipo(5);
		
		System.out.println("El tipo es: "+mc.getTipo());

	}

}
