/*
   The Doggo class is pretty much the same as the human class.
   There might be some methods exclusive but overall they're similar
   */

public class Doggo extends Animalia
{
    private final String latinName = "Canis lupus";
    
    public Doggo()
    {
        name = NameGen.newName(this);
    }
    
    public Doggo(String name)
    {
        this.name = name;
    }
    
    public void eat()
    {
        System.out.println(this.name + ": decides it's dinner time");
    }
    
    public void play()
    {
        System.out.println(this.name + ": woof play with me woof");
    }
    
    public void talk()
    {
        System.out.println(this.name + ": woof woof woof");
    }
    

    public Animalia cloning(Animalia a)
    {
        if(a instanceof Doggo)
        {
            System.out.println(this.name + " has learned the forbidden knowledge and has created a new being with pure doge power.");
            return new Doggo();
        }
        else
        {
            System.out.println("Everybody did not like that.");
            return null;
        }
    }
}
