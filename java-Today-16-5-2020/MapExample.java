import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("one", "ten");
        map.put("two", "twenty");
        map.put("three", "thirty");
        map.put("four", "fourty");
        map.put("five", "fisty");

        System.out.println(map.values());
        System.out.println(map.get("one"));

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> mpr : entries) {
            System.out.println(mpr.getKey() + "=====" + mpr.getValue());
        }
        Set<Map.Entry<String, String>> entriesitr = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entriesitr.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey() + "::::::::" + next.getValue());
        }

    }

}
