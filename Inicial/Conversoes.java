class Conversoes{

public static void main(String args[]){

// Conversão implicita => o Java faz pra você (dado menor em um espaço maior)
// Dados do mesmo tipo
// byte < short < int < long

byte numeroPequeno = 5;
long numeroGrande = numeroPequeno;
System.out.println(numeroGrande);

// Conversão explicita (Cast) => você tem que mostrar quem manda (dado maior em um espaço menor)
double numeroReal = 1.57;
int numeroMedio = (int) numeroReal; 
System.out.println(numeroMedio);

// Vai dar erro de incompatibilidade se não tiver o cast, tem que colocar o (int) para força o maior no menor

// Conversão entre dados incompatíveis => Parse
// Classes Wrappers => são classes que apoiam tipos primitivos
// int => Integer ; double => Double ; float => Float (...)
// Browser manipula String - numero em web tem que parsear pq vem em formato String

String numero = "7";
numeroMedio = Integer.parseInt(numero);
numeroReal = Double.parseDouble(numero);
numeroPequeno = Byte.parseByte(numero);
System.out.println("Após o parse: ");
System.out.println("Byte: " + numeroPequeno);
System.out.println("Integer: " + numeroMedio);
System.out.println("Double: " + numeroReal);




}


}