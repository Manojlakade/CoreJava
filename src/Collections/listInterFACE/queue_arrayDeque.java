package Collections.listInterFACE;

import java.util.ArrayDeque;

public class queue_arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();

        dq.offer(1);
        dq.offer(2);
        dq.offer(3);
        dq.offer(4);
        dq.offer(5);
        dq.offer(6);

        System.out.println(dq);

        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());

        System.out.println(dq);

        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        System.out.println(dq);

        dq.offerFirst(1);
        System.out.println(dq);
        dq.offerLast(6);
        System.out.println(dq);


    }
}
