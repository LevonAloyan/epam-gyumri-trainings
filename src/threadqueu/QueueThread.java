package threadqueu;

public class QueueThread<T> {
    private T data;
    private boolean isValueSet;


    protected synchronized void put (T data){
        while (isValueSet){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        this.data = data;
        this.isValueSet = true;
        System.out.println(Thread.currentThread().getName() + " put " + data);
        notify();
    }



    protected synchronized  T get(){
        while (!isValueSet){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " get " + data);
      this.isValueSet =  false;
        notify();
        return data;
    }
}















