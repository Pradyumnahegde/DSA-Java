import java.util.ArrayDeque;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {

        Queue<Integer> qu = new ArrayDeque<> ();
        qu.add(10);
        qu.add(20);
        qu.add(30);
        System.out.println(qu);
        qu.remove();
        System.out.println(qu);
        var a = qu.peek();
        System.out.println(a);
        var b = qu.poll();
        System.out.println(b);
        System.out.println(qu);

    }

}
