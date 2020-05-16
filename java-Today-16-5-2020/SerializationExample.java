import java.io.*;

public class SerializationExample {



    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee serializationExample=new Employee();
        System.out.println(serializationExample.i);
        System.out.println(Employee.j);
        System.out.println(serializationExample.k);
        System.out.println(serializationExample.l);
        File f=new File("C:/Users/lenovo/Desktop/yogi");
        FileOutputStream fis=new FileOutputStream(f);
        ObjectOutputStream ois=new ObjectOutputStream(fis);
        ois.writeObject(serializationExample);


        FileInputStream fiis=new FileInputStream(f);
        ObjectInputStream obis=new ObjectInputStream(fiis);
        Object o = obis.readObject();
        Employee obj1 = (Employee) o;
        System.out.println(obj1.i);
        System.out.println(obj1.j);
        System.out.println(obj1.k);
        System.out.println(obj1.l);
    }
}
