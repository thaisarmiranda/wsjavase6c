import java.util.Scanner;

class ExemploFor{

public static void main(String args[]){

Scanner teclado = new Scanner(System.in);

// La�o de repeti��o FOR indicado para n�o intera��o com o usu�rio
// Formato por 3 partes: 1) Vari�vel que ir� contar e por onde ela vai come�ar
//			 2) Condi��o
//			 3) Incremento
// for ( (1)int contador=0; (2)contador<50; (3)contador++){}

System.out.println("Qual tabuada voc� deseja visualizar?");
int tabuada = teclado.nextInt();

System.out.println("Tabuada de " + tabuada + " :");

for (int contador=1; contador<11; contador++){
	System.out.println(tabuada + " x " + contador + " = " + (tabuada*contador));
}

}

}