import java.util.Scanner;
public class Runner
{
    public static void main(String args[]) throws Exception
    {
        Hooman mii = new Hooman();
        Doggo doge = new Doggo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! I'm the narrator for this terrible simulation of a bio grad school student. (Press \"Enter\" to continue)");
        Thread.sleep(1000);
        System.out.println("The goal of this program is to educate you on Object Orientated Programming (OOP), it's not meant to roast anything. Trust me.");
        Thread.sleep(1000);
        System.out.println("An object in Java is a data structure that is based on a class.");
        Thread.sleep(1000);
        System.out.println("An example is this human class.");
        mii.talk();
        Thread.sleep(1000);
        System.out.println("This object has data types as well as methods that can be invoked");
        Thread.sleep(1000);
        System.out.println("A unique characteristic with objects is inheritance, where an object can inherit methods and properties from another class.");
        Thread.sleep(1000);
        System.out.println("For the human class, its parent class is Animalia which is an abstract class.");
        Thread.sleep(1000);
        System.out.println("An abstract class is a class with methods not fully defined.");
        Thread.sleep(1000);
        System.out.println("The advantage of having an abstract class is that it allows for more flexibility when creating the sub-classes");
        Thread.sleep(1000);
        System.out.println("Another class under the Animalia class is the Dog class");
        doge.talk();
        Thread.sleep(1000);
        System.out.println("Because both inherit from the same class, they have similar methods and variables.");
        Thread.sleep(1000);
        System.out.println("If you want to learn more about OOP concepts, then check out the source code!");
        
    }
}
