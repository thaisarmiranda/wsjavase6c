import java.util.Scanner;

class ManipulaString{

public static void main(String args[]){

Scanner teclado = new Scanner(System.in);

System.out.println("Digite um email:");
String email = teclado.next();
System.out.println("Original: " + email);

System.out.println("Maiusculas: " + email.toUpperCase());
System.out.println("Minusculas: " + email.toLowerCase());
System.out.println("Qtde de caracteres: " + email.length());
System.out.println("Tres primeiros caracteres: " + email.substring(0,3));
System.out.println("A partir do terceiro caracter: " + email.substring(3));
System.out.println("Posição do @: " + email.indexOf("@"));
System.out.println("É igual a xpto@xpto?: " + email.equals("xpto@xpto"));
System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
System.out.println("Usuário do email: " + email.substring(0, email.indexOf("@")));
System.out.println("Servidor do email: " + email.substring(email.indexOf("@")+1));

}

}