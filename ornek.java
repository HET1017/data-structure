package çalýþma;


public class ornek
{
    private class Node
    {
        Node next;
        Node previous;
        int item;
    }

    private static Node first;
    private static Node last;
    private static int N = 0;

    public boolean isEmpty()
    {
        return N == 0;
    }
    public int size()
    {
        return N;
    }
    //Add item from header
    public void push(int item)
    {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        if (isEmpty()) last = first;
        else
        {
            oldfirst.previous = first;
            first.next = oldfirst;
        }
        N++;
    }
    //Delete item from header
    public int pop()
    {
        int item = first.item;
        first = first.next;
        N--;
        return item;
    }
    //Add item from end of table
    public void enqueue(int item)
    {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        if (isEmpty()) first = last;
        else
        {
            last.previous = oldlast;
            oldlast.next = last;
        }
        N++;
    }
    //Delete item from end of table
    public int dequeue()
    {
        int item = last.item;
        last = last.previous;
        if (isEmpty()) last = null;
        N--;
        return item;
    }
    //Insert new node before specifying node
    public void addprevious(int n, int item)
    {
        Node node = new Node();
        node.item = item;
        if (n > this.size())
        {
            System.out.print("wrong");
            return;
        }
        Node x = first;
        for (int i = 0; i < n - 1; i++)
            x = x.next;
        node.previous = x.previous;
        x.previous.next = node;
        x.previous = node;
        node.next = x;
        N++;
    }
    //Insert a new node after the specified node
    public void addnext(int n, int item)
    {
        Node node = new Node();
        node.item = item;
        if (n > this.size())
        {
            System.out.print("wrong");
            return;
        }
        Node x = first;
        for (int i = 0; i < n - 1; i++)
            x = x.next;
        node.next = x.next;
        x.next.previous = node;
        x.next = node;
        node.previous = x;
        N++;
    }
    //Delete the specified node
    public int delete(int n)
    {
        Node x = first;
        for (int i = 0; i < n - 1; i++)
            x = x.next;
        int item = x.item;
        x.previous.next = x.next;
        x.next.previous = x.previous;
        N--;
        return item;
    }


    public static void main(String... args)
    {
        
        ornek e = new ornek();
        for (int i = 1; i < 9; i++)
        {
            e.push(i);
            e.enqueue(++i);
        }
        e.addnext(2, 7);
        e.addprevious(6, 8);
        e.delete(4);
        for (Node x = first; x != null; x = x.next)
        {
            System.out.print(x.item + " ");
        }
        System.out.println();
        
    }
}
