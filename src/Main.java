import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int type;
		System.out.println("Tipo de conversão");
		type = in.nextInt(); 
		if (type == 1) {
			Interface conversao = new Decimal();
			conversao.conversao();
		} else {
			Interface conversao2 = new Binary();
			conversao2.conversao();
		}

	}

}
