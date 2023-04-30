import java.util.Scanner;
public class Beach extends Location{
    
   Scanner inside_Beach;
   

    public Beach() {
        super("Beach" ,  "Beach Road ");
        //add to inventory of location
        this.inventory.add ( new Items ("Magic Sword", " You have found a magic sword, You are now a REALLY formidable opponent !", false, 0)) ;
        this.inventory.add ( new Items ("Old Man's Box ", " This is an a family airloom passed by KIRK's family to store the location of the   !", false, 0)) ;
        //add to hashtable
        Opponents_table.put(new Opponents("Kirk the Golden CROWN guard","OMG A HUMAN ! I havent seen one of you guys for so many years.",50,true ),"The Old Man");
        Opponents_table.put(new Opponents("The Pink Siren","OMG A HUMAN !.",50,false ),"The Siren");
        
    } 


    public void Beach_locations (Scanner inside_Beach) {
        System.out.println ("You are at the Beach. You can see the beautiful blue sea. It can hold many treasures but many have died finding it. You can also see palm trees, someone is waiting for you there! ");
        System.out.println (" Where do you go  ? ") ;
        System.out.println ("  ~ SEA ~  or  ~ PALM TREES ~  ? ") ;

        String answer_Beach = inside_Beach.nextLine();
        if (answer_Beach.equals("Sea") || answer_Beach.equals("sea")) {
            System.out.println("'You go to the sea and begin to swim into the deep blue ocean.You have swun for so long that you entered the Siren's territory. Inside a Pink Coral House you find a Siren's Conch.");
            //
        }
        else if (answer_Beach.equals("Palm Trees") || answer_Beach.equals("palm trees")) {
            System.out.println("'You approach the Palm Trees. The shadow reveals itself. It is an Old Man with a great long beard, like wizard. Do you trust him??'");
              //examine list out everything in the 
              
        }
        else {
        
            System.out.println("You must choose! There aren't other paths, you MUST proceed ");
            
        }
        }
    

















    public static void main(String[] args) {



    
    }




}
