import java.util.Scanner;
public class Beach extends Location{
    
   Scanner inside_Beach;
   

    public Beach() {
        super("Beach" ,  "Beach Road ");
        this.inventory.add ( new Items ("Magic Sword", " You have found a magic sword, You are now a REALLY formidable opponent !", false, 0)) ;
        
    } 


    public void Beach_locations (Scanner inside_Beach) {
        System.out.println ("You are at the Beach. You can see the beautiful blue sea. It can hold many treasures but many have died finding it. You can also see palm trees, someone is waiting for you there! ");
        System.out.println (" Where do you go  ? ") ;
        System.out.println ("  ~ SEA ~  or  ~ PALM TREES ~  ? ") ;

        String answer_Beach = inside_Beach.nextLine();
        if (answer_Beach.equals("Sea") || answer_Beach.equals("sea")) {
            System.out.println("'You go to the sea and begin to swim into the deep blue ocean. At the bottom you find a Siren's Conch. Will you take it?");
            
        }
        else if (answer_Beach.equals("Palm Trees") || answer_Beach.equals("palm trees")) {
            System.out.println("'You approach the Palm Trees. The shadow reveals itself. It is an Old Man with a great long beard, like wizard. Do you trust him??'");
            return;   //should show the opponent commentary for the old man 
        }
        else {
        
            System.out.println("You must choose! There aren't other paths, you MUST proceed ");
            return;
        }
        }
    

















    public static void main(String[] args) {



    
    }




}
