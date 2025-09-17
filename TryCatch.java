package exercicios;
import java.util.Scanner;
public class TryCatch {

	public static void main(String[] args) {
		Scanner j = new Scanner(System.in);
		int a = j.nextInt();
		int b = j.nextInt();
   try {
	   System.out.println(a/b);
   }catch(ArithmeticException e) {
	  
	   System.err.println("Num pode dividir por zero");
   }

	}

}
