import java.util.Scanner;

public class CircularQueue {
    static Scanner sc = new Scanner(System.in);

    static int[] queue = new int[5];
    static int rear = -1;
    static int front = -1;

    //Enqueue()
    static void Enqueue(int x)
    {
        if((front == 0 && rear >=4) || (front == rear + 1))
        {
            System.out.println("Queue is full!");
            return;
        }
        else
        {
            if(rear >= 4)
            {
                rear = 0;
                queue[rear] = x;
            }
            else
            {
               rear++;
               queue[rear] = x;
            }
            if(front == -1)
            {
                front = 0;
            }

        }
        System.out.println("The Front is:" + front);
        System.out.println("The Rear is "  + rear);
    }  

    //Dequeue()
    static void dequeue()
    {   int x = 0;
        if(front<0)
        {
            System.out.println("Queue is empty!");
            return;
        } 
        else
        {
            if(front == rear)
            {
                 x = queue[front];
                front = -1;
                rear = -1;

            } 
            else
            {
                if(front>=4)
                {   x = queue[front];

                    front = 0;
                }  
                else
                {   x = queue[front];
                    front++;
                }
            }
        } 
        System.out.println("The front is: " +front);
        System.out.println("The rear is: " +rear);
    } 

    //  ********* Double Ended Queue *********

    //insertAtFront()
    static void InsertionAtFront(int x)
    {
        if((front == 0 && rear >=4)|| (front == rear+1))
        {
            System.out.println("Queue is full!");
            return;
        } 
        else
        {
            if(front == -1)
            {
                front = 0;
                rear = 0;
                queue[front] = x;
            } 
            else
            {
                if(front ==0)
                {
                    front = queue.length-1;
                    queue[front] = x;

                } 
                else
                {
                    front--;
                    queue[front] = x; 
                }
            }
        }
    } 

    //DeleteFromRear()
    static void DeleteFromRear()
    {   int x = 0;
        if(front <0)
        {
            System.out.println("Queue is empty!");
            return;
        } 
        else
        {
            if(front == rear)
            {
                 x = queue[rear];
                rear = -1;
                front = -1;
            } 
            else
            {
                if(rear == 0)
                {
                    x = queue[rear];
                    rear = queue.length-1;
                }
                else
                {
                    x = queue[rear];
                    rear--;
                }
            } 
        }
    }
    

    public static void main(String[] args) {
       /*  char ch = 'Y';
        while (ch != 'N') {
            System.out.println("Enter your element: ");
            int data = sc.nextInt();
            Enqueue(data);
            System.out.println("Continue? (Y/N): ");
            ch = sc.next().toUpperCase().charAt(0);
        }*/ 

            
            int choice = 0;
            do {
                System.out.println(" ***** Circular Queue *****  ");
                System.out.println("1.Insertion at Rear");
                System.out.println("2.Deletion from front");
                System.out.println("3.Insertion at Front");
                System.out.println("4. Deletion From Rear");
                System.out.println("5.Exit");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter your data: ");
                        int data = sc.nextInt();
                        Enqueue(data);
                        break; 
                    case 2:
                        dequeue();
                        break;
                    case 3:
                        System.out.println("Enter your data: ");
                         data = sc.nextInt();
                        InsertionAtFront(data);  
                        break;
                    case 4: 
                        DeleteFromRear();
                        break;  
                    case 5:
                        System.out.println("Exited");
                        break;

                
                    default:
                        System.out.println("Invalid Choice!");
                        break; 
                } 
            } while(choice!=5);

    }
    
}
