package threadqueu;

 public abstract class BaseThread <T> implements Runnable{
     protected final QueueThread queue;

     BaseThread (QueueThread queue, String threadName){
         this.queue = queue;
         new Thread(this, threadName).start();
     }

     @Override
     public void run() {
         runThread();
     }

     protected abstract void runThread();
 }