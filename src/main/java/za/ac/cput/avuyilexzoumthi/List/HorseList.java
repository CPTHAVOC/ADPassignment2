package za.ac.cput.avuyilexzoumthi.List;

import java.util.ArrayList;
import java.util.List;

public class HorseList {
    private List<Horse>list;

    public HorseList(){
        list = new ArrayList<Horse>(){};
    }

    public HorseList(List<Horse>list){
        this.list = list;
    }

    public void add(Horse horse){
        list.add(horse);
    }

    public Horse find(String name){
        for(Horse horse: list){
            if (horse.getName().equals(name)){
                return horse;
            }
        }
        return null;
    }

    public void remove(Horse horse){
        list.remove(horse);
    }

}
