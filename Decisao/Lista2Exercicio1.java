import javax.swing.JOptionPane;

class Lista2Exercicio1{

public static void main(String args[]){

String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
int diarias = Integer.parseInt(JOptionPane.showInputDialog("Quantas diárias?"));
float taxa = 0;

if (diarias>15){
	taxa = (float) 5.5;
}else if (diarias==15){
	taxa=6;
}else{
	taxa=8;
}

float total = diarias * (80 + taxa);

System.out.println("SR(a)" + nome + "\nA sua conta é de: " + total + ". Volte sempre!");

}

}