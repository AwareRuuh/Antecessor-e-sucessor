import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
  Scanner ler = new Scanner(System.in);
    int numInteiro, sucessor, antecessor, numint=1, suces, ant;
    int a = 2;
    System.out.println("Você quer inserir seu valor? [1] Sim ou [2] Não: ");
    int DecisionInt = ler.nextInt();
    String Decision = "";

     if (DecisionInt == 1) {
        System.out.print("Informe o seu valor: ");
        numInteiro = ler.nextInt();
        sucessor = numInteiro + 1;  
        antecessor = numInteiro - 1;  
         System.out.println("O sucessor do seu valor: " + sucessor);  
         System.out.println("O antecessor do seu valor: " + antecessor);
    } else if (DecisionInt == 2) {
        System.out.println("O meu valor é: "+a);
        suces = numint + 1;
        ant = numint - 1;
         System.out.println("O sucessor do meu valor é: " + suces);  
         System.out.println("O antecessor do meu valor é: " + ant);
    }
}
  }