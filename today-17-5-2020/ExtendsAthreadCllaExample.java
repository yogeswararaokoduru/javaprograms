public class ExtendsAthreadCllaExample extends Thread {
    public static void main(String[] args) {
        ExtendsAthreadCllaExample extendsAthreadCllaExample=new ExtendsAthreadCllaExample();
        System.out.println("main thread"+Thread.currentThread());
        extendsAthreadCllaExample.start();

    }


    @Override
    public void run() {
        System.out.println("new thread"+Thread.currentThread());
        for (int i=0;i<20;i++) {
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
            System.out.println("ome sairam");
        }
    }



}
