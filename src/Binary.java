
public class Binary extends Numbers{

	long intResult = 0;
	double fractionalResult = 0;
	double number;
	 
	public Binary(){
		this.number = getNumber();
	}

	@Override
	public void conversao() {
		String num = String.valueOf((long) number);
		int posicao = 0;

		for (int i = num.length() - 1; i >= 0; i--) {
			intResult = intResult + (Character.getNumericValue(num.charAt(i)) * (long) Math.pow(2, posicao));
			posicao++;
		}

		if (number == Math.floor(number)) {
			System.out.println(intResult);

		} else {
			posicao = -1;
			double fraction = 0;
			String nF = String.valueOf(number);

			for (int i = nF.indexOf('.') + 1; i < nF.length(); i++) {
				fraction += Character.getNumericValue(nF.charAt(i)) * Math.pow(2, posicao);
				posicao--;
			}
			
			fractionalResult = intResult + fraction;
			System.out.println(fractionalResult);

		}
		
	}

}
