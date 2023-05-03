import java.util.Scanner;



public class GoldenCrown {
    
    
 

    
    Scanner user_input;
    
    Player player ; // used to create new player and reference if the player has the crown 


    
    public GoldenCrown () {
        this.player = new Player() ;
        this.user_input = new Scanner (System.in);
    }
   
    public void start() {
         
        System.out.println(" WELCOME TO THE GOLDEN CROWN GAME!");
        System.out.println(" Will you accept the challenge ");
        System.out.println(" You wake up in a new and strange world. There are two paths that you can go. On the first path you can smell delicious fruits. On the second path you hear waves crashing");
        System.out.println(" Will you go to Forest or Beach ! "); 
        
        String answer = user_input.nextLine();
        //QUEST START



        if (answer.equals("Beach") || answer.equals("The beach")||answer.equals("the beach") ) {
             player.current_Location= new Beach();
             System.out.println(player.current_Location);
             player.lookAround(); 
             
             
        }   

        else if (answer.equals("The Forest") || answer.equals("The forest")||answer.equals("the forest")) {
            player.current_Location= new Groves();
            System.out.println(player.current_Location);
            player.lookAround(); 
        }
        else {
            System.out.println("You must choose! There aren't other paths, you MUST proceed ");
            
        }
    }
    


    public void win() {
    
        //if the person has the crown AND the gloves so it doesnt kill them 
        if (player.hasCrown()|player.hasKingGloves()) {
            System.out.println("You won!. You saved the land! Restart the game to find once again THE GOLDEN CROWN ");
        }else {
            System.out.println("You can't grab the crown without MAGIC GLOVES.Find them first ");
        }
    }
    public void death() {
         //if the person has energy of zero 
        if (player.energy_value()== 0){
            System.out.println("You lost! Restart the game to find the GOLDEN CROWN ");
        }

    }



public static void main(String[] args) {
   
    GoldenCrown game = new GoldenCrown();
    game.start();
    Groves insideGroves = new Groves();
    insideGroves.Groves_locations ();
    Beach insideBeach = new Beach();
    insideBeach.Beach_locations ();
    
 }   

}
