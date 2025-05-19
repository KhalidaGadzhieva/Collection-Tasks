import java.util.ArrayDeque;
import java.util.Queue;

public class Task3 {
    public static void main(String[] args) {
        Queue<String> customerQueue = new ArrayDeque<>();
        customerQueue.add("Customer 1");
        customerQueue.add("Customer 2");
        customerQueue.add("Customer 3");
        customerQueue.add("Customer 4");
        serving(customerQueue);

    }
    public static void serving(Queue<String> queue){
        while (!queue.isEmpty()){
            System.out.println(queue.poll()+" serving olundu. Novbeti...");
        }
        System.out.println("Novbe bitdi");
    }
}
