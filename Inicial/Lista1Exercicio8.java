import java.util.Scanner;
class Lista1Exercicio8{

public static void main(String args[]){

Scanner teclado = new Scanner(System.in);

System.out.println("Qual valor deseja sacar?");
int saque = teclado.nextInt();

int nota100 = saque/100;
int resto100 = saque%100;
int nota50 = resto100/50;
int resto50 = resto100%50;
int nota20 = resto50/20;
int resto20 = resto50%20;
int nota10 = resto20/10;
int resto10 = resto20%10;
int nota5 = resto10/5;
int resto5 = resto10%5;
int nota2 = resto5/2;
int resto2 = resto5%2;
int nota1 = resto2/1;

System.out.println("Notas de R$ 100,00: " + nota100);
System.out.println("Notas de R$  50,00: " + nota50);
System.out.println("Notas de R$  20,00: " + nota20);
System.out.println("Notas de R$  10,00: " + nota10);
System.out.println("Notas de R$   5,00: " + nota5);
System.out.println("Notas de R$   2,00: " + nota2);
System.out.println("Notas de R$   1,00: " + nota1);

}

}