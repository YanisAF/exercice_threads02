public class MaTacheRunnable implements Runnable {
    private final int number;

    public MaTacheRunnable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Le carré de "+ number+" est : "+number*number);
    }
}
