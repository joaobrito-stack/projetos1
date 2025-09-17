package exercicios;

public class Condicionais {

	public static void main(String[] args) {
    // [tipo de condição](condição) { ocorrencia }
    boolean Bool = true;
    int a = 4;
    if(Bool == true) {
    	System.out.println("Verdade");
    	// if é condição restritiva. A ocorrencia é ativada se a condição for cumprida
    } else {
    	System.out.println("Fake Naty");
    	// else é a negação do if, aonde se a condição não cumprir-se; ocorrencia do else é ativada
    }
     if(Bool == false) {
    	 System.out.println("");
     } else if(Bool == true && a==4) {
    	 System.out.println("beleza");
    	 //else if é uma negação do if instrucionada. Não é uma negação universal do if como else, mas em um contexto especifico.
     }
	}

}
