package RestAPIpractice;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.LinkedHashMap;

public class Restaapi {

    public static void main(String[] args) {

        JSONObject obj = new JSONObject();

        obj.put("ojectsate", "New");
        obj.put("Name", "Manoj");
        obj.put("Place", "Mandya");

        JSONArray arr = new JSONArray();
        LinkedHashMap map = new LinkedHashMap();

        map.put("ooru", "manda");
        map.put("number", 7);
        map.put("when", "saturday");
        map.put("virus","omicron");
        arr.add(map);
        obj.put("data", arr);

        LinkedHashMap map2 = new LinkedHashMap();

        map2.put("ooru1", "manda1");
        map2.put("number1", 71);
        map2.put("when1", "saturday1");
        map2.put("virus1","omicron1");
        arr.add(map2);

        System.out.println(obj);

    }
}
