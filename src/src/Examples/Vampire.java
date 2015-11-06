package src.Examples;
public class Vampire implements Monster{
    private String name;
    public Vampire(String na)
    {
        name=na;
    }
    public void attack() {
        System.out.println("I want to suck your blood");
    }
    public String identify() {
        return "Vampire "+name;
    }
    
}
