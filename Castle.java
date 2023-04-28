import java.util.Scanner;


public class Castle extends Location {
    
    
    Scanner Castle_location ;



    
    
    public Castle (String Road_Name, String Road_Adress) {
        this.Road_Name = "Castle " ; 
        this.Road_Adress =  "King's Road ";
        System.out.println ("You are at the Castle where the crown is! Will you go to the King's Room or the Coronation Room  ? ");
        
    } 

    public void Groves_locations (Scanner Castle_location) {

        String answer_Castle = Castle_location.nextLine();
        if (answer_Castle.equals("King's Room ") || answer_Castle.equals("king's room ")) {
            System.out.println("You walk into the King's room. He is dead. Its to grotesque to describe. Go to the other room, there is nothing here ");
            //goes back to the prompt 
            
        }
        else if (answer_Castle.equals("Coronation Room") || answer_Castle.equals("coronation room")) {
            System.out.println("You walk into the coronation room. The room is in complete silence. You have the Crow in front of you!. What do you do. ");
           
             //if player says grab they should change their has a crown to true 
        }
        else  {
            System.out.println("You must choose! There aren't other paths, you MUST proceed ");
            
        }
    } 























    public static void main(String[] args) {



    
    }

}
