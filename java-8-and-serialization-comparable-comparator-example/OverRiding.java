public class OverRiding {
    public static void main(String[] args) {
        System.out.println("omesairam");
        SuperClassEx superClassEx=new SubClass();
        try {
            superClassEx.overRide();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
