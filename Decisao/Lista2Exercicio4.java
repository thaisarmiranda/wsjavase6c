import java.util.Scanner;

class Lista2Exercicio4{

public static void main(String args[]){

Scanner teclado = new Scanner(System.in);

System.out.println("Digite o primeiro numero: ");
int valor1 = teclado.nextInt();

System.out.println("Digite o segundo numero: ");
int valor2 = teclado.nextInt();

System.out.println("Digite o terceiro numero: ");
int valor3 = teclado.nextInt();

System.out.println("-------------------------");

if (valor1 != valor2 && valor2 != valor3 && valor1 != valor3){  // decisão simples
	if (valor1>valor2 && valor1>valor3){  // decisão composta
		System.out.println(valor1);
		if (valor2>valor2){  // decisão composta
			System.out.println(valor2);
			System.out.println(valor3);
		}else{
			System.out.println(valor3);
			System.out.println(valor2);
		}	
	}else if (valor2>valor1 && valor2>valor3){
		System.out.println(valor2);
		if (valor1>valor3){  // decisão composta
			System.out.println(valor1);
			System.out.println(valor3);
		}else{
			System.out.println(valor3);
			System.out.println(valor1);	
		}
	}else{
		System.out.println(valor3);
		if (valor1>valor2){  // decisão composta
			System.out.println(valor1);
			System.out.println(valor2);
		}else{
			System.out.println(valor2);
			System.out.println(valor1);	
		}	
	}

} // fecha o primeiro if

} // fecha o método main()

} // fecha a classe 