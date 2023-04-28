import java.util.ArrayList;
import java.util.Scanner;


public class Location{

protected String Road_Name; 
protected  String Road_Adress;
protected ArrayList<Items> inventory ;
Opponents opponents ;
Scanner startGame;

public Location(String Road_Name, String Road_Adress) {
    this.Road_Name = Road_Name; 
    this.Road_Adress =  Road_Adress;
    this.inventory = new ArrayList<Items> () ;
    
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


//not sure if i need this
public String toString() {
    return " You are in the " + this.Road_Name+ " in  the " + this.Road_Adress+ ". What do you do next?  ";
}


public static void main(String[] args) {




}

}