public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new MyThread());
        thread.setName("Larry");
        thread.start();
        Thread thread2 = new Thread(new MyThread());
        thread2.setName("Moe");
        thread2.start();
        Thread thread3 = new Thread(new MyThread());
        thread3.setName("Curly");
        thread3.start();

    }
}