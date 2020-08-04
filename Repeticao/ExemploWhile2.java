import javax.swing.JOptionPane;

class ExemploWhile2{

public static void main(String args[]){

String nome = JOptionPane.showInputDialog("Nome do Produto").toUpperCase();
float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor do Produto"));

while (nome.length()<6){
	nome = JOptionPane.showInputDialog("Nome do Produto").toUpperCase();
}

while (valor<11){
	valor = Float.parseFloat(JOptionPane.showInputDialog("Valor do Produto"));
}

JOptionPane.showMessageDialog(null, "Produto: " + nome + "\nValor: " + valor);

}

}