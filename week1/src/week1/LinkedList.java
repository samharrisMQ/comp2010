package week1;

public class LinkedList {
    LinkedList next;
    char value;

    LinkedList(char c){
        next = null;
        value = c;
    }

    LinkedList(char c, LinkedList next){
        this.next = next;
        value = c;
    }

    int length(){
        if (next == null)
            return 1;
        else 
            return 1+ next.length();
    }

    int length_iterative(){
        int ret = 1;
        LinkedList curr = this;
        while (curr.next != null){
            curr = curr.next;
            ret++;
        }
        return ret;
    }

    void add(char c){
        // get to the end and add it there
        LinkedList curr = this;
        while (curr.next != null){
          curr = curr.next;
        }
        curr.next = new LinkedList(c);
    }

    public String toString(){
        if (next == null){
            return String.valueOf(value);
        } else {
            return (String.valueOf(value) + next.toString());
        }
    }

    String toString_iterative(){
        String ret = String.valueOf(value);
        LinkedList curr = next;
        while(curr != null){
            ret = ret + String.valueOf(curr.value);
            curr = curr.next;
        }
        return ret;
    }
}