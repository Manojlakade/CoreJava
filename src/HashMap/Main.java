package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // HashMap = a data strjcture that store key valur pairs/
        //           keys are unique, but values can be duplicate
        //           does not maintain any order,but is memory efficient
        //           HashMap<key,value>

        HashMap<String,Double> map=new HashMap<>();

        map.put("apple",0.50);
        map.put("pinapple",1.89);
        map.put("bananna",1.12);

        map.remove("apple");
        System.out.println(map.get("bananna"));  //1.12
        System.out.println(map.containsKey("bananna"));
        System.out.println(map.containsValue(1.89));
        System.out.println(map.size());

        System.out.println(map);                  //{pinapple=1.89, bananna=1.12}

        // for printing key value more properly
        for( String key: map.keySet()){
            System.out.println( key + " : $" + map.get(key));
        }
    }
}
