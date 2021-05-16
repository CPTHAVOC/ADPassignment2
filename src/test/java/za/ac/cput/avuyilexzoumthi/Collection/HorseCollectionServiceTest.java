package za.ac.cput.avuyilexzoumthi.Collection;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;

public class HorseCollectionServiceTest extends TestCase {
    @Test
    public void testAdd() {
        ArrayList<Horse> collection = new ArrayList<>();
        HorseCollectionService service = new HorseCollectionService(collection);
        Horse horse= new Horse();

        horse.setName("Dream");
        horse.setBreed("Twilight");
        service.add(horse);
        assertTrue(collection.contains(horse));
    }

    @Test
    public void testFind() {
        ArrayList<Horse> collection = new ArrayList<>();
        HorseCollectionService service = new HorseCollectionService(collection);
        Horse horse = new Horse();

        horse.setName("Dream");
        horse.setBreed("Twilight");
        service.add(horse);

        Horse foundProduct = service.find("Dream");
        assertEquals(foundProduct,horse);
        System.out.println(horse.getName());
    }

    @Test
    public void testRemove() {
        ArrayList<Horse> collection = new ArrayList<>();
        HorseCollectionService service = new HorseCollectionService(collection);
        Horse horse = new Horse();

        horse.setName("Dream");
        horse.setBreed("Twilight");
        service.add(horse);

        service.remove(horse);
        assertFalse(collection.contains(horse));
    }
}