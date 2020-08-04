import javax.swing.JOptionPane;

class ExemploDo3{

public static void main(String args[]){

float nota1 = 0;
float nota2 = 0;

do{
	nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
	nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
	JOptionPane.showMessageDialog(null, "A média é: " + ((nota1 + nota2) / 2));
}while(JOptionPane.showConfirmDialog(
				null,
				"Deseja continuar?",
				"Pergunta",
				JOptionPane.YES_NO_OPTION   // YES-0, NO-2, ...
				)==0); // ==0 pq clicou no SIM


}

}