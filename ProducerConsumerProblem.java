/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumerproblem;

/**
 * @(#)ProducerConsumerProblem.java
 * ProducerConsumerUsingThreads application
 * @author Engr. Umar Mahmud
 * @version 1.00 2020/03/19
 */
public class ProducerConsumerProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProducerConsumerUsingThreads p = new ProducerConsumerUsingThreads("Producer");
        ProducerConsumerUsingThreads c = new ProducerConsumerUsingThreads("Consumer");
        p.start();
        c.start();
    }
    
}
