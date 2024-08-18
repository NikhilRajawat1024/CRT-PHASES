public class checkrotation {
    Node head;

    class Node{
        int val;
        Node next;
        Node(int val){
            this.val= val;
            this.next = null;
        }
    }
    public boolean check(Node head){

        Node slow = head;
        Node fast = head.next;

        if(head == null|| head.next == null){
            return false;
        }
        while(slow!=fast){

            if (fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    public static void main(String[] args) {
        checkrotation solution = new checkrotation();
        Node head = solution.new Node(1);
        head.next = solution.new Node(2);
        head.next.next = solution.new Node(3);
        head.next.next.next = solution.new Node(4);
        head.next.next.next.next = head.next; // Creates a cycle

        System.out.println(solution.check(head));
    }
}
