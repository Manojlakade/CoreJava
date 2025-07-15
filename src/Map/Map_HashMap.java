package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_HashMap {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("us","United States");
        map.put("in","india");
        //modidfy value
        map.putIfAbsent("in","india2"); //puts only if key  is absent

        map.put("en","indian");


        System.out.println(map);

        map.remove("en");

        System.out.println();


        System.out.println(map.containsKey("in"));

        System.out.println(map);
        System.out.println(map.getOrDefault("pn","others"));

        Set<String > keys=map.keySet();
        System.out.println(keys);

        Collection<String> values=map.values();
        System.out.println(values);

        Set<Map.Entry<String,String>> entries=map.entrySet();
        System.out.println("ENTRIES");
        for(Map.Entry<String,String> entry:entries){
            System.out.println(entry.getKey() + ","+ entry.getValue());
        }



    }

}
