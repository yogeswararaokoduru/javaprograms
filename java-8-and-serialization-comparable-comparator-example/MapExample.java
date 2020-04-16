import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        //TreeMap<Employee,String> treeMap=new TreeMap();
        Map<Employee,String> treeMap=new HashMap<>();
        Employee employee1=new Employee();
        Employee employee2=new Employee();
        employee1.setId("123");
        employee1.setAddress("123");
        employee1.setNmae("123");
        employee2.setId("234");
        employee2.setAddress("234");
        employee2.setNmae("234");
        treeMap.put(employee1,"one");
        treeMap.put(employee2,"two");
        System.out.println(treeMap);
    }
}
