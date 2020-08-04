import java.util.Scanner;
class Operadores{

public static void main(String args[]){

Scanner teclado = new Scanner(System.in);

System.out.println("Digite o primeiro numero");
int numero1 = teclado.nextInt();

System.out.println("Digite o segundo numero");
int numero2 = teclado.nextInt();

System.out.println("Divisão: " + (numero1/numero2));
System.out.println("Resto: " + (numero1%numero2));
System.out.println("Primeiro numero é par? " + (numero1%2==0));

numero1++; 
// outra forma de fazer: numero1 = numero1 + 1

System.out.println("Incremento de 1: " + numero1);

System.out.println("Incremento de 2: " + (numero1+=2)); 
// outra forma de fazer: numero1 = numero1 + 2



}


}