package producerconsumerproblem;

/**
 * @(#)ProducerConsumerUsingThreads.java
 * ProducerConsumerUsingThreads application
 * @author Engr. Umar Mahmud
 * @version 1.00 2013/12/20
 */
public class ProducerConsumerUsingThreads extends Thread {
//To create producer and consumer as threads

    private int x = 0;		//Shared variable
    private int maxLimit = 5;//Maximum Limit to simulate a buffer

    public ProducerConsumerUsingThreads(String threadName) {			//Constuctor
        super(threadName);	//Call to constructor of Thread class
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            if (Thread.currentThread().getName().startsWith("Producer")) {
                //In a producer
                if (x < maxLimit) {
                    x++;
                } else {
                    System.out.println("\nProducer blocked");
                    yield();	//Give way to another thread
                }
            } else if (Thread.currentThread().getName().startsWith("Consumer")) {
                //In a Consumer
                if (x > 0) {
                    x--;
                } else {
                    System.out.println("\nConsumer blocked");
                    yield();	//Give way to another thread
                }
            } else {	//default case
                System.out.println("Some Error");
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
