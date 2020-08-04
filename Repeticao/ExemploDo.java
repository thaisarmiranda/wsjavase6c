import javax.swing.JOptionPane;

class ExemploDo{

public static void main(String args[]){

float nota1 = 0;
float nota2 = 0;
float media = 0;
String resposta = "";

do{
	nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
	nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
	media = (nota1 + nota2) / 2;
	System.out.println("A média é: " + media);
	resposta = JOptionPane.showInputDialog("Digite SIM para continuar").toUpperCase();
}while(resposta.equals("SIM"));


}

}