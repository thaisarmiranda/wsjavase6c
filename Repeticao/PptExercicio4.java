import javax.swing.JOptionPane;

class PptExercicio4{

public static void main(String args[]){

String nome = "";
int idade = 0;
int totalMaiorIdade = 0;
int totalPessoas = 0;
int totalIdade = 0;
String nomeVelha = "";
int idadeVelha = 0;
String nomeJovem = "";
int idadeJovem = 0;

do{
	nome = JOptionPane.showInputDialog("Digite o nome:");
	idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
	if (idade>=18){
		totalMaiorIdade++;
	}
	totalPessoas++; // contando qnts pessoas
	totalIdade+=idade; // acumulando total de todas as idades

	if (totalPessoas==1){
		idadeVelha = idade;
		nomeVelha = nome;
		idadeJovem = idade;
		nomeJovem = nome;
	}else{
	
		if (idade > idadeVelha){
			idadeVelha = idade;
			nomeVelha = nome;
		}else if (idade > idadeJovem){
			idadeJovem = idade;
			nomeJovem = nome;
		}
	}

}while(JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);

System.out.println("Pessoa mais velha: " + nomeVelha);
System.out.println("Pessoa mais jovem: " + nomeJovem);
System.out.println("Total de pessoas maiores de idade: " + totalMaiorIdade);
System.out.println("Médias das idades: " + (totalIdade/totalPessoas));

}

}