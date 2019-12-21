import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.util.Random;

public class NameGen
{
    private static ArrayList<String>[] nameBank = new ArrayList[2];
    private static boolean initialized = false;
    private static Scanner sc;
    private static Random rand = new Random();

    private static void check()
    {
        if(!initialized)
        {
            try
            {
                String temp;
                for(int i = 0; i < nameBank.length; i++)
                    nameBank[i] = new ArrayList<String>();
                sc = new Scanner(new File("names.txt"));
                int counter = 0;
                temp = sc.nextLine(); //Just because I don't want to be named "Hooman Names"
                while(!temp.equals("Doggo Names"))
                {
                    temp = sc.nextLine();
                    nameBank[counter].add(temp);
                }
                counter++;
                while(sc.hasNext())
                {
                    temp = sc.nextLine();
                    nameBank[counter].add(temp);
                }
            }
            catch(Exception ohno)
            {
                System.out.println(ohno.getStackTrace());
            }
            
        }
    }

    public static String newName()
    {
        return "generic name";
    }

    public static String newName(Animalia a)
    {
        check();
        if(a instanceof Hooman)
            return nameBank[0].get(rand.nextInt(nameBank[0].size()));
        else if(a instanceof Doggo)
            return nameBank[1].get(rand.nextInt(nameBank[1].size()));
        else
            return newName();
    }
}
