package exercicios;

public class try_catch {

	public static void main(String[] args) {
		int a = 123;
		int b = 0;
   try {
	   System.out.println(a/b);
   }catch(ArithmeticException e) {
	  
	   System.err.println("Num pode dividir por zero");
   }

	}

}
