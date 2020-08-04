import java.util.Scanner;

class VariaveisScanner{

public static void main (String args[]){

Scanner teclado = new Scanner(System.in);

System.out.println("Digite seu primeiro nome: ");
String nome = teclado.next();

System.out.println("Digite seu sobrenome: ");
String sobrenome = teclado.next() + teclado.nextLine();

System.out.println("Digite sua idade: ");
int idade = teclado.nextInt();

System.out.println("Digite sua altura: ");
double altura = teclado.nextDouble();

System.out.println("Digite seu peso: ");
double peso = teclado.nextDouble();
double imc;

imc = peso/(altura*altura);

System.out.println("Nome.....: " + nome);
System.out.println("Sobrenome: " + sobrenome);
System.out.println("Idade....: " + idade);
System.out.println("Altura...: " + altura);
System.out.println("Peso.....: " + peso);
System.out.println("IMC......: " + imc);


}

}