import javax.swing.JOptionPane;

class PptExercicio3{

public static void main(String args[]){

String nivel = "";
int contMedio = 0;
int contSuperior = 0;
int contPos = 0;

do{
	nivel = JOptionPane.showInputDialog("Digite o nível de formação:").toUpperCase();
	if(nivel.equals("MEDIO")){
		contMedio++;
	}else if(nivel.equals("SUPERIOR")){
		contSuperior++;
	}else if(nivel.equals("POS")){
		contPos++;
	}

}while(nivel.equals("MEDIO") || nivel.equals("SUPERIOR") || nivel.equals("POS"));
	

if (contMedio>contSuperior && contMedio>contPos){
	JOptionPane.showMessageDialog(null, "O nível Médio foi o mais votado!");
}else if (contSuperior>contPos){
	JOptionPane.showMessageDialog(null, "O nível Superior foi o mais votado!");
}else{
	JOptionPane.showMessageDialog(null, "O nível Pós foi o mais votado!");
}

}

}