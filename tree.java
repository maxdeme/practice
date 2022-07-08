package ru.ac.uniyar.mf.isakov.summer;

        import java.until.Random;
        import java.until.UUID;

public class Node
{
    private String id;
    private String name;
    private List<Node> children;

    public Node(String name)
    {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.children = new ArrayList<>();
    }
}
public class Tree
{
    void create_node()
    {
        Node node = new Node("корень");
    }

    void add_node()
    {

    }
}

public class Program
{
    public static void main (String args[])
    {
        System.out.println("Hello Java!");
    }
}
