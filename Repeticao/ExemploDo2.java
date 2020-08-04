import javax.swing.JOptionPane;

class ExemploDo2{

public static void main(String args[]){

float nota1 = 0;
float nota2 = 0;

do{
	nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
	nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
	System.out.println("A média é: " + ((nota1 + nota2) / 2));
}while(JOptionPane.showInputDialog("Digite SIM para continuar").toUpperCase().equals("SIM"));

// usa .equals() pq é string, se fosse numero usaria ==

}

}