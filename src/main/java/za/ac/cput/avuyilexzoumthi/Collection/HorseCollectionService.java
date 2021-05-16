package za.ac.cput.avuyilexzoumthi.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class HorseCollectionService {
    private Collection<Horse> Collect;

    public HorseCollectionService(){
        Collect= new ArrayList<>();
    }

    public HorseCollectionService(ArrayList<Horse> Collect){
        this.Collect= Collect;
    }
    public void add(Horse Breed){

        Collect.add(Breed);
    }
    public Horse find(String name){
        for(Horse horse: Collect){
            if (horse.getName().equals(name)){
                return horse;
            }
        }
        return null;
    }

    public void remove(Horse id){
        Collect.remove(id);
    }

}
