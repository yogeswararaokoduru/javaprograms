public class ThreadinExample implements Runnable{

    public static void main(String[] args) {

        ThreadinExample threadinExample=new ThreadinExample();
        Thread t=new Thread(threadinExample);
        t.start();
    }


    @Override
    public void run() {
        for (int i=0;i<20;i++) {

            System.out.println("ome sairam");
        }
    }



}
