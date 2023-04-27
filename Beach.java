import java.util.Scanner;
public class Beach extends Location{
    
   Scanner inside_Beach;
   

    public Beach() {
        this.Road_Name = "Beach" ; 
        this.Road_Adress =  "Beach Road ";
        System.out.println ("You are at the Beach. You can see the beautiful blue sea. It can hold many treasures but many have died finding it. You can also see palm trees, someone is waiting for you there! ");
        System.out.println (" Where do you go  ? ") ;
        System.out.println ("  ~ SEA ~  or  ~ PALM TREES ~  ? ") ;
        
    } 
    public void Beach_locations (Scanner inside_Beach) {

        String answer_Beach = inside_Beach.nextLine();
        if (answer_Beach.equals("Sea") || answer_Beach.equals("sea")) {
            System.out.println("'You go to the sea and begin to swim into the deep blue ocean. At the bottom you find a Siren's Conch. You take it to the surface. What do you do ?'");
            
        }
        else if (answer_Beach.equals("Palm Trees") || answer_Beach.equals("palm trees")) {
            System.out.println("'You approach the Palm Trees. The shadow reveals itself. It is an Old Man with a great long beard, like wizard ??'");
            return;   
        }
        else {
            System.out.println("The villager stares at you and slowly closes the door.");
            System.out.println("Quest failed! The villager was too weirded out by your silence to give you a quest.");
            return;
        }
    } 

















    public static void main(String[] args) {



    
    }




}
