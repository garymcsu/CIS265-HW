import java.util.Random;

public class Test {

    public static void main(String[] args) {
        final long elapsedArrayQueue = arrayQueueDuration();
        final long elapsedLLQueue = llQueueDuration();
        System.out.println("ArrayQueue time: " + elapsedArrayQueue);
        System.out.println("LLQueue time: " + elapsedLLQueue);
    }

    static long arrayQueueDuration() {
        var queue = new ArrayQueue();
        var before = System.currentTimeMillis();
        try {
            for (int i = 0; i < 50000; i++) {
                Random random = new Random();
                var generateA = random.nextInt(2);
                queue.remove();
                queue.add(generateA);
            }
        } catch (QueueFullException fullException) {
            System.out.println("Queue is full");
        }
        var after = System.currentTimeMillis();
        return after - before;
    }

    static long llQueueDuration() {
        var queue = new LLQueue();
        var before = System.currentTimeMillis();
        try {
            for (int i = 0; i < 50000; i++) {
                Random random = new Random();
                var generateA = random.nextInt(2);
                queue.remove();
                queue.add(generateA);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        var after = System.currentTimeMillis();
        return after - before;
    }
}
