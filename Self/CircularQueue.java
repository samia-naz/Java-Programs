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
        System.out.println("Front is " + front+ "\t" + "Rear is "  + rear);
    } 

    public static void main(String[] args) {
        char ch = 'Y';
        while (ch != 'N') {
            System.out.println("Enter your element: ");
            int data = sc.nextInt();
            Enqueue(data);
            System.out.println("Continue? (Y/N): ");
            ch = sc.next().toUpperCase().charAt(0);
        }
    }
    
}
