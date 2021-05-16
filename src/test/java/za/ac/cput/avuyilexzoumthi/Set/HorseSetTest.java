package za.ac.cput.avuyilexzoumthi.Set;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class HorseSetTest extends TestCase {
    @Test
    public void testAdd() {
        Set<Horse> set = new HashSet<>();
        HorseSet serv = new HorseSet(set);
        Horse horse = new Horse();
        horse.setName("Dream");
        horse.setBreed("Twilight");
        serv.add(horse);
        assertTrue(set.contains(horse));

    }
    @Test
    public void testFind() {
        Set<Horse> set = new HashSet<>();
        HorseSet serv = new HorseSet(set);
        Horse horse = new Horse();
        horse.setName("Dream");
        horse.setBreed("Twilight");
        serv.add(horse);

        Horse gotHorse = serv.find("Dream");
        assertEquals(gotHorse, horse);
    }
    @Test
    public void testRemove() {
        Set<Horse> set = new HashSet<>();
        HorseSet serv = new HorseSet(set);
        Horse horse = new Horse();
        horse.setName("Dream");
        horse.setBreed("Twilight");
        serv.add(horse);

        serv.remove(horse);
        assertFalse(set.contains(horse));
    }
}