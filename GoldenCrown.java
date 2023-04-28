import java.util.Scanner;
public class GoldenCrown {
    
    
 

    
    Scanner startGame;
    Location location ;
    Player player ; // used to create new player and reference if the player has the crown 


    public void start(Scanner startGame, Player player) {
        System.out.println(" WELCOME TO THE GOLDEN CROWN GAME!");
        System.out.println(" Will you accept the challenge  ");
        System.out.println(" You wake up in a new and strange world. There are two paths that you can go. On the first path you can smell delicious fruits. On the second path you hear waves crashing");
        System.out.println(" Will you go to the Forest or the Beach ! "); 
        //QUEST START



        
        String answer = startGame.nextLine();

        if (answer.equals("The Beach") || answer.equals("The beach")||answer.equals("the beach") ) {
            //not sure how to move on to the beach class 
            
        }
        else if (answer.equals("The Forest") || answer.equals("The forest")||answer.equals("the forest")) {
            // same for this
               
        }
        else {
            System.out.println("You must choose! There aren't other paths, you MUST proceed ");
            
        }
    }
    


    public void win(Player player) {
    
        //if the person has the crown 
        if (player.hasCrown() ) {
            System.out.println("You won!");
        }
    }
    public void death(Player player) {
         //if the person has energy of zero 
        if (player.energy_value()== 0){
            System.out.println("You lost! Restart the game to find the GOLDEN CROWN ");
        }

    }



public static void main(String[] args) {
   







 }   

}
