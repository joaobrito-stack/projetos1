package exercicios;
import java.util.ArrayList;
import java.util.Set;
public class Repetições {

	public static void main(String[] args) {
	//For(contador;condição;incremento){ocorrencia}
		
	int[] vetor = {1,2,4,8,16,32,64,128,256};
	//"criando" um Vetor

    for(int i=0; i<10; i++) {
    	 System.out.println(vetor[i]);
    	 //criei um contador chamado i, que vale certo. Sob uma condição:
    	 //enquanto i for menor que 10, ele aumenta +1 unidade (linha: i++)
        }
    //while(apenas a condição){ocorrencia}
    
    
    int incrementador = 9;
    while(vetor.length < 10) {
     vetor = new int[incrementador];
     incrementador++;
    	// While significa, enquanto. Sendo mais simples.
    }
    
 // do while:
 
 
    int segundoincrementador = 0;
do {

vetor[9+segundoincrementador] = segundoincrementador;
	
segundoincrementador++;

}while(segundoincrementador<10);
    
    
    //serve para priorizar o ciclo em vez da condição. A condição é analisado só por ultimo
 // serve pra códigos que tem que ser ativada no minimo, uma vez.
  
	}

}
