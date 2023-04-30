import java.util.Scanner;
public class Groves extends Location {
    
    Scanner inside_Groves ;
    Scanner believe_Who ;
     
    

    public Groves() {
        super("Groves", "Groves Road ");
        //adding to the inventory 
        inventory.put (new Items ("Peaches", "Peaches are a delicious smelling fruit!", true,10 ),"The Peaches") ;
        inventory.put (new Items ("Apples", " Apples are a delicious and REALLY healthy fruit!", true, 10), "The Apples") ;
        inventory.put (new Items (" Rainbow Apples", " Apples who shine!", true, -100), "The Rainbow Apples") ;
        inventory.put (new Items ("Lemons", "It is a tangy but sour yellow fruit !", true, 10),"The Lemons");
       
        //opponents in the groves 
        Opponents_table.put(new Opponents("Edna The Beautiful Witch","HELP ME PLEASE, MY SISTER IS GONNA EAT ME. ",100,false),"The Okay Witch") ;
        Opponents_table.put(new Opponents("Magda The Okay Witch ","Please understand! She is a dangerous individual ",100,true ),"The Okay Witch");

    } 

    public void Groves_locations (Scanner inside_Groves, Opponents opponents) {  

        System.out.println ("You are in an open field. There are three paths. The first path is filled with lemons but if you listen very carefully you can hear two voices shouting at each other. The second path is a peach groves, it might smell delicious! but you hear growling. Lastly the third is filled with apples, strangely enough you hear nothing. Where do you go ~Lemon Groves~ or ~Apple Groves~? ");
        
        String answer_Groves = inside_Groves.nextLine();
        if (answer_Groves.equals("Lemon Groves") || answer_Groves.equals("lemon groves")) {
            System.out.println("You are in the Lemon Groves. There are many ripe lemons around. At the end of the path there are two sisters arguing: the beautiful one is locked in a cage while the ugly sister has the keys.");
            //the player should lookaround then get their commentary 
            Player.lookAround(opponents, inventory);

            
        }
        else if (answer_Groves.equals("Apple Groves") || answer_Groves.equals("apple groves")) {
            System.out.println("You are in Apple Groves. There are many ripe Apples around. As you walk throught The Apple Groves, the infected apples you can see. At the end, you see a gray decayed tree full of infected apples  . ");
            System.out.println("On the tree there is a carved message that says BEWARE THE SILENT KILLER WHO POISON OUR WORLD!!!  . ");

            // i want the player to be able to turn back after this to the original prompt
             
        }
        else  {
            System.out.println("You must choose! There aren't other paths, you MUST proceed ");
            
        }
    } 

    public void Conversation_w_sisters(Scanner believe_Who ) {  

        System.out.println ("They look at you. Who's plea do you believe ");
        
        String answer_believe_Who = believe_Who.nextLine();
        if (answer_believe_Who.equals("The Beautiful Sister") || answer_believe_Who.equals("the beautiful sister")) {

            
        }
        else if (answer_believe_Who.equals("The Ugly Sister") || answer_believe_Who.equals("the ugly sister")) {
           
            
             
        }
        else  {
            System.out.println("You need to choose, Dont leave them waiting");
            
        }
    } 

















    public static void main(String[] args) {

        





    
    }


}
