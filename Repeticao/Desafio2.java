import javax.swing.JOptionPane;

class Desafio2{

public static void main(String args[]){

int num1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 - Digite um numero:"));
int num2 = 0;
int tentativa = 0;

while(num1 != num2){
	num2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2 - Adivinhe o numero do Jogador 1:"));
	if(num1<num2){
		JOptionPane.showMessageDialog(null, "O número do Jogador 1 é menor, tente novamente.");
		tentativa++;
	}else if(num1>num2){
		JOptionPane.showMessageDialog(null, "O número do Jogador 1 é maior, tente novamente.");
		tentativa++;
	}else{
		tentativa++;
		JOptionPane.showMessageDialog(null, "Parabéns! Você adivinhou o número do Jogador 1 em " + tentativa + " tentativas.");
	}}

}

}