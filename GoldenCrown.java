import java.util.Scanner;
public class GoldenCrown {
    
    
 

    
    Scanner startGame;
    Player energy_value ;
    Location location ;
    Player player ; // used to create new player 


    public void StartGoldenCrown(Scanner startGame, Player player) {
        System.out.println(" WELCOME TO THE GOLDEN CROWN GAME!");
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
    


    public void win() {
    }
        //if the person has the crown 
    public void death() {
         //if the person has energy of zero 
    }



public static void main(String[] args) {
   







 }   

}
