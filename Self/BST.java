import java.util.Scanner;

// Node class
class Node
{
    int data ;
    Node left ,right;
    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BST {
    static Scanner sc = new Scanner(System.in);
    static Node temp ;
    //create()
    static void create(Node ptr)
    {
     System.out.print("Enter your data : ");   
     int data = sc.nextInt();
     Node newNode = new Node(data);
     while(ptr != null)
     {
        if(newNode.data < ptr.data)
        {
            temp = ptr;
            ptr = ptr.left;
        } 
        else
        {
            temp = ptr;
            ptr = ptr.right;
        }  }
        
        if(newNode.data<temp.data)
        {
            temp.left = newNode;
        } 
        else
        {
            temp.right = newNode;
        }
      

    } 

    //preOder()
    
    static void preOrder(Node ptr)
    {   
        if(ptr!=null)
        {  
            System.out.print(ptr.data + " ");
            preOrder(ptr.left);
            preOrder(ptr.right);

        }
    }

    public static void main(String[] args) {
        System.out.print("Enter data for the root : ");
        int data = sc.nextInt();
        Node root = new Node(data);
        char ch = 'Y';
        while(ch == 'Y' || ch == 'y')
        {
            create(root);
            System.out.println("Do you want to add more Nodes: ");
            ch = sc.next().charAt(0);
        }
        System.out.println(" **** PRE ORDER TRAVERSAL ****");
        System.out.print("The preOrder is : ");
        preOrder(root);
    }   

    

}
