import java.util.ArrayList;

public class Decimal extends Numbers{
	double number;
	public Decimal(){
		this.number = getNumber();
	}
	
	@Override
	public void conversao() {
		Fracao fracao = new Fracao();

		ArrayList<Long> quotient = new ArrayList<Long>();
		ArrayList<Long> remainder = new ArrayList<Long>();
		ArrayList<Long> digits = new ArrayList<Long>();
		ArrayList<Integer> fractionalDigits = new ArrayList<Integer>();
		
		long num = (long) number;
		do {
			quotient.add(num);
			num = num / 2;
		} while (num > 0);
		quotient.add((long) 0);
		
		for (int i = 1; i < quotient.size(); i++) {
			remainder.add(num);
			num = quotient.get(i) % 2;
		}

		for (int i = remainder.size() - 1; i >= 0; i--) {
			digits.add((remainder.get(i)));
		}

		if (getNumber() == Math.floor(getNumber())) {
			System.out.println("Binário: \n" + digits);
		} else {
			double numF = fracao.partefracionaria(getNumber());

			int cont = 0;
			do {
				numF = numF * 2;
				if (numF > 1) {
					numF = fracao.partefracionaria(numF);
					fractionalDigits.add(1);
				} else if (numF < 1) {
					numF = fracao.partefracionaria(numF);
					fractionalDigits.add(0);
				} else {
					fractionalDigits.add(1);
					break;
				}
				cont++;
			} while (cont < 6);

			System.out.println("Binário: \n" + digits + "," + fractionalDigits);
		}
	}
}
