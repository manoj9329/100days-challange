import java.util.ArrayList;
import java.util.Collections;

class Node{
    int value;
    Node next;

    Node(int value){
        this.value = value;
        this.next = null;
    }
}
public class mergsortedarray {
    public static Node mergtwoarr(Node list1, Node list2){

        ArrayList<Integer> arr = new ArrayList<>();

        while(list1 != null){
            arr.add(list1.value);
            list1 = list1.next;

        }
         while(list2 != null){
            arr.add(list2.value);
            list2 = list2.next;
         }

         Collections.sort(arr);

         Node dummy = new Node(-1);
         Node current = dummy;

         for(int num : arr){
            current.next = new Node(num);
            current = current.next;

         }
         return dummy.next;
    }
    public static void printlist(Node head){
        while (head != null) {
            System.out.println(head.value + " ");
            head = head.next;
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        


        // list1 = 1 -> 2 -> 4
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);

        // list2 = 1 -> 3 -> 4
        Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(4);

        Node result = mergtwoarr(list1, list2);

        printlist(result);
    }
    
}
