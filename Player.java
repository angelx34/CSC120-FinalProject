
import java.util.Hashtable;
import java.util.Scanner;

public class Player {

    private int energy_value; // Amount of energy the player has 
    Location current_Location; // The locations the player is allowed to go to  
    private boolean isHolding ; // if the player is holding something or not 
    private boolean hasCrown ; // if the player has the crown or not, need method to check for it in inventory 
    private boolean didYouWinFight ; //start with false 
    private boolean hasKingGloves ;
    private boolean hasKey ; // has the castle key 
    Opponents opponents ; // The monsters the player is fighting. should player communication be here 
    private Hashtable <Items, String > Player_inventory ;
    Scanner items_interact;
    Scanner Go_to_Castle;
    private boolean continue_story ;
    

    
public Player () {
    this.energy_value = 30;
    this.Player_inventory = new Hashtable <Items, String > ();
    this.items_interact = new Scanner (System.in) ;
    this.Go_to_Castle = new Scanner (System.in) ;
    
}


public void lookAround() {
    current_Location.describe() ;
    
    
}

 
 
public void fight(boolean didYouWinFight,Opponents opponents ){
    // incorporate fighting method BINTU, unsure of how to specify which opponent 
  


}



public void befriend(){
//done 
    System.out.println("You decided to befriend " + current_Location().Opponents_table.get(opponents) +"."); 
    
    if( opponents.is_opponent_nice()) {
        System.out.println(" I like you , Here is the key to the CROWN !  "); 
        hasKey = true ;
        System.out.println(" Since you are my friend I will let you in a little secret!!. You just have to say ~ I want to go to Castle ~ and you will see the road to get there. The pesky thing never stay in one place   ");
        System.out.println("So what now ?");
            String Castle_path = Go_to_Castle.nextLine();
                if (Castle_path.equals("I want to go to Castle")) {
                    current_Location= new Castle();
                }else{
                    System.out.println(""+ opponents.opponents_name()+ "looks at you. Well isnt this weird");
                }



    }else {
        System.out.println(" It's VERY presuntious you wanna be my friend.I dont wanna be your friend.If you want the key you have to go throught me first. "); 
    }
 
   
 }
 

public void map() {
    System.out.println(current_Location());
}

public void use(Items i){
    // done
    System.out.println("What item do you want to use ?" );
        String item_use = items_interact.nextLine();


    if(Player_inventory.containsValue(item_use)){
        if (i.is_Digestable()==false){
            energy_value += i.get_energy_value() ;
            System.out.println("You have" + item_use + "in your hands" );
        }else
             System.out.println("You can only eat this !.");
    }else {
       System.out.println("The isnt an item named "+ item_use + "in your inventory " );
    }
 }
 

public void consume (Items i) { 
    // done 
    System.out.println("What do you want to eat.");
        String answer_eat = items_interact.nextLine();


    if (Player_inventory.containsValue (answer_eat)){
        if (i.is_Digestable()){
            energy_value += 10 ;
            System.out.println("Eaten!");
        }else 
            System.out.println("You can't eat this!, throw it away !");
    }else{
        System.out.println("There isn't anything on your inventory named " + answer_eat+ ".");
    }
}



    

 
public void addToInventory(Items items) {
     //then prompt this after wards 
        System.out.println("Do you want to add any of room items to your inventory");
            String answer = items_interact.nextLine();
    if (answer.equals("Yes")||answer.equals("yes")){
        System.out.println("What item do you want to add to your inventory?.");
        System.out.println(current_Location.inventory);//can i just print the values
            if (isHolding ==true) {
                if (current_Location.inventory.containsValue(answer)  ) {
                    this.Player_inventory.put(items,answer);
                    this.isHolding = false; //was thinking of putting the prompt to use or consume
                }else {
                    System.out.println("There isnt any item named" +answer+ "type around  in" + current_Location+ "." );
                }

            }else {
                System.out.println("You dropped what you are holding. Try again to add to your inventory  ");// want to add a loop so that the player can once again add to inventory
                this.isHolding = false; 

            }
    }else{
        continue_story (); //unsureee
    }
        
  
    }
  


public void show_Inventory() {
    //done
    System.out.println(Player_inventory.toString());
}

public void show_Healthlevel(int energy_value) {
     //done
    System.out.println("**Your enegy level is " + energy_value + ". Remember you can always eat to get stronger. !**");
}

public void help() {
    System.out.println ("-- GOLDEN CROWN MANUAL--") ;
    System.out.println ("This is the list of commands that you can use to continue finding the GOLDEN CROWN ") ;
    System.out.println ("start() to start the game ") ;
    System.out.println ("lookAround() to see what you can interact with  ") ;
    System.out.println ("map() to see where you are in the game ") ;
    System.out.println ("fight() to fight with the opponents you encounter") ;
    System.out.println ("use() is to use the items in the games ") ;
    System.out.println ("befriend() instead of fighting you will be friendly to the opponents ") ;
    System.out.println ("consume() is to eat the fruits you find along the way and get stronger") ;
    System.out.println ("grab() to grab an item to add to the inventory ") ;
    System.out.println ("drop() to drop an item to leave behind or after removing from inventory ") ;
    System.out.println ("addtoInventory() add to inventory") ;
    System.out.println ("removefromInventory() remove from invetory ") ;
    System.out.println ("show_Inventory() what do you have in the inventory ") ;
    System.out.println ("show_Health_level() to grab an item to either use or add to the inventory ") ;

}

public boolean continue_story () {
    return this.continue_story;
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
    if (Player_inventory.containsValue("The Crown")) { //unsure
        return this.hasCrown;
      
   }else {
       return false;
   }
}
public boolean hasKey() {
    return this.hasKey;
}
public boolean hasKingGloves() {
    
    if (Player_inventory.containsValue("Magic Gloves")) {
         return this.hasKingGloves;
       
    }else {
        return false;
    }
 }
 




public static void main(String[] args) {

Player player = new Player();
player.Player_inventory= null;
player.fight(false, new Opponents("Steven", "I dont like you", 42, false));
player.consume(new Items("Food","To eat" , true, 10, "inside lemons"));





}

}
