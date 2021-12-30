package JAVA;
import java.util.Scanner;

public class sll1{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class LinkedList{
        private Node head;
        private Node tail;
        private int size;
        // Constructor Making
        LinkedList(){
            head = tail =null;
            size = 0;
        }
        void display(){
            Node temp = head;
            while(temp!=null)
            {
                if(temp.next ==null)
                {
                    System.out.println(temp.data);
                    System.out.println("Total Size: "+ this.size);
                }
                else{
                    System.out.print(temp.data + " => ");
                }
                temp = temp.next;
            }
        }
        int getSize(){
            return this.size;
        }
        void addFirst(int data)
        {
            Node n = new Node (data);
            if(head == null)
            {
                head = tail = n;
            }
            else{
                n.next = head;
                head = n;
            }
            size++;
        }
        void addLast(int data)
        {
            Node n = new Node (data);
            if(head == null)
            {
                head = tail = n;
            }
            else{
                tail.next = n;
                tail = n;
            }
            size++;
        }
        void addAt(int data, int k)
        {
            if(k<0 || k>this.size)
            {
                System.out.println("Error");
                return;
            }
            else if(k==0)
            {
                addFirst(data);
            }
            else if(k==this.size){
                addLast(data);
            }
            else{
                
                Node temp = head;
                for(int i=0;i<(k - 1);i++)
                {
                    temp = temp.next;
                }
                Node n = new Node (data);
                n.next = temp.next;
                temp.next = n;
            }
            size++;
        }
        void removeFirst()
        {
            if(head == null)
            {
                System.out.println("Invalid Arguments");
                return;
            }
            else if(head == tail){
                head=tail=null;
            }
            else{
                head = head.next;
            }
            size--;
        }
        void removeLast()
        {
            if(head == null)
            {
                System.out.println("Invalid Arguments");
                return;
            }
            else if(head == tail){
                head=tail=null;
            }
            else
            {
                Node temp = head;
                while(temp.next!=tail)
                {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
            size--;
        }
        void removeAt(int index)
        {
            if(index>=size || index<0 || head == null)
            {
                System.out.println("Invalid Arguments");
                return;
            }
            else if(index == 0){
                this.removeFirst();
            }
            else if(index == (size -1))
            {
                this.removeLast();
            }
            else{
                Node temp = head;
                for(int i=0;i<index - 1;i++)
                {
                    temp = temp.next;
                }
                temp.next  = temp.next.next;
            }
            size--;
        }
        int getFirst()
        {
            if(head == null)
            {
                System.out.println("Invalid Arguments");
                return -1;
            }
            else{
                return head.data;
            }
        }
        int getLast()
        {
            if(head == null)
            {
                System.out.println("Invalid Arguments");
                return -1;
            }
            else{
                return tail.data;
            }
        }
        int getAt(int index){
            if(head == null || index >= size || index<0)
            {
                System.out.println("Invalid Arguments");
                return -1;
            }
            else{
                Node temp = head;
                int k = 0;
                for(int i=0;i<index;i++)
                {
                    temp= temp.next;
                }
                k =temp.data;
                return k;
            }
        }
        private Node getNodeAt(int index){
            Node temp = head;
            for(int i=0;i<index;i++)
            {
                temp= temp.next;
            }
            return temp;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 1;
        LinkedList ll = new LinkedList();
        while(n!= -1)
        {
            n = getInput();
            switch (n) {
                case -2: //Done Size
                    System.out.println(ll.getSize());
                    break;
                case 0: //Done Display
                    ll.display();
                    break;
                case 1: //AddFirst //Done
                    int k = scn.nextInt();
                    ll.addFirst(k);
                    break;
                case 2: //addLast //Done
                    k = scn.nextInt();
                    ll.addLast(k);
                    break;
                case 3: //Addat //Done
                    k = scn.nextInt();
                    int l = scn.nextInt();
                    ll.addAt(k, l);
                    break;
                case 4: //removeFirst //Done
                    ll.removeFirst();
                    break;
                case 5: //removeLast //Done
                    ll.removeLast();
                    break;
                case 6: //removeAt //Done
                    k = scn.nextInt();
                    ll.removeAt(k);
                    break;
                case 7: //getFirst //Done
                    // k = scn.nextInt();
                    k = ll.getFirst();
                    System.out.println(k);
                    break;
                case 8: //getLast //Done
                    // k = scn.nextInt();
                    k = ll.getLast();
                    System.out.println(k);
                    break;
                



                case 13: // Reverse A LinkedList[Data only]

                    break;
                default:
                    break;
            }

        }
    }
    public static int getInput(){
        int n;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter A Choice: ");        
        System.out.println("-2. Get Size"); //Done
        System.out.println("0. Display LinkedList"); //Done
        System.out.println("1. AddFirst Node"); //Done
        System.out.println("2. AddLast Node"); //Done
        System.out.println("3. AddAt Node"); //Done
        System.out.println("4. removeFirst Node"); //Done
        System.out.println("5. removeLast Node"); //Done
        System.out.println("6. removeAt Node"); //Done
        System.out.println("7. getFirst Node"); //Done
        System.out.println("8. getLast Node"); //Done
        System.out.println("9. getAt Node"); //Done
        System.out.println("10. setFirst Node");
        System.out.println("11. setLast Node");
        System.out.println("12. setAt Node");
        System.out.println("13. Reverse A LinkedList[Data only]");
        System.out.println("14. Reverse A LinkedList[Pointer only]");
        System.out.println("15. Kth node from  LinkedList");
        System.out.println("16. Mid of  LinkedList");
        System.out.println("17. Merge two Sorted LinkedList");
        System.out.println("18. MergeSort of a LinkedList");
        System.out.println("19. Remove Duplicates from a LinkedList");
        System.out.println("20. Display Reverse Recursive");
        System.out.println("21. Reverse LinkedList pointer Recursive");
        System.out.println("22. Is a LinkedList palindrome?");
        System.out.println("23. FOLD a LinkedList ");
        System.out.println("24. Add two LinkedList ");
        System.out.println("25. InterSection Point of a LinkedList ");
       
        System.out.println("-1. Close");
        n = scn.nextInt();
        return n;
    }
}
