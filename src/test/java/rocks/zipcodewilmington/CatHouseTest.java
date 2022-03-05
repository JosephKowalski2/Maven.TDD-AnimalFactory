package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

import static java.util.Calendar.JANUARY;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest() {
        // Given
        Cat cat = new Cat(null,null,null);
        Integer expectedNumberofCats = 3;

        // When
        CatHouse.add(cat);
        CatHouse.add(cat);
        CatHouse.add(cat);
        Integer actualNumberofCats = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expectedNumberofCats, actualNumberofCats);
    }

}
