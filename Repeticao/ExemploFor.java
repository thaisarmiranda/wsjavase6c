import java.util.Scanner;

class ExemploFor{

public static void main(String args[]){

Scanner teclado = new Scanner(System.in);

// Laço de repetição FOR indicado para não interação com o usuário
// Formato por 3 partes: 1) Variável que irá contar e por onde ela vai começar
//			 2) Condição
//			 3) Incremento
// for ( (1)int contador=0; (2)contador<50; (3)contador++){}

System.out.println("Qual tabuada você deseja visualizar?");
int tabuada = teclado.nextInt();

System.out.println("Tabuada de " + tabuada + " :");

for (int contador=1; contador<11; contador++){
	System.out.println(tabuada + " x " + contador + " = " + (tabuada*contador));
}

}

}