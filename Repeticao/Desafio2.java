import javax.swing.JOptionPane;

class Desafio2{

public static void main(String args[]){

int num1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 - Digite um numero:"));
int num2 = 0;
int tentativa = 0;

while(num1 != num2){
	num2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2 - Adivinhe o numero do Jogador 1:"));
	if(num1<num2){
		JOptionPane.showMessageDialog(null, "O n�mero do Jogador 1 � menor, tente novamente.");
		tentativa++;
	}else if(num1>num2){
		JOptionPane.showMessageDialog(null, "O n�mero do Jogador 1 � maior, tente novamente.");
		tentativa++;
	}else{
		tentativa++;
		JOptionPane.showMessageDialog(null, "Parab�ns! Voc� adivinhou o n�mero do Jogador 1 em " + tentativa + " tentativas.");
	}}

}

}