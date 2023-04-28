import java.util.Hashtable;



public class Player {
   
    private int energy_value; // Amount of energy the player has 
    Location current_Location; // The locations the player is allowed to go to  
    private boolean isHolding ; // if the player is holding something or not 
    private boolean hasCrown ; // if the player has the crown or not, need method to check for it in inventory 
    private boolean didYouWinFight ; //start with false 
    Opponents opponents ; // The monsters the player is fighting 

    
public Player () {
    this.energy_value = 10;
    
    
    
}

public void fight(boolean didYouWinFight,int energy_value,Opponents opponents ){
    /* substract from the player the difference between their energy level and the opponents energy level 
    @param boolean didYouWinFigh
    @param int energy_value
    @param Opponents opponents 
     */

    didYouWinFight = false ;

    if (energy_value<= opponents.opponent_energy_value) {
        this.energy_value -= opponents.opponent_energy_value ;
    }else {
        didYouWinFight = true ;
    }
     
   
}
public void befriend(Opponents opponents){
    /* would prompt for the conversation of the opponent
    @param Opponents opponents
    */
    System.out.println("You decided to befriend " + opponents.getOpponents_name() +"."); //not sure if calling the getter works 
    System.out.println(opponents.getopponent_commentary()) ;
}



public void use(){
    // How long should we use something (conch)
    
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
public void fullStomach(int energy_value){
    //restrict the energy level to 100 
    if (energy_value <= 100){
        System.out.println("Eaten!");
    }else 
    System.out.println("You are too full, you can't eat anymore !");

}


public void grab(Items i) {
    //This method allows the player to be able to grab things 
    if (this.isHolding == false) { 
        System.out.println("You grab " + i +".");
        System.out.println("**You are holding " + i + ".**");
        System.out.println("What next ?");
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

public void addToInventory(int n, Items items  ) {
    //This method allows the player to store things in their inventory 
    System.out.println("Added " + items +" to the inventory.");
    this.Player_inventory.put(n, items);

    }
    
public Items removeFromInventory(int n, Items items) {
    //This method allows the player to remove things from their inventory 
    System.out.println("Dropped " + items +" to the inventory.");
        this.Player_inventory.remove(n, items);
        return items;
      }
        


public void show_Inventory(Items i) {
    System.out.println(i);
}

public void show_Healthlevel(int energy_value) {
    System.out.println("**Your enegy level is " + energy_value + ". Remember you can always eat to get stronger. !**");
}

public int energy_value() {
    return this.energy_value;
}



public boolean getdidYouWinFight() {
    return this.didYouWinFight;
}

public boolean hasCrown() {
    return this.hasCrown ;
}


public static void main(String[] args) {



    

}

}
