import java.util.ArrayList;
import java.util.Hashtable;


public class Location{

protected String Road_Name; 
protected  String Road_Adress;
protected ArrayList<Items> inventory ;
protected Hashtable<Opponents,String> Opponents_table;



public Location(String Road_Name, String Road_Adress) {
    this.Road_Name = Road_Name; 
    this.Road_Adress =  Road_Adress;
    this.inventory =  new ArrayList<Items> (inventory) ;
    this.Opponents_table = new Hashtable<Opponents,String>(Opponents_table) ;
    //put and the parameters i set for opponent will show up in each subclass
    
} 

public Location() {
    this("<Name Unknown>", "<Address Unknown>");
}









public String getRoad_Name() {
    return this.Road_Name;
}

public String getAddress() {
return this.Road_Adress;
}


public String toString() {
    return " You are in the " + this.Road_Name+ " in  the " + this.Road_Adress+ ".";
}


public static void main(String[] args) {




}

}