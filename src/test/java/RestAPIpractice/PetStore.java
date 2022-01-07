package RestAPIpractice;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.LinkedHashMap;

public class PetStore {

    public static void main(String[] args) {

        JSONObject obj = new JSONObject();

        obj.put("id",0);
        obj.put("name:", "doggie");
        obj.put("status", "available");

        LinkedHashMap mapi = new LinkedHashMap();
        mapi.put("id",0);
        mapi.put("name:", "Max");
        obj.put("category", mapi);

        JSONArray arr = new JSONArray();
        arr.add("String");
        obj.put("photoUrls", arr);

        JSONArray arr1 = new JSONArray();
        LinkedHashMap map = new LinkedHashMap();
        map.put("id",0);
        map.put("name:", "Max");
        arr1.add(map);
        obj.put("tags", arr1);

        System.out.println(obj);

    }
}
