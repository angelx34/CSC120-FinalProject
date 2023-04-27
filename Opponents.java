public class Opponents {
    
    
    Location current_Location;
    private String opponents_name ;
    int opponent_energy_value ;
    boolean hasPuzzle ;
    private int puzzle_Answer ;
    String opponent_commentary; 
    private boolean is_opponent_nice; //will the opponent be friendly 
    
    public Opponents (String opponents_name,String opponent_commentary,boolean hasPuzzle, Location current_Location,int puzzle_Answer, boolean is_opponent_nice ) {
        this.opponents_name = opponents_name ;
        this.opponent_commentary = opponent_commentary ;
        this.puzzle_Answer = puzzle_Answer ;
        this.is_opponent_nice = is_opponent_nice ;
        
    
    }



    public String getOpponents_name() {
        return this.opponents_name; 
    }

    public String getopponent_commentary() {
        return this.opponent_commentary; 
    }

    public int getpuzzle_Answer() {
        return this.puzzle_Answer; 
    }

    public boolean getHasPuzzle() {
        return this.hasPuzzle; 
    }


    public static void main(String[] args) {



    

    }
}
