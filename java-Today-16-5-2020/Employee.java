import java.io.Serializable;

public class Employee implements Serializable {

    int i=10;
    static int j=20;
    transient int k=30;
    final int l=40;
}
