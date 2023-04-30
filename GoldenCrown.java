import java.util.Scanner;



public class GoldenCrown {
    
    
 

    
    Scanner user_input;
    
    Player player ; // used to create new player and reference if the player has the crown 


    
   
    public void start(Scanner user_input, Player player, Location location) {
         
        System.out.println(" WELCOME TO THE GOLDEN CROWN GAME!");
        System.out.println(" Will you accept the challenge ");
        System.out.println(" You wake up in a new and strange world. There are two paths that you can go. On the first path you can smell delicious fruits. On the second path you hear waves crashing");
        System.out.println(" Will you go to the Forest or the Beach ! "); 
        String answer = user_input.nextLine();
        //QUEST START



        if (answer.equals("The Beach") || answer.equals("The beach")||answer.equals("the beach") ) {
             player.current_Location= new Location("The Beach", "Beach Road");
             System.out.println(location.toString());
             
        }   

        else if (answer.equals("The Forest") || answer.equals("The forest")||answer.equals("the forest")) {
            player.current_Location= new Location("Groves", "Grove Road");
            System.out.println(location.toString());
               
        }
        else {
            System.out.println("You must choose! There aren't other paths, you MUST proceed ");
            
        }
    }
    


    public void win(Player player) {
    
        //if the person has the crown AND the gloves so it doesnt kill them 
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
