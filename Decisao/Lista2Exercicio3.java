import javax.swing.JOptionPane;

class Lista2Exercicio3{

public static void main(String args[]){

int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero inteiro"));
int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero inteiro"));
String operador = JOptionPane.showInputDialog("Digite: \n<+> para Somar\n<-> para Subtrair\n<*> para Multiplicar\n</> para Dividir");

if (operador.equals("+")){
	System.out.println("Soma: " + (num1 + num2));
}else if (operador.equals("-")){
	System.out.println("Subtra~��o: " + (num1 - num2));
}else if (operador.equals("*")){
	System.out.println("Multiplica��o: " + (num1 * num2));
}else if (operador.equals("/")){
	if (num2==0){
	System.out.println("N�o pode dividir por zero");
	}else{
	System.out.println("Divis�o: " + (num1 / num2));
	}
}else{
	System.out.println("Op��o inv�lida");
}

}

}