import java.util.Scanner;

class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;


    }
}

public class Tree1 {
    static Scanner sc = new Scanner(System.in);
    static Node temp;
    
    //Create()
    static void create(Node ptr)
    {
        System.out.print("\nEnter data: ");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        while (ptr!=null) {
            if(newNode.data <ptr.data)
            {
                temp = ptr;
                ptr = ptr.left;
            } 
            else
            {
                temp = ptr;
                ptr = ptr.right;
            }
            if(newNode.data < temp.data)
            {
                temp.left = newNode;

            } 
            else
            {
                temp.right = newNode;
            }
        }

    }


    public static void main(String[] args) {
        System.out.print("\nEnter data for the root: ");
        int data = sc.nextInt();
        Node rootNode = new Node(data);
        char ch = 'y';
        while (ch == 'Y' || ch == 'y') {
            create(rootNode);
            System.out.print("\nDo you want to add more: ");
            ch = sc.next().charAt(0);
        }
        
    }

}
