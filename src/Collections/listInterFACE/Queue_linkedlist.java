package Collections.listInterFACE;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_linkedlist {
    public static void main(String[] args) {
        Queue<Integer> que=new LinkedList<>();
        que.offer(1);
        que.offer(2);
        que.offer(3);
        que.offer(4);
        que.offer(5);
        System.out.println(que);
        System.out.println(que.poll());
        System.out.println(que.peek() );


    }
}
