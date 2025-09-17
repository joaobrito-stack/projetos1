package exercicios;

public class TiposPrimitivos {

	public static void main(String[] args) {
     
	// tipos inteiros:
	//1:
	byte a; //aguenta -128 à 127, detem 8 bits
	//2:
	short b; //aguenta -32.768 à 32.767, detem 16 bits
	//3:
	int c; //aguenta -2.147.483.648 à 2.147.483.647, detem 32 bits
	//4:
	long d; //aguenta -9.223.372.036.854.775.808 à 9.223.372.036.854.775.807
	
	// numa escala de 1 a 4, cada numero da variavel acumula 2^(2+x) bits
	
	//tipos quebrados, aceitam virgula;
	
	float e;//suportam até 32 bits, possui uma precisão simples decimal
	
	double f;//suportam até 64 bits; possui precisão decimal dupla.
	
	// tipos de texto, é texto, obviamente;
	
	String g = "Fernanda"; //guarda texto e frases
	char h = 'x'; //guarda apenas 1 caractere
	
	//Obs: String e demais não são primitivos, são Classes Publicas que se comportam como um tipo.
	

	boolean decisão;
    //a unica váriavel primitva, que guarda o status de Verdadeiro, ou Falso;
	}

}
