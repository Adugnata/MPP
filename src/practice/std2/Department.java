package practice.std2;

public abstract class Department {
    private StringQueue queue = new StringQueue();

    public StringQueue getQueue() {
        return queue;
    }

    //implement
    public void addMessage(String msg) {
        queue.enqueue(msg);
    }

    public String nextMessage() {
        String str = null;
        try {
            str = queue.dequeue();
        } catch (EmptyQueueException e1) {
            //System.out.println(e1.getMessage());

        }
        return str;
    }

    public abstract String getName();
}
