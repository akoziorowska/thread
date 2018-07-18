public class Runner {
    public static void main(String[] args){
//        Runnable[] runners = new Runnable[10] ;
//        Thread[] threads = new Thread[10];

//        for(int i=0;i<10;i++){
//            runners[i]= new MyRun(i);
//            threads[i]=new Thread(runners[i]);
//            threads[i].start();
//        }

//pojedyncze wywolanie
//        MyRun myRun = new MyRun(1);
//        Thread thread = new Thread(myRun);
//        thread.start();
//
//        MyRun myRun2 = new MyRun(2);
//        Thread thread2 = new Thread(myRun2);
//        thread2.start();

        MyThread myThread = new MyThread(5);
        myThread.start();

        MyThread myThread6 = new MyThread(6);
        myThread6.start();

    }
}
