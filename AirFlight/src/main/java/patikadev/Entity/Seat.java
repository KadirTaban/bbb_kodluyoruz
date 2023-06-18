package patikadev.Entity;
public class Seat {
    public String name;
    public boolean isEmpty;

    public Seat(String name, boolean isEmpty){
        this.name=name;
        this.isEmpty=isEmpty;
    }
    public boolean getEmpty() {
        return this.isEmpty;
    }



}
