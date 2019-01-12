import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by mhan on 1/18/2017.
 */
public class Interleave {
    public static void main (String[] args){
        Queue<Integer> q = new LinkedList<>();
        int[] array = {1,2,3,4,100,200,300,400};
        for(int i : array){
            q.add(i);
        }
        interleave(q);
        System.out.println(q); //desired result is [1, 100, 2, 200, 3, 300, 4, 400]
    }

    public static void interleave(Queue<Integer> q) {
        //Implement your own code here
    }
}
