import javax.swing.JOptionPane;

class PptExercicio3{

public static void main(String args[]){

String nivel = "";
int contMedio = 0;
int contSuperior = 0;
int contPos = 0;

do{
	nivel = JOptionPane.showInputDialog("Digite o n�vel de forma��o:").toUpperCase();
	if(nivel.equals("MEDIO")){
		contMedio++;
	}else if(nivel.equals("SUPERIOR")){
		contSuperior++;
	}else if(nivel.equals("POS")){
		contPos++;
	}

}while(nivel.equals("MEDIO") || nivel.equals("SUPERIOR") || nivel.equals("POS"));
	

if (contMedio>contSuperior && contMedio>contPos){
	JOptionPane.showMessageDialog(null, "O n�vel M�dio foi o mais votado!");
}else if (contSuperior>contPos){
	JOptionPane.showMessageDialog(null, "O n�vel Superior foi o mais votado!");
}else{
	JOptionPane.showMessageDialog(null, "O n�vel P�s foi o mais votado!");
}

}

}