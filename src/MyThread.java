public class MyThread extends Thread {

    private int a;

    public MyThread(int a) {
        this.a = a;
    }

    public void run(){
        while(true) {
            System.out.println("jestem w MyThread w watku :" + a );
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
