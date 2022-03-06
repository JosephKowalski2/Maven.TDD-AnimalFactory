package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Calendar;
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

    @Test
    public void removeCatTest() {
        // Given
        Cat cat = new Cat(null,null,null);
        Integer expectedNumberofCats = 1;

        // When
        CatHouse.add(cat);
        CatHouse.add(cat);
        CatHouse.add(cat);
        CatHouse.remove(cat);
        CatHouse.remove(cat);
        Integer actualNumberofCats = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expectedNumberofCats, actualNumberofCats);
    }

    @Test
    public void removeIdTest() {
        // Given
        Cat cat = new Cat(null,null,123);
        Cat cat2 = new Cat(null,null,321);
        Integer expectedCats = 0;

        // When
        CatHouse.add(cat);
        CatHouse.add(cat2);
        CatHouse.remove(123);
        CatHouse.remove(321);
        Integer actualCats = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expectedCats, actualCats);
    }

    @Test
    public void getCatByIdTest() {
        // Given
        Cat cat = new Cat(null,null,123);
        Cat cat2 = new Cat(null,null,321);
        cat.setName("Azula");
        cat2.setName("Aang");
        Date date = new Date(2019, Calendar.OCTOBER, 12);
        cat.setBirthDate(date);
        cat2.setBirthDate(date);
        Cat expectedCat = cat;

        // When
        CatHouse.add(cat);
        CatHouse.add(cat2);
        Cat actualCat = CatHouse.getCatById(123);

        // Then
        Assert.assertEquals(expectedCat, actualCat);
    }

    @Test
    public void getNumberOfCatsTest() {
        // Given
        Cat cat = new Cat(null,null,null);
        Integer expectedCats = 6;

        // When
        CatHouse.add(cat);
        CatHouse.add(cat);
        CatHouse.add(cat);
        CatHouse.add(cat);
        CatHouse.add(cat);
        CatHouse.add(cat);
        Integer actualCats = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expectedCats, actualCats);
    }

}
