package multithreading;

public class ThreadDemo {

    public static void main(String a[]) throws InterruptedException {
        //A Thread is the smallest unit of execution inside a program.


        Thread t1 = new Thread(()->{
            for(int i =0;i<50;i++){
                System.out.println("Thread Name: "+Thread.currentThread().getName());
                //In Java, every thread has a priority, but if you don’t explicitly set it, it gets a default value. is 5.
                //Thread.NORM_PRIORITY = 5
                //Thread.MIN_PRIORITY = 1
                //Thread.MAX_PRIORITY = 10
                System.out.println("Thread Priority: "+Thread.currentThread().getPriority());
            }
        });
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        t1.join(); // Wait for t1 to finish before starting t2

        Thread t2 = new Thread(()->{
            for(int i =0;i<50;i++){
                System.out.println("Thread 2");
                System.out.println("Thread Name: "+Thread.currentThread().getName());
                System.out.println("Thread Priority: "+Thread.currentThread().getPriority());
            }
        });
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();


        //👉 Thread priority is just a hint to the OS scheduler.
        // It does not guarantee that higher priority threads will always run before lower priority ones.
        // The actual scheduling of threads is determined by the OS and can be influenced by various factors,
        // such as the current load on the system and the specific scheduling algorithm used by the OS.



        //VERY IMPORTANT (Interview Point)
        //
        //❌ Priority does NOT control execution
        //
        //✅ It only suggests scheduling preference
    }

    //What is Preemptive Scheduling?
    //
    //OS can pause a running thread anytime and give CPU to another



}
