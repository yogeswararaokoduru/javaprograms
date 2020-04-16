import java.io.Serializable;

public class Student implements Serializable {

    private static int i=20;
    private transient int j=30;
    private final int k=40;
    private  int l=50;

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        Student.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }
}
