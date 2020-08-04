import javax.swing.JOptionPane;

class DecisaoComposta2{

public static void main(String args[]){

String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));

if (idade<16){
	System.out.println(nome + ", você não tem a idade mínima para votar.");
}else if (idade>=18 && idade<=70){
	System.out.println(nome + ", você deve votar.");
}else{
	System.out.println(nome + ", você pode escolher votar ou não.");
}



System.out.println("Até logo!");

}


}