package za.ac.cput.avuyilexzoumthi.Map;

import java.util.HashMap;
import java.util.Map;

public class HorseMap {
    private Map<Integer, Horse> map;

    public HorseMap(){

        map= new HashMap<>();
    }

    public HorseMap(Map<Integer, Horse> map){
        this.map = map;

    }

    public void add(int id, Horse detail){
        map.put(id,detail);

    }

    public Horse find(int id){
        return map.get(id);
    }

    public void remove(int id){
        map.remove(id);
    }


}
