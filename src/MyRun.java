public class MyRun implements Runnable {
    private  int a;

    public MyRun(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        while(true) {
            System.out.println("jestem w MyRun w watku :" + a);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
