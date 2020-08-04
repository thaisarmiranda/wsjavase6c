import javax.swing.JOptionPane;

// swing (representa um pacote 100% Java) = tela ; JOptionPane (classe que representa uma janela)

class DecisaoSimples{

public static void main(String args[]){

String nome = JOptionPane.showInputDialog("Nome: ");  // showInputDialog retorna uma String, não retorna float (tem que fazer o parse)
float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1: "));
float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2: "));
float media = (nota1+nota2)/2;

if (media>=5){
	System.out.println("Parabéns " + nome + ", você foi aprovado(a)!");
}

if (media<3){
	System.out.println(nome + ", infelizmente você foi reprovado(a)!");
}

// Condições Relacionais:
// && => and (as duas condições são verdadeiras)
// || => or  (uma das condições é verdadeira)
// !  => não (negação) Ex. != (não é igual)

if (media<5 && media>=3){
	System.out.println(nome + ", você terá mais uma chance.");
}

System.out.println("Até logo!");

}



}