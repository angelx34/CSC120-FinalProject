import java.util.ArrayList;



public class Player {
   
    private int energy_value; // Amount of energy the player has 
    Location current_Location; // The locations the player is allowed to go to  
    private boolean isHolding ; // if the player is holding something or not 
    private boolean hasCrown ; // if the player has the crown or not, need method to check for it in inventory 
    private boolean didYouWinFight ; //start with false 
    private boolean hasKey ; //start with false 
    Opponents opponents ; // The monsters the player is fighting. should player communication be here 
    private ArrayList<Items> Player_inventory ;
//have to make something that check if it has 
    
public Player () {
    this.energy_value = 30;
    this.Player_inventory = new ArrayList<Items>(Player_inventory);
    
}

//look around to see what items are available 




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
    }else {
        didYouWinFight = true ;
    }
     


}
public void befriend(Opponents opponents){
    /* would prompt for the conversation of the opponent
    @param Opponents opponents
    */
    System.out.println("You decided to befriend " + opponents.opponents_name() +".");  
    System.out.println(opponents.opponent_commentary()) ;


    //if statement that results in this.player_inventory.add if they become your friends  
}




public void  map() {
    System.out.println(current_Location());
}

public void use(){
    // How long should we use something add nondigestables item to our energy level because they give us strenght 
    



}




public void consume (Items i ) { 
    /*If the player is allowed to eat something or not
    @param Items i
    */
    if (i.is_Digestable()){
        energy_value += 10 ;
    }else 
    System.out.println("You can't eat this!, throw it away !");

}




public void grab(Items i) {
    //This method allows the player to be able to grab things 
    if (this.isHolding == false) { 
        System.out.println("You grab " + i +".");
        System.out.println("**You are holding " + i + ".**");
        System.out.println("Will you add it to inventory ?");
        this.isHolding = true;
    }else if (this.isHolding == true) {
        System.out.println("You are already holding something. Drop it first before you can grab something else!");
    }
}
    
public void drop(Items i) {
    //This method allow the player to drop things they have grabbed
    if (this.isHolding == true) { 
        System.out.println("You drop " + i +".");
        System.out.println("**You have dropped " + i + ".**");
        System.out.println("What next?");
        this.isHolding = false;
    }else if (this.isHolding == false) {
        System.out.println("You are already holding something. Drop it first before you can grab something else!");
    }
} 
 
public void addToInventory(Items items) {
    //This method allows the player to store things in their inventory 
    System.out.println("Added " + items +" to the inventory.");
    this.Player_inventory.add(items);

    }
    
public Items removeFromInventory(Items items) {
    //This method allows the player to remove things from their inventory 
    System.out.println("Removed " + items +" from inventory.");
        this.Player_inventory.remove(items);
        return items;
      }
        


public void show_Inventory(Items i) {
    System.out.println(i);
}

public void show_Healthlevel(int energy_value) {
    System.out.println("**Your enegy level is " + energy_value + ". Remember you can always eat to get stronger. !**");
}

public void help() {
    System.out.println ("-- GOLDEN CROWN MANUAL--") ;
    System.out.println ("This is the list of commands that you can use to continue finding the GOLDEN CROWN ") ;
    System.out.println ("start() to start the game  ") ;
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
    return this.hasCrown ;
}
public boolean hasKey() {
    return this.hasKey ;
}

public static void main(String[] args) {



    

}

}
