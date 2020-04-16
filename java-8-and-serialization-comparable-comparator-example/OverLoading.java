public class OverLoading {
    public static void main(String[] args) {
        OverLoading overLoading=new OverLoading();
        overLoading.m1(10);
    }
     float m1(Object i){
        System.out.println("one");
        return 1.0f;
    }
    protected int m1(int i){
        System.out.println("one===");
        return 0;
    }
    private void m1(){
        System.out.println("two");
    }
    public void m1(int i,int k){
        System.out.println("three");
    }
}
