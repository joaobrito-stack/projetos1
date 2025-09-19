package exercicios;
import java.util.Scanner;
public class TryCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int segundonumero = sc.nextInt();
   try {
	   System.out.println(numero/segundonumero);
   }catch(ArithmeticException e) {
	  
	   System.err.println("Num pode dividir por zero");
   }

	}

}
