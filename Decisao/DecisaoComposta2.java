import javax.swing.JOptionPane;

class DecisaoComposta2{

public static void main(String args[]){

String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));

if (idade<16){
	System.out.println(nome + ", voc� n�o tem a idade m�nima para votar.");
}else if (idade>=18 && idade<=70){
	System.out.println(nome + ", voc� deve votar.");
}else{
	System.out.println(nome + ", voc� pode escolher votar ou n�o.");
}



System.out.println("At� logo!");

}


}