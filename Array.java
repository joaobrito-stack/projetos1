package exercicios;
import java.util.ArrayList;
//Array List não é primitivo, então em alguns ambientes; tem que ser importado.
public class Array {

	public static void main(String[] args) {
// ArrayList<tipo> [nomeação] = new ArrayList<>();
 ArrayList<String> nomes = new ArrayList<>();
  nomes.add("maria");
  nomes.add("joao");
  nomes.add("ana");
  nomes.add("evardeson");
// Array possue tamanho não-fixo, mais flexivel que um vetor.
  
 System.out.println(nomes.get(3));
 //printando o nome da ultima posição
  
  
  
	
	}

}
