public class MyThread implements Runnable{

    String name;



    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
