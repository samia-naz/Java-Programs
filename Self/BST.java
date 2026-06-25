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
    //inOrder()
    static void inOrder(Node ptr)
    {
        if(ptr!=null)
        {
            inOrder(ptr.left);
            System.out.print(ptr.data + " ");
            inOrder(ptr.right);
        }
    } 
    // postOrder()
    static void postOrder(Node ptr)
    {
        if(ptr!=null)
        {
            postOrder(ptr.left);
            postOrder(ptr.right);
            System.out.print(ptr.data + " ");
        }
    } 
    // *************** Other Important Logics of Trees *********************
    // height()
    static int height(Node ptr)
    {   int height = 0;
        if(ptr == null)
        {
            return 0;
        }
        else
        {
            int left = height(ptr.left);
            int right = height(ptr.right);
            if(left > right)
            {
                height = left + 1; 
            } 
            else
            {
                height = right +1;
            } 
            return height;
        }
    } 

    // countLeafNodes()
    static int countLeafNodes(Node ptr)
    {  
        if(ptr == null)
        {
            return 0;
        } 
        else
        {
            if(ptr.left == null && ptr.right == null)
            {
                return 1;
            } 
        } 
        int left = countLeafNodes(ptr.left);
        int right = countLeafNodes(ptr.right);
        return left + right;
        
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
        // call for PreOrder()
        System.out.println(" **** PRE ORDER TRAVERSAL ****");
        System.out.print("The preOrder is : ");
        preOrder(root); 

        //Call for Inorder()
        System.out.println("\n");
        System.out.println(" **** In ORDER TRAVERSAL ****");
        System.out.print("The InOrder is : ");
        inOrder(root); 

        System.out.println("\n");
        System.out.println(" **** Post ORDER TRAVERSAL ****");
        System.out.print("The PostOrder is : ");
        postOrder(root);

        System.out.println("\n");
        System.out.println(" **** THE HEIGHT OF TREE  ****");
        int height = height(root);
        System.out.print("The Height is : " + height);
        
        System.out.println("\n");
        int count = countLeafNodes(root);
        System.out.print("The Count of Leaf Nodes is : " + count);
        



    }  
 

    

}
