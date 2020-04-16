import java.io.*;

public class SerializationDeserialization {

    public static void main(String[] args) throws IOException {
        Student student = new Student();
        System.out.println(Student.getI());
        System.out.println(student.getJ());
        System.out.println(student.getK());
        System.out.println(student.getL());
        FileOutputStream fileOutputStream = new FileOutputStream(new File("C:/Users/lenovo/Desktop/moti"));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        FileInputStream fileInputStream = new FileInputStream(new File("C:/Users/lenovo/Desktop/moti"));
        try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Student student1 =(Student)objectInputStream.readObject();
            System.out.println("after serialization");
            System.out.println(student1.getI());
            System.out.println(student1.getJ());
            System.out.println(student1.getK());
            System.out.println(student1.getL());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
