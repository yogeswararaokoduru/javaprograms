import java.io.IOException;
import java.sql.SQLException;

public class SubClassExample extends SuperClassExample {

    public void yogi() throws RuntimeException {
        System.out.println("i am in sub class SubClassExample");
    }

    public static void main(String[] args) {

        SuperClassExample superClassExample1 = new SubClassExample();

        try {
            superClassExample1.yogi();
        } catch (Throwable t) {

        }
    }
}
