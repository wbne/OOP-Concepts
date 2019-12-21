/*
   Abstract classes are unique in that you do not have to specify what certain methods can do.
   This allows for greater flexibillity when coding and allows subclasses to have their unique methods.
   While you could override the method, when encapsulating the subclasses as Animalia, you may not want to execute Animalia methods
   */

abstract public class Animalia
{
    public String name, latinName; //Name of the animal and its scientific name
    /*
       This is required for things to exist.
       */
    abstract void eat();
    
    /*
       This is usually required to exist.
       */
    abstract void play();
    
    /*
       This is also pretty important to exist.
       */
    abstract void talk();
    
    /*
       This has lots of papers supporting the fact that this is important.
       */
    public void sleep()
    {
        System.out.println(this.name + " is sleeping");
    }
    
    /*
       This isn't a biology class so I can have some more fun.
       */
    abstract public Animalia cloning(Animalia a);
    
}
