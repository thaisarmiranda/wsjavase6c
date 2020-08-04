import java.util.Scanner;
class Lista1Exercicio3{

public static void main(String args[]){

Scanner teclado = new Scanner(System.in);

System.out.println("Entre com o capital");
float capital = teclado.nextFloat();
System.out.println("Entre com a taxa mensal de juros");
double taxaMensal = teclado.nextDouble();
System.out.println("Entre com o período (em meses)");
int periodo = teclado.nextInt();

double montante = capital * Math.pow(1+taxaMensal/100, periodo);
System.out.println("Montante: " + montante);

// Outra forma de printar o dado:

System.out.printf("O capital inicial foi de: %.2f e o montante de: %.3f", capital, montante);

}


}