public class Hooman extends Animalia
{
    final private String latinName = "Homo sapien"; //Latin name for hoomans
    /*
       This creates a hooman object with a name
       */
    public Hooman(String name) 
    {
        this.name = name;
    }
    
    /*
       This is overloading a method and this is a backup incase something goes wrong
       */
    public Hooman()
    {
        this.name = NameGen.newName(this);
    }
    
    /*
       A method specific to hoomans. We don't eat doggo food.
       */
    public void eat()
    {
        System.out.println(this.name + ": It looks like a good day to eat ramen!");
    }
    
    /*
       A method specific to hoomans again. We don't chew toys when we get older.
       */
    public void play()
    {
        System.out.println(this.name + ": I'm going to mouth pipette!");
    }
    
    /*
       Another difference between hoomans and doggos, we don't speak the same language.
       */
    public void talk()
    {
        System.out.println(this.name + ": Hi! I'm a hooman named " + this.name);
    }
    
    /*
       A method unique to humans, if you try to use this method on an Animalia object, then it will fail.
       The Hooman cannot use this method if it's encapsulated as a Animalia
       */
    public void work()
    {
        System.out.println(this.name + ": *fails gel electrophoresis again*");
        System.out.println(this.name + ": Why didn't I become a docter?");
    }
    
    
    /*
       This is to ensure that there is no beastiallity.
       The method uses polymorphism and checks if the animal is a hooman.
       */
    public Animalia cloning(Animalia a)
    {
        if(a instanceof Hooman)
        {
            System.out.println("Hooman has learned from ameoba and cloned");
            return new Hooman(NameGen.newName(this));
        }
        else
        {
            System.out.println("Hey! You can't do that!");
            return null;
        }
    }
}
