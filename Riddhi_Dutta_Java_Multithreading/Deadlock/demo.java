package LLD_Java_Essentials.Riddhi_Dutta_Java_Multithreading.Deadlock;

public class demo {
    public static void main(String[] args) {
        System.out.println("main is starting...");
        String lock1 = new String("lock1");
        String lock2 = new String("lock2");
        
        Thread t1 = new Thread(() -> {
            synchronized(lock1){
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Exception "+e);
                }
                synchronized(lock2){
                    System.out.println("lock acquired by "+Thread.currentThread().getName());
                }
            }
        }, "Thread - 1");

                
        Thread t2= new Thread(() -> {
            synchronized(lock2){
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Exception "+e);
                }
                synchronized(lock1){
                    System.out.println("lock acquired by "+Thread.currentThread().getName());
                }
            }
        }, "Thread - 2");

        t1.start();
        t2.start();
        System.out.println("main is exiting...");

    }
}
