import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MessageQueue {
    private Queue<Message> queue = new ConcurrentLinkedQueue<>();

    public void sendMessage(Message message) {
        queue.offer(message);
    }

    public Message receiveMessage() {
        return queue.poll();
    }
}
