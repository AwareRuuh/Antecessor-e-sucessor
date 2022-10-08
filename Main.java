import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
  Scanner ler = new Scanner(System.in);
    int numInteiro, sucessor, antecessor;
    int a = 2;
  System.out.print("Informe o seu valor: ");
  numInteiro = ler.nextInt();
    sucessor = numInteiro + 1;  
    antecessor = numInteiro - 1;  
  System.out.println("O sucessor do seu valor: " + sucessor);  
  System.out.println("O antecessor do seu valor: " + antecessor);
  System.out.println("O meu valor é: "+a);
}
  }