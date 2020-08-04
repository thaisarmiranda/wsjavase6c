import java.util.Scanner;

class Produto{

public static void main(String args[]){

Scanner teclado = new Scanner(System.in);

System.out.println("Digite o nome do produto: ");
String produto = teclado.next() + teclado.nextLine();

System.out.println("Digite a quantidade: ");
int qtde = teclado.nextInt();

System.out.println("Digite o valor unitario (em R$): ");
double valorUnitario = teclado.nextDouble();

double valorTotal;
double valorDesconto;
double valorAcrescimo;

valorTotal = qtde * valorUnitario;
valorDesconto = valorTotal * 0.9;
valorAcrescimo = valorTotal * 1.1;


System.out.println("Valor Total........: R$ " + valorTotal);


//System.out.println("Valor com Desconto: R$ " + (valorTotal*0.9)); (comentário)
System.out.println("Valor com Desconto.: R$ " + valorDesconto);

//System.out.println("Valor com Acrescimo: R$ " + (valorTotal*1.1)); (comentário)
System.out.println("Valor com Acrescimo: R$ " + valorAcrescimo);

}



}