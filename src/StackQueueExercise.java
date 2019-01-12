// Program that demonstrates some stack/queue operations

import java.util.Queue;
import java.util.Stack;

public class StackQueueExercise {
    public static void main(String[] args) {
        Queue<Integer> q = makeQueueOfMultiples(6, 3);
        System.out.println("initial queue = " + q);
        System.out.println("sum = " + sum(q));
        System.out.println("after sum queue = " + q);
        System.out.println();

        Stack<Integer> s = new Stack<Integer>();
        System.out.println("current queue = " + q);
        queueToStack(q, s);
        System.out.println("after queueToStack:");
        System.out.println("    queue = " + q);
        System.out.println("    stack = " + s);
        System.out.println();

        s = makeStackOfMultiples(6, 5);
        System.out.println("initial stack = " + s);
        System.out.println("sum = " + sum(s));
        System.out.println("after sum stack = " + s);
        System.out.println();

        System.out.println("current queue = " + q);
        System.out.println("current stack = " + s);
        stackToQueue(s, q);
        System.out.println("after stackToQueue:");
        System.out.println("    stack = " + s);
        System.out.println("    queue = " + q);
    }

    // pre : count >= 0
    // post: returns a queue of count multiples of n
    public static Queue<Integer> makeQueueOfMultiples(int count, int n) {
        return null;
    }

    // pre : count >= 0
    // post: returns a stack of count multiples of n
    public static Stack<Integer> makeStackOfMultiples(int count, int n) {
        return null;
    }

    // post: Values from q moved to s (added in queue order, front to back);
    //       q is empty
    public static void queueToStack(Queue<Integer> q, Stack<Integer> s) {
        //Implement me
    }

    // post: Values from s moved to q (added in stack order, top to bottom);
    //       s is empty
    public static void stackToQueue(Stack<Integer> s, Queue<Integer> q) {
        //Implement me
    }

    // post: returns the sum of the values in q
    // This method should NOT change the content of q after the call
    public static int sum(Queue<Integer> q) {
        int sum = 0;
        //implement me
        return sum;
    }

    // post: returns the sum of the values in s
    // This method should NOT change the content of s after the call
    public static int sum(Stack<Integer> s) {
        int sum = 0;
        //implement me
        return sum;
    }
}
