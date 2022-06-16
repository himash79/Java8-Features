package Sections.Lambda;

public class RunnableExample {

    public static void main(String args[]) {

        Runnable run1 = () -> System.out.println("Thread 01 start");
        new Thread(run1).start();
        Thread thread2 = new Thread(run1);
        new Thread(thread2).start();
    }

}
