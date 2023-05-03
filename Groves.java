import java.util.Scanner;

public class Groves extends Location {
    
    Scanner believe_Who ;
    Scanner inside_Groves; 
     
    

    public Groves() {
        
       
        
        super("Groves");
        this.believe_Who= new Scanner (System.in);
        this.inside_Groves= new Scanner (System.in);

        //adding to the inventory 
        inventory.put (new Items ("Apples", " Apples are a delicious and REALLY healthy fruit!", true, 10,"inside apple groves"), "The Apples") ;
        inventory.put (new Items (" Rainbow Apples", " Apples who shine but have a strange scent !", true, -100, "inside apples groves"), "The Rainbow Apples") ;
        
       
        //opponents in the groves 
        Opponents_table.put(new Opponents("Edna The Beautiful Witch","HELP ME PLEASE, MY SISTER IS GONNA EAT ME. ",100,false),"The Beautiful Witch ") ;
        Opponents_table.put(new Opponents("Magda The Ugly Witch "," Please understand! She is a dangerous individual ",100,true ),"The Ugly Witch ");
        
    } 

    public void Groves_locations () {  

        System.out.println (" A path opens to an Apple Grove.It is full with delicious apples ready for picking. You hear faint voices  ");
        System.out.println("Do you want to EXAMINE the apples or follow the VOICES?");
        String at_Groves = inside_Groves.nextLine();
        //person can choose to grab apples or follow the voices  
            if (at_Groves.equals("Examine")||at_Groves.equals("examine")) {
                System.out.println(inventory);
                //unfinished should be player. 

            }else if (at_Groves.equals("Voices")||at_Groves.equals("voices")){
                System.out.println ("As you walked closer, you began to understand what the two sisters are arguing about. ");
                System.out.println("The Beautiful Sister is locked in a cage while the ugly sister has the keys.");
                System.out.println(Opponents_table.toString());
                    System.out.println("Who do you believe");
                        String answer_believe_Who = believe_Who.nextLine();
                        if (answer_believe_Who.equals("The Beautiful Sister") || answer_believe_Who.equals("the beautiful sister")) {
                            System.out.println ("Thank you for believing in me. My sister is an evil horrible witch. She is as ugly on the outside as on the inside HAHAHAHA. ");
                            System.out.println("Let me repay you with this Apple.It will give you great strenght to survive your journey");
                            System.out.println ("She picked a blue apple.");
                                
                        }
                        else if (answer_believe_Who.equals("The Ugly Sister") || answer_believe_Who.equals("the ugly sister")) {
                            System.out.println ("Thank you for believing me. Not a lot of people believe in me. You are a human with a good heart");
                            System.out.println ("Do you wanna be friends?");
                                
                                
                        }
                        else  {
                            System.out.println("You need to choose, Dont leave them waiting");
                                
                        }
            }else{

            }
        
            
    
        }
    

    
















    public static void main(String[] args) {

        
       




    
    }


}
