import java.util.Scanner;

class ExemploWhile{

public static void main(String args[]){

Scanner teclado = new Scanner(System.in);

System.out.println("Digite a qtde do Produto");
int qtde = teclado.nextInt();

while (qtde<1){
	System.out.println("Digite a qtde maior que 0");
	qtde = teclado.nextInt();
}
System.out.println(qtde);



}

}