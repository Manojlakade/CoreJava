package Collections.listInterFACE;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>();
        pq.offer(3);
        pq.offer(5);
        pq.offer(1);
        pq.offer(4);
        pq.offer(2);
        System.out.println(pq);

        //in case of integers smaller NUMS have highest priority
        System.out.println(pq.poll());
        System.out.println(pq);

    }
}
