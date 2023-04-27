
public class Items {
   
    private String item_name ;
    private String item_description;
    private boolean digestable;
    private int energy_value; 
    
    
    
    



    public Items(String item_name,String item_description, boolean digestable,int energy_value ) {
        
        this.item_name = item_name ;
        this.item_description = item_description ;
        this.digestable = digestable ;
        this.energy_value = energy_value ;
        
    }


   

    public boolean is_Digestable () {
        return this.digestable ;
    }

    public String getItem_name() {
        return this.item_name;
    }


    public String getItem_description() {
        return this.item_description;
    }


    public boolean getDigestable() {
        return this.digestable;
    }


    public int getEnergy_Value () {
        return this.energy_value;
    }



 public static void main(String[] args) {

    Items Peaches = new Items ("Peaches", "Peaches are a delicious smelling fruit!", true,10 ) ;
    System.out.println(Peaches.item_name); 
    Items Lemons = new Items ("Lemons", "It is a tangy but sour yellow fruit !", true, 10) ;
    System.out.println(Lemons.item_name); 
    Items Apples = new Items ("Apples", " Apples are a delicious and REALLY healthy fruit!", true, 10) ;
    System.out.println(Apples.item_name); 
    Items magicSword = new Items ("Magic Sword", " You have found a magic sword, You are now a REALLY formidable opponent !", false, 0) ;
    System.out.println(magicSword.item_name); 
 }   


}
