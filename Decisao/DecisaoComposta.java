import javax.swing.JOptionPane;

class DecisaoComposta{

public static void main(String args[]){

String nome = JOptionPane.showInputDialog("Nome: ");
float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1: "));
float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2: "));
float media = (nota1+nota2)/2;

if (media>=5){
	System.out.println("Parabéns " + nome + ", você foi aprovado(a)!");
}else if (media<3){
	System.out.println(nome + ", infelizmente você foi reprovado(a)!");
}else{
	System.out.println(nome + ", você terá mais uma chance.");
}

System.out.println("Até logo!");

}

}