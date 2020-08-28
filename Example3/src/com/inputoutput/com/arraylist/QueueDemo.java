package com.inputoutput.com.arraylist;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        QueueDemo queueDemo = new QueueDemo();
        Queue queue = queueDemo.createQueue();
        queueDemo.printQueue(queue);
    }

    private Queue createQueue() {
        PriorityQueue<Integer> queueOfInteger = new PriorityQueue<>();
        queueOfInteger.add(2);
        queueOfInteger.add(20);
        queueOfInteger.add(400);
        queueOfInteger.add(40);

        return queueOfInteger;
    }

    private void printQueue(Queue queue) {
        System.out.println("Head: " + queue.peek()); // 2
        System.out.println("Poll: " + queue.poll()); // 2
        System.out.println("Poll: " + queue.poll()); // 20
    }
}
