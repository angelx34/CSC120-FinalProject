
import java.util.Hashtable;
import java.util.Scanner;

public class Player {

    private int energy_value; // Amount of energy the player has 
    Location current_Location; // The locations the player is allowed to go to  
    private boolean isHolding ; // if the player is holding something or not 
    private boolean hasCrown ; // if the player has the crown or not, need method to check for it in inventory 
    private boolean didYouWinFight ; //start with false 
    private boolean hasKey ; // has the castle key 
    Opponents opponents ; // The monsters the player is fighting. should player communication be here 
    private Hashtable <Items, String > Player_inventory ;
    Scanner pick_up;

    
public Player (Hashtable <Items, String > Player_inventory) {
    this.energy_value = 30;
    this.Player_inventory = new Hashtable <Items, String > (Player_inventory);
    
}

//look around to see what items are available , need to reference the to string methods from location and opponents 


public void lookAround(Opponents opponents, Hashtable<Items,String>inventory) {
    String inventoryString = inventory.toString();
    String opponentsString = opponents.toString();
    if (opponentsString.length() > 0) {
        System.out.println("You look around and this is what you see: " + opponentsString); 
    } else if (inventoryString.length() > 0) {
        System.out.println("You look around and spot these items: " + inventoryString);
    } else {
        System.out.println("You currently observe nothing nearby.");
    }
    
}






public void fight(boolean didYouWinFight,int energy_value,Opponents opponents ){
    /* substract from the player the difference between their energy level and the opponents energy level 
    @param boolean didYouWinFigh
    @param int energy_value
    @param Opponents opponents 
     */

    didYouWinFight = false ;

    //have to figure out how to mention the actual opponent 
    if (energy_value<= opponents.opponent_energy_value()) {
        this.energy_value -= opponents.opponent_energy_value() ;
    } else {
        didYouWinFight = true ;
        hasKey = true ;
    }
     


}
public void befriend(Opponents opponents){
    /* would prompt for the conversation of the opponent
    @param Opponents opponents
    */
    System.out.println("You decided to befriend " + opponents.opponents_name() +".");  
    System.out.println(opponents.opponent_commentary()) ;

    if( opponents.is_opponent_nice()) {
        System.out.println("Here is the key to the CROWN !");  
        hasKey = true ;
    }else {
        
    }

    //if statement that results in this.player_inventory.add if they become your friends  
}


public void map() {
    System.out.println(current_Location());
}

public void use(Items i, String string){
    //  add nondigestables item to our energy level because they give us strenght 
    if (i.is_Digestable()==false){
        energy_value += i.get_energy_value() ;
        System.out.println("You have" + string + "in your hands" );
    }else 
    System.out.println("You can only eat this !.");
 



}




public void consume (Items i ) { 
    /*If the player is allowed to eat something or not
    @param Items i
    */
    if (i.is_Digestable()){
        energy_value += 10 ;
        System.out.println("Eaten!");
    }else 
    System.out.println("You can't eat this!, throw it away !");

}




public void grab(Items i , String string) {
    //This method allows the player to be able to grab things, what do you wanna grab 
    if (this.isHolding == false) { 
        System.out.println("You grab " + string +".");
        System.out.println("**You are holding " + string + ".**");
        System.out.println("Will you add it to inventory ?");
        this.isHolding = true;
    }else if (this.isHolding == true) {
        System.out.println("You are already holding something. Drop it first before you can grab something else!");
    }
}
    
public void drop(Items i, String string) {
    //This method allow the player to drop things they have grabbed, what do you wanna drop?
    if (this.isHolding == true) { 
        System.out.println("You drop " + string +".");
        System.out.println("**You have dropped " + string + ".**");
        System.out.println("What next?");
        this.isHolding = false;
    } else if (this.isHolding == false) {
        System.out.println("You are already holding something. Drop it first before you can grab something else!");
    }
} 
 
public void addToInventory(Items items, String string, Scanner pick_up ) {
    //This method allows the player to store things in their inventory , what do you wanna add , needs a scanner needs to check 

    System.out.println("Added " + items +" to the inventory.");
    this.Player_inventory.put(items,string);

    }
    
public void removeFromInventory(Items items, String string) {
    //This method allows the player to remove things from their inventory 
    System.out.println("Removed " + string +" from inventory.");
        Player_inventory.remove(items,string);
        System.out.println(Player_inventory.get(items)); 
      }
        

// how to do it in a hashtable
public void show_Inventory(Items i, String string) {
    Player_inventory.toString();
}

public void show_Healthlevel(int energy_value) {
    System.out.println("**Your enegy level is " + energy_value + ". Remember you can always eat to get stronger. !**");
}

public void help() {
    System.out.println ("-- GOLDEN CROWN MANUAL--") ;
    System.out.println ("This is the list of commands that you can use to continue finding the GOLDEN CROWN ") ;
    System.out.println ("start() to start the game  ") ;
    System.out.println ("lookAround() to see what you can interact with  ") ;
    System.out.println ("map() to see where you are in the game ") ;
    System.out.println ("fight() to fight with the opponents you encounter") ;
    System.out.println ("use() is to use the items in the games ") ;
    System.out.println ("befriend() instead of fighting you will be friendly to the opponents ") ;
    System.out.println ("consume() is to eat the fruits you find along the way and get stronger") ;
    System.out.println ("grab() to grab an item to either use or add to the inventory ") ;
    System.out.println ("drop() to drop an item to leave behind or after removing from inventory ") ;
    System.out.println ("addtoInventory() add to inventory") ;
    System.out.println ("removefromInventory() remove from invetory ") ;
    System.out.println ("show_Inventory() what do you have in the inventory ") ;
    System.out.println ("show_Health_level() to grab an item to either use or add to the inventory ") ;

}



public int energy_value() {
    return this.energy_value;
}

public Location current_Location() {
    return this.current_Location;
}

public boolean getdidYouWinFight() {
    return this.didYouWinFight;
}

public boolean hasCrown() {
    return this.hasCrown;
}
public boolean hasKey() {
    return this.hasKey;
}

public static void main(String[] args) {

/* Hashtable<Items,String> opponent_inventory = new Hashtable<Items,String>();
Opponents opponents = new Opponents("Dragon", "I'm going to burn you to a crisp!", 50, false, opponent_inventory);
Hashtable<Items, String> inventory = new Hashtable<Items, String>();
Items sword = new Items("Sword", "This is a very sharp sword", false, 0);
inventory.put(sword, "This is a very sharp sword");



Player player = new Player();
player.lookAround(opponents, inventory);
 */

}

}
