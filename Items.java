
public class Items {
   
    private String item_name ;
    private String item_description;
    private boolean digestable;
    private int energy_value; 
    private String inside_Area;
    
    
    
    



    public Items(String item_name,String item_description, boolean digestable,int energy_value, String inside_Area) {
        
        this.item_name = item_name ;
        this.item_description = item_description ;
        this.digestable = digestable ;
        this.energy_value = energy_value ;
        this.inside_Area = inside_Area;
        
    }

    public String inside_Area () {
        return this.inside_Area; 
    }

   

    public boolean is_Digestable () {
        return this.digestable ;
    }

    public String get_item_name() {
        return this.item_name;
    }


    public String get_item_description() {
        return this.item_description;
    }


    public boolean getDigestable() {
        return this.digestable;
    }


    public int get_energy_value () {
        return this.energy_value;
    }



 public static void main(String[] args) {

    
 }   


}
