import java.util.*;

class Collections{
    public static void main(String args[]){
    {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        Iterator itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    {

        List<Integer> arr = new LinkedList<Integer>();
        arr.add(3);
        arr.add(4);
        Iterator itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    {
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(5);
        stk.push(6);
        while(!stk.empty()){
            System.out.println(stk.peek());
            stk.pop();
        }
    }
    }
}