import java.util.Scanner;


public class Castle extends Location {
    
    
    Scanner Castle_location ;
   


    public Castle () {
      super("Castle",  "King's Road ");
      //add to location inventory 
      inventory.put ( new Items ("The Crown", " This is the CROWN, the CROWN of unlimited power !", false, 0),"The Crown" ) ;
      inventory.put ( new Items ("Magic Gloves", " These are the King's gloves against the terrible fungi !", false, 0), "The Magic Gloves") ;


      //add to opponents hastable
      Opponents_table.put(new Opponents("The King","... !.",0,true ),"The King's Corpse");
      Opponents_table.put(new Opponents("The Carnivorous Fungi","... !.",10000000,false ),"The Colorful Mold");

    } 

    public void Can_Player_Come_in(Player player) {

        if (player.hasKey()== true){
        System.out.println ("You are at the Castle where the crown is!. There is a strange silence and an awful stench everywhere. It is a beautiful castle that was one lively. There are two doors each have a label. Will you go to the King's Room or the Coronation Room  ? ");
    }else {
        System.out.println ("You don't have the key.");
    
    }}


    public void Castle_locations (Scanner Castle_location) {

    
        String answer_Castle = Castle_location.nextLine();
        if (answer_Castle.equals("King's Room ") || answer_Castle.equals("king's room ")) {
            System.out.println("You walk into the King's room. He is dead. His corpse is covered in a strange colorful fungi.Its to grotesque to describe. His whole body was decomposed by the fungi except his gloves  ");
             
            //the logical prompt is to examine and then they must choose which item to interact / still makes me think that i need the hashtable so they can name whta they want in the grab 
            
        }
        else if (answer_Castle.equals("Coronation Room") || answer_Castle.equals("coronation room")) {
            System.out.println("You walk into the coronation room. The room is in complete silence. You have the Crown in front of you! There is a strange and colorful fungi covering it. Will you grab it!  ");
            
            
        }
        else  {
            System.out.println("You must choose! There aren't other paths, you MUST proceed ");
            
        }
    } 























    public static void main(String[] args) {



    
    }

}
