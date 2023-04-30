


public class Opponents {
    
    //should make a hastable with the opponents names and stuff hastable of type opponent 
    
    private String opponents_name ;
    String opponent_commentary;
    private int opponent_energy_value ;
    private boolean is_opponent_nice; //will the opponent be friendly, add bintu idea 
    
    
    
    
    public Opponents (String opponents_name,String opponent_commentary,int opponent_energy_value, boolean is_opponent_nice) {
        this.opponents_name = opponents_name ;
        this.opponent_commentary = opponent_commentary ;
        this.is_opponent_nice = is_opponent_nice ;
        this.opponent_energy_value = opponent_energy_value ;
    
    }

   
    
    // make  a method to exchange the key 




    



    public int opponent_energy_value() {
        return this.opponent_energy_value; 
    }

    public String opponents_name() {
        return this.opponents_name; 
    }

    public String opponent_commentary() {
        return this.opponent_commentary; 
    }

    public boolean is_opponent_nice() {
        return this.is_opponent_nice; 
    }

    public static void main(String[] args) {



    

    }
}
