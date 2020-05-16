public class MethodOverloadingExample {

    int i;
    int j;

    /*
     * Method name should be same with different arguments
     * */
    double a1(int k, int l, float p) {
        System.out.println("i am innocent");
        return i;
    }

    float a1(int m, long n, double o, char q) {

        return 1f;
    }

    public static void main(String[] args) {
        MethodOverloadingExample methodOverloadingExample = new MethodOverloadingExample();
        methodOverloadingExample.a1(1, 2, 3.0f);

    }
}
