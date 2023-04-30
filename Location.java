
import java.util.Hashtable;


public class Location{

protected String Road_Name; 
protected  String Road_Adress;
protected Hashtable<Items,String>inventory ;
protected Hashtable<Opponents,String> Opponents_table;



public Location(String Road_Name, String Road_Adress) {
    this.Road_Name = Road_Name; 
    this.Road_Adress =  Road_Adress;
    this.inventory =  new Hashtable<Items,String> (inventory) ;
    this.Opponents_table = new Hashtable<Opponents,String>(Opponents_table) ;
    
    
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