package za.ac.cput.avuyilexzoumthi.Set;

import java.util.HashSet;
import java.util.Set;

public class HorseSet {
    private Set<Horse> set;

    public HorseSet(){

        set= new HashSet<Horse>(){};
    }

    public HorseSet(Set<Horse> set){

        this.set = set;

    }

    public void add(Horse horse){

        set.add(horse);

    }

    public Horse find(String name){

        for(Horse horse: set){
            if (horse.getName().equals(name)){
                return horse;
            }
        }
        return null;
    }

    public void remove(Horse horse){
        set.remove(horse);
    }

}
