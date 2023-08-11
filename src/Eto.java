import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;

public class Eto {
    public static void main(String[] args) {
        List<String> Etolist = List.of("う", "たつ", "み", "うま");
        List<String> result = Etolist.stream()
                .filter(Eto -> Eto.contains("う"))
                .toList();


        Map<String, Integer> EtoMap = new LinkedHashMap<String, Integer>();  //Map
        EtoMap.put("う", 1999);
        EtoMap.put("たつ", 2000);
        EtoMap.put("み", 2001);
        EtoMap.put("うま", 2002);
        EtoMap.entrySet().stream()
                .map(name -> name.getKey() + ":" + name.getValue())
                .forEach(System.out::println);
    }
}
