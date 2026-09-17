package Threads;



class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread1: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
class MyThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread2: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}



//2 way using implementing runnable interface



class MyThread3 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
public class thread1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
       
        t2.start();
        //their order of execuation if not guaranteed as they are running in parallel t1 t2 t2 t1 ....xyz like that is not tha tfirst t1 all will come then t2 or like pairs of t1 t2 t1 t2  its random as they are running in parallel.but the order is coorect like  1-1 2-2 but we dont know which 1 is from t1 and t2 could be random.
    




        //2nd way of creating thread using runnable interface
        MyThread3 runnableThread = new MyThread3();
        Thread t3 = new Thread(runnableThread);
        t3.start();
    }
}
