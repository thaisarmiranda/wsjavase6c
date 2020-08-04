import java.util.Scanner;
class Lista1Exercicio5{

public static void main(String args[]){

Scanner teclado = new Scanner(System.in);

System.out.println("Digite seu ano de nascimento (4 digitos)");
int anoNasc = teclado.nextInt();
System.out.println("Digite o ano atual (4 digitos)");
int anoAtual = teclado.nextInt();

System.out.println("Idade atual..: " + (anoAtual - anoNasc));
System.out.println("Idade em 2050: " + (2050 - anoNasc));

}

}