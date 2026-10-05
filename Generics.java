import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
public class Generics
{
    public static void main(String[] args)
    {
        /*
        ArrayLists are generic so you can set any data type you want upon declaration
        dont use primitives because it has to be an object type, so use the wrapper classes instead
        List<String> items = new ArrayList<>();
        since ArrayList uses the interface List
        left side of declaration shows what it can do, right side shows how it does it

         */
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();

        List<String> names = new ArrayList<>();
        Set<String> uniqueNames = new HashSet<>();
        Queue<String> queueNames = new LinkedList<>();


        Bag<String> b = new Bag();
        b.addItem("apple");
        System.out.println(b.getItem());

        Bag<Integer> b2 = new Bag();
        b2.addItem(10);
        System.out.println(b2.getItem());

    }
}