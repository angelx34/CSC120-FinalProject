import java.util.Scanner;
public class Groves extends Location {
    
    Scanner inside_Groves ;
     
    

    public Groves() {
        super("Groves", "Groves Road ");
        //adding to the inventory 
        this.inventory.add ( new Items ("Peaches", "Peaches are a delicious smelling fruit!", true,10 )) ;
        this.inventory.add (new Items ("Apples", " Apples are a delicious and REALLY healthy fruit!", true, 10)) ;
        this.inventory.add (new Items (" Rainbow Apples", " Apples who shine!", true, -100)) ;
        this.inventory.add (new Items ("Lemons", "It is a tangy but sour yellow fruit !", true, 10) );
        //opponents in the groves 
        Opponents_table.put(new Opponents("Edna the Devious Witch","HELP ME PLEASE, MY SISTER IS GONNA EAT ME. ",100,false ),"The Beautiful Witch");
    } 

    public void Groves_locations (Scanner inside_Groves) {  

        System.out.println ("You are in an open field. There are three paths. The first path is filled with lemons but if you listen very carefully you can hear two voices shouting at each other. The second path is a peach groves, it might smell delicious! but you hear growling. Lastly the third is filled with apples, strangely enough you hear nothing. Where do you go ~Lemon Groves~ or ~Apple Groves~? ");
        
        String answer_Groves = inside_Groves.nextLine();
        if (answer_Groves.equals("Lemon Groves") || answer_Groves.equals("lemon groves")) {
            System.out.println("You are in the Lemon Groves. There are many ripe lemons around. At the end of the path there are two sisters arguing: the beautiful one is locked in a cage while the ugly sister has the keys.  ");
            //to string 
        }
        else if (answer_Groves.equals("Apple Groves") || answer_Groves.equals("apple groves")) {
            System.out.println("You are in Apple Groves. There are many ripe Apples around. As you walk throught The Apple Groves, the infected apples you can see. At the end, you see a gray decayed tree full of infected apples  . ");
           //
             
        }
        else  {
            System.out.println("You must choose! There aren't other paths, you MUST proceed ");
            
        }
    } 



















    public static void main(String[] args) {

        





    
    }


}
