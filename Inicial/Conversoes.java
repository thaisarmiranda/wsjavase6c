class Conversoes{

public static void main(String args[]){

// Convers�o implicita => o Java faz pra voc� (dado menor em um espa�o maior)
// Dados do mesmo tipo
// byte < short < int < long

byte numeroPequeno = 5;
long numeroGrande = numeroPequeno;
System.out.println(numeroGrande);

// Convers�o explicita (Cast) => voc� tem que mostrar quem manda (dado maior em um espa�o menor)
double numeroReal = 1.57;
int numeroMedio = (int) numeroReal; 
System.out.println(numeroMedio);

// Vai dar erro de incompatibilidade se n�o tiver o cast, tem que colocar o (int) para for�a o maior no menor

// Convers�o entre dados incompat�veis => Parse
// Classes Wrappers => s�o classes que apoiam tipos primitivos
// int => Integer ; double => Double ; float => Float (...)
// Browser manipula String - numero em web tem que parsear pq vem em formato String

String numero = "7";
numeroMedio = Integer.parseInt(numero);
numeroReal = Double.parseDouble(numero);
numeroPequeno = Byte.parseByte(numero);
System.out.println("Ap�s o parse: ");
System.out.println("Byte: " + numeroPequeno);
System.out.println("Integer: " + numeroMedio);
System.out.println("Double: " + numeroReal);




}


}