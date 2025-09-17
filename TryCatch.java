package exercicios;
import java.util.Scanner;
public class TryCatch {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int Numero = Sc.nextInt();
		int SegundoNumero = Sc.nextInt();
   try {
	   System.out.println(Numero/SegundoNumero);
   }catch(ArithmeticException e) {
	  
	   System.err.println("Num pode dividir por zero");
   }

	}

}
