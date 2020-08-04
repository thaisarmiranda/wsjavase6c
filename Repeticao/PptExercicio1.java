import javax.swing.JOptionPane;

class PptExercicio1{

public static void main(String args[]){

int dia = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia:"));;
int mes = 0;
int ano = 0;


do{
	if (dia>0 && dia<31){
		mes = Integer.parseInt(JOptionPane.showInputDialog("Insira o mes:"));
		if (mes>0 && mes<13){
			ano = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano:"));
		}else{
			JOptionPane.showMessageDialog(null, "Entre com um mês válido.");
		}
	}else if{
		dia = Integer.parseInt(JOptionPane.showInputDialog("Entre com um dia válido:"));
	}

}while(ano>0);

}

}