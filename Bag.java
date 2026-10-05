public class Bag<T>
{
    private T item;
    public Bag()
    {
        this.item = null;
    }


    //use T in place of int or double since you don't know what type of data will be passed in
    public void addItem(T item)
    {
        this.item = item;
    }

    public T getItem()
    {
        return item;
    }
}
