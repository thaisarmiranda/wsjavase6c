import javax.swing.JOptionPane;

// swing (representa um pacote 100% Java) = tela ; JOptionPane (classe que representa uma janela)

class DecisaoSimples{

public static void main(String args[]){

String nome = JOptionPane.showInputDialog("Nome: ");  // showInputDialog retorna uma String, n�o retorna float (tem que fazer o parse)
float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1: "));
float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2: "));
float media = (nota1+nota2)/2;

if (media>=5){
	System.out.println("Parab�ns " + nome + ", voc� foi aprovado(a)!");
}

if (media<3){
	System.out.println(nome + ", infelizmente voc� foi reprovado(a)!");
}

// Condi��es Relacionais:
// && => and (as duas condi��es s�o verdadeiras)
// || => or  (uma das condi��es � verdadeira)
// !  => n�o (nega��o) Ex. != (n�o � igual)

if (media<5 && media>=3){
	System.out.println(nome + ", voc� ter� mais uma chance.");
}

System.out.println("At� logo!");

}



}