import java.util.HashMap;

public class Hash_map {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        map1.put(1, 100);
        map1.put(2, 200);
        System.out.println(map1.get(1));
        map1.remove(2);
        System.out.println(map1.containsKey(1));
        System.out.println();

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("age", 18);
        map2.put("cgpa", 10);
        System.out.println(map2.get("age"));
        map2.remove("grade");
        System.out.println(map2.containsKey("age"));
        System.out.println();

         HashMap<String, String> map3 = new HashMap<>();
        map3.put("Name", "Adarsh");
        map3.put("Residence", "Gittikhadan");
        System.out.println(map3.get("Name"));
        map3.remove("Name");
        System.out.println(map3.containsKey("Residence"));

    }
}
