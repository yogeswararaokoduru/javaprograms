public class SynchronizationExample {

    public static void main(String[] args) {
        SynchronizationExample synchronizationExample = new SynchronizationExample();
        synchronizationExample.anji();
    }

    public void anji() {
        for (int i = 0; i < 20; i++) {
//12000
            System.out.println("ome sairam");
        }
        synchronized (this) {
            System.out.println("okasjoajdow");
        }
    }
}
