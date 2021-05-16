package za.ac.cput.avuyilexzoumthi.List;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;


public class HorseListTest extends TestCase {
    @Test
    public void testAdd(){
        ArrayList<Horse> list =new ArrayList<>();
        HorseList serv = new HorseList(list);
        Horse horse = new Horse();
        horse.setName("Dream");
        horse.setBreed("Twilight");

        serv.add(horse);
        assertTrue(list.contains(horse));
    }

    @Test
    public void testFind() {
        ArrayList<Horse> list =new ArrayList<>();
        HorseList serv = new HorseList(list);
        Horse horse = new Horse();
        horse.setName("Dream");
        horse.setBreed("Twilight");
        serv.add(horse);

        Horse gotHorse= serv.find("Dream");
        assertEquals(gotHorse,horse);
        System.out.println(horse.getName());

    }

    @Test
    public void testRemove(){
        ArrayList<Horse> list =new ArrayList<>();
        HorseList serv = new HorseList(list);
        Horse horse = new Horse();
        horse.setName("Dream");
        horse.setBreed("Twilight");
        serv.add(horse);

        serv.remove(horse);
        assertFalse(list.contains(horse));
    }


}