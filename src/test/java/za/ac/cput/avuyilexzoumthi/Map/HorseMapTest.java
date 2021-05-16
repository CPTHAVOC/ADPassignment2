package za.ac.cput.avuyilexzoumthi.Map;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HorseMapTest extends TestCase {
    @Test
    public void testAdd() {
        Map<Integer, Horse> map= new HashMap<>();
        HorseMap serv = new HorseMap(map);
        Horse horse= new Horse();
        horse.setName("Dream");
        horse.setBreed("Twilight");

        serv.add(1,horse);
        assertTrue(map.containsKey(1));
        assertTrue(map.containsValue(horse));

    }
    @Test
    public void testFind() {
        Map<Integer, Horse> map= new HashMap<>();
        HorseMap serv = new HorseMap(map);
        Horse horse= new Horse();
        horse.setName("Dream");
        horse.setBreed("Twilight");
        serv.add(1,horse);
        Horse gothorse= serv.find(1);
        assertEquals(gothorse,horse);
        System.out.println(horse.getName());


    }

    @Test
    public void testRemove() {
        Map<Integer, Horse> map= new HashMap<>();
        HorseMap serv = new HorseMap(map);
        Horse horse= new Horse();
        horse.setName("Dream");
        horse.setBreed("Twilight");
        serv.add(1,horse);

        serv.remove(1);
        assertFalse(map.containsKey(1));

    }
}