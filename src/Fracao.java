
public class Fracao {
	public double partefracionaria(double n){
		String numero = String.valueOf(n);
		int c = 1;
		double numFracionario = 0 ;
		
		for (int i = numero.length()-1; i > numero.indexOf('.'); i--) {
			numFracionario += Character.getNumericValue(numero.charAt(i))*c;
			c = c * 10;
		}
		
		double numF = numFracionario/c;
	return numF;
	}
}
