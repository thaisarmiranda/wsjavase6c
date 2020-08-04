import javax.swing.JOptionPane;

class Desafio{

public static void main(String args[]){

int num1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 - Digite um numero:"));
int num2 = 0;
int tentativa = 0;

do{
	num2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2 - Adivinhe o numero do Jogador 1:"));
	tentativa++;
}while(num1 != num2);

JOptionPane.showMessageDialog(null, "Parabéns! Você adivinhou o número do Jogador 1 em " + tentativa + " tentativas.");

}

}