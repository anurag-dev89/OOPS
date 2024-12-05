 
class MyThread implements Runnable {
  // Implementing the run method to execute thread logic
  public void run() {
      try {
          for (int i = 1; i <= 5; i++) {
              // Print thread name and iteration
              System.out.println(Thread.currentThread().getName() + " i is " + i);
              // Sleep for 500 milliseconds to simulate suspension
              Thread.sleep(500);
          }
      } catch (InterruptedException e) {
          // Handle any interruptions
          System.out.println(e.getMessage());
      }
  }
}

public class Prog11 {
  public static void main(String[] args) {
      // Create an instance of the Runnable implementation (MyThread)
      MyThread myThread = new MyThread();
      
      // Create three threads and start them
      Thread t1 = new Thread(myThread);
      Thread t2 = new Thread(myThread);
      Thread t3 = new Thread(myThread);
      
      // Start each thread
      t1.start();
      t2.start();
      t3.start();
  }
}
