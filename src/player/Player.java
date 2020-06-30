
package player;

import java.util.Scanner;

public class Player {

   
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        Lista player = new Lista();
        int opc = 0;
        No aux;
        
        player.insere("The rising sun");
        player.insere("Somewhere over the rainbow");
        player.insere("Stairway to heaven");
        player.insere("Nothing else matter");
        player.insere("Anothe brick in the wall");
        
        
        do{
            System.out.println("*****Music Player*****");
            System.out.println("");
            System.out.println("1.....Play");
            System.out.println("2.....Stop");
            System.out.println("3.....Pause");
            System.out.println("4.....Forward");
            System.out.println("5.....Rewind");
        
            opc = scn.nextInt();
            scn.nextLine();
            
            switch(opc){
                case 1:
                   player.exibeMusica();
                   break;
                case 3:
                    player.pause();
                    break;
                case 4:
                  
                case 5:
            }
            
            
        }while(opc != 2);
        System.out.println("Fechando o player");
        
        
        
    }
    
}
