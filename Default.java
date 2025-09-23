package exercicios;
import java.util.Scanner;
public class Default {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int potencia=0;
		int decimal =0;
		String string = scanner.next();
		for(int i = string.length()-1; i>=0; i--) {
			decimal += Math.pow(2,potencia)*Character.getNumericValue(string.charAt(i));
			potencia++;
		}
		System.out.println(decimal);
		                   
	}

}
