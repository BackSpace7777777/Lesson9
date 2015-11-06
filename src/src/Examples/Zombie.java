package src.Examples;
public class Zombie implements Monster{
    private String name;
    public Zombie(String na)
    {
        name=na;
    }
    public void attack() {
        System.out.println("I want to eat your brains");
    }
    public String identify() {
        return "Zombie " + name;
    }
    
}
