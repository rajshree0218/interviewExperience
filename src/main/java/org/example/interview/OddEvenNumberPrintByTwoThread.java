package org.example.interview;

import java.util.concurrent.atomic.AtomicInteger;

public class OddEvenNumberPrintByTwoThread {

    private static final Object lock = new Object();
    
    public static void main(String[] args) {
        AtomicInteger number = new AtomicInteger(1);
        Thread evenThread = new Thread(printEvenNumber(number));
        Thread oddThread = new Thread(printOddNumber(number));
        evenThread.start();
        oddThread.start();


        printEvenAndOddNumberUsingTwoThread();

    }
    private static Runnable printEvenNumber(AtomicInteger number) {
        return new Runnable() {
            @Override
            public void run() {
                while (number.get() <= 100) {
                    if (number.get() % 2 == 0) {
                        System.out.print("Even Numbers: " + number.get() + " , ");
                        number.getAndIncrement();
                    }
                }
            }
        };
    }

    private static Runnable printOddNumber(AtomicInteger number) {
        return new Runnable() {
            @Override
            public void run() {
                while (number.get() <= 100) {
                    if (number.get() % 2 == 1) {
                        System.out.print("Odd Numbers:" + number.get() + " , ");
                        number.getAndIncrement();
                    }
                }
            }
        };
    }

    static int[] number = {1};
    static int num = 1;
    public static void printEvenAndOddNumberUsingTwoThread(){

        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(num <=100){
//                    synchronized (lock) {
                    if (num % 2 != 0) {
                        System.out.print("Odd Numbers:" + num +" :: "+ Thread.currentThread().getName()+" :: "+ " , ");
                        num++;
//                            lock.notify();
//                    }else {
//                            try {
//                                lock.wait();
//                            } catch (InterruptedException e) {
//
//                            }
//                        }
                    }
                }
            }
        });

        Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(num <=100){
//                    synchronized (lock) {
                    if (num % 2 == 0) {
                        System.out.print("Even Numbers: " + num +" :: "+Thread.currentThread().getName() +" :: "+ " , ");
                        num++;
//                            lock.notify();
//                        } else {
//                            try {
//                                lock.wait();
//                            } catch (InterruptedException e) {
//
//                            }
//                        }
                    }
                }
            }
        });
        oddThread.start();
        evenThread.start();
    }
}

class DD {
    AtomicInteger counter = new AtomicInteger(1);
    static int N;
    public void printOddNumber() {
        synchronized (this){
            while (counter.get() < N) {
               while (counter.get() % 2 == 0) {
                    try {
                        wait();
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(counter + " ");
                counter.getAndIncrement();
                notify();
            }
        }
    }

    public void printEvenNumber() {
        synchronized (this) {
            while (counter.get() < N) {
                while (counter.get() % 2 == 1) {
                    try {
                        wait();
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(counter + " ");
                counter.getAndIncrement();
                notify();
            }
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        // Given Number N
        N = 300;

        // Create an object of class
        DD mt = new DD();

        // Create thread t1
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                mt.printEvenNumber();
            }
        });

        // Create thread t2
        Thread t2 = new Thread(new Runnable() {
            public void run()
            {
                mt.printOddNumber();
            }
        });
        Thread t3 = new Thread(new Runnable() {
            public void run() {mt.printOddNumber();}
        });
        Thread t4 = new Thread(new Runnable() {
            public void run()
            {
                mt.printEvenNumber();
            }
        });

        // Start both threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
