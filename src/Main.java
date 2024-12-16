public class Main {
    public static void main(String[] args) {


        for (int i = 0; i < 6; i++){
            Thread thread1 = new Thread(new MaTacheRunnable(i));
            thread1.start();
        }

    }
}