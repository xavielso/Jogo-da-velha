
package pjogodavelha;
import java.util.Scanner;
public class PjogoDaVelha {
  static  String[][] tabuleiro = new String[3][3];
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int lin = 0, col = 0,j = 1;
boolean confere = true,t;
        Inserir();
        mostrar();
     do{
         System.out.println("Vez do jogador "+ j );
         if(j == 1){
         System.out.print("\nQual linha?");
         lin = ler.nextInt();
         System.out.print("Qual coluna?");
         col = ler.nextInt();
          j++;   
         }else{
         System.out.print("\nQual linha?");
         lin = ler.nextInt();
         System.out.print("Qual coluna?");
         col = ler.nextInt();
          j--;
         }
         confere = Conferir(lin-1,col-1, j);
        t = Validar(confere);
         mostrar();
       
     }while(t);     
    }   
    public static void mostrar() {
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tabuleiro[i][j] + "|");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("  " + (i + 1));
        }
        System.out.println("\n");
    }  
    public static void Inserir(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = "*";
            }
        }
    }
    public static boolean Validar(boolean confere){
        String[] r= new String[2]; int jogador= 1;
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 2; k++) {
            r[i] = tabuleiro[i] [k];
                System.out.println(r[i]);
                System.out.println(i);
   //         if(r.equals(r[1]) && r[1].equalsIgnoreCase("*")){
               if(r[0].equals(r[2])){
                System.out.println("passou1"+r[i]);
                if (r[1].equals(r[2])){
                    System.out.print("JOGADOR"+jogador+" GANHOU");
                    System.out.println("passou2"+r[i]);
                    confere = false;
               }
                }else{
                confere = true;
            }
          }
        }               
      return confere;
    }
    public static boolean Conferir(Integer lin,Integer col, int j){
     if(lin <= 2 && col <=2 && tabuleiro[lin][col].equals("*")){
         if(j == 1){
             tabuleiro[lin][col] = "#";
             return true;
         }else{
             tabuleiro[lin][col] = "0";
        return true;    
         }
     }else{
         return false;
     }
  }
}
