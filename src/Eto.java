import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;

public class Eto {
    public static void main(String[] args) {
        List<String> etolist = List.of("う", "たつ", "み", "うま");
        List<String> result = etolist.stream()
                .filter(Eto -> Eto.contains("う"))
                .toList();


        Map<String, Integer> etoMap = new LinkedHashMap<String, Integer>();  //Map
        etoMap.put("う", 1999);
        etoMap.put("たつ", 2000);
        etoMap.put("み", 2001);
        etoMap.put("うま", 2002);
        etoMap.entrySet().stream()
                .map(name -> name.getKey() + ":" + name.getValue())
                .forEach(System.out::println);
    }
}
