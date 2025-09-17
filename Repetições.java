package exercicios;
import java.util.ArrayList;
import java.util.Set;
public class Repetições {

	public static void main(String[] args) {
	//For(contador;condição;incremento){ocorrencia}
		
	int[] Vetor = {1,2,4,8,16,32,64,128,256};
	//"criando" um Vetor

    for(int i=0; i<10; i++) {
    	 System.out.println(Vetor[i]);
    	 //criei um contador chamado i, que vale certo. Sob uma condição:
    	 //enquanto i for menor que 10, ele aumenta +1 unidade (linha: i++)
        }
    //while(apenas a condição){ocorrencia}
    
    
    int Incrementador = 9;
    while(Vetor.length < 10) {
     Vetor = new int[Incrementador];
     Incrementador++;
    	// While significa, enquanto. Sendo mais simples.
    }
    
 // do while:
 
 
    int SegundoIncrementador = 0;
do {

Vetor[9+SegundoIncrementador] = SegundoIncrementador;
	
SegundoIncrementador++;

}while(SegundoIncrementador<10);
    
    
    //serve para priorizar o ciclo em vez da condição. A condição é analisado só por ultimo
 // serve pra códigos que tem que ser ativada no minimo, uma vez.
  
	}

}
