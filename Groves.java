import java.util.Scanner;
public class Groves extends Location {
    
    Scanner inside_Groves ;
     
    

    public Groves() {
        super("Groves", "Groves Road ");
        System.out.println ("You are in an open field. There are three paths. The first path is filled with lemons but if you listen very carefully you can hear two voices shouting at each other. The second path is a peach groves, it might smell delicious! but you hear growling. Lastly the third is filled with apples, strangely enough you hear nothing. Where do you go ~Lemon Groves~ or ~Apple Groves~? ");
        this.inventory.add ( new Items ("Peaches", "Peaches are a delicious smelling fruit!", true,10 )) ;
    } 

    public void Groves_locations (Scanner inside_Groves) { // unsure of how to change the 

        String answer_Groves = inside_Groves.nextLine();
        if (answer_Groves.equals("Lemon Groves") || answer_Groves.equals("lemon groves")) {
            System.out.println("You are in the Lemon Groves. There are many lemons around that you can eat. At the end of the path there are two sisters arguing: the beautiful one is locked in a cage while the ugly sister has the keys ");
            //should show the commentary for the beautiful sister 
        }
        else if (answer_Groves.equals("Apple Groves") || answer_Groves.equals("apple groves")) {
            System.out.println("You are in Apple Groves. There are many fruits around that you can eat. There is nothing here, only apples. ");
           
            return ; // go back to prompt 
        }
        else  {
            System.out.println("You must choose! There aren't other paths, you MUST proceed ");
            return;
        }
    } 




    

















    public static void main(String[] args) {

        





    
    }


}
