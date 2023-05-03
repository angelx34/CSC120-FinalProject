
import java.util.Hashtable;


public class Location{

protected String Road_Name; 
protected Hashtable<Items,String>inventory ;
protected Hashtable<Opponents,String> Opponents_table;





public Location(String Road_Name) {
    this.Road_Name = Road_Name; 
    this.inventory =  new Hashtable<Items,String> () ;
    this.Opponents_table = new Hashtable<Opponents,String>() ;
   
    
    
    
} 


public void describe () {
    System.out.println("Room inventory");
    for (String s : inventory.values()){
        System.out.println(s);
    }
}




public String getRoad_Name() {
    return this.Road_Name;
}





public String toString() {
    return " You are in the " + this.Road_Name+ "";
}


public static void main(String[] args) {




}

}