package exercicios;
import java.util.ArrayList;
//Array List não é primitivo, então em alguns ambientes; tem que ser importado.
public class Array {

	public static void main(String[] args) {
// ArrayList<tipo> [nomeação] = new ArrayList<>();
 ArrayList<String> Nomes = new ArrayList<>();
  Nomes.add("maria");
  Nomes.add("joao");
  Nomes.add("ana");
  Nomes.add("evardeson");
// Array possue tamanho não-fixo, mais flexivel que um vetor.
  
 System.out.println(Nomes.get(3));
 //printando o nome da ultima posição
  
  
  
	
	}

}
