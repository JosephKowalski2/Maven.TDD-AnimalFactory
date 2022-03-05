package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Calendar;
import java.util.Date;


/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest() {
        // Given
        String expectedName = "Trogdor";
        Date expectedBirthdate = new Date(2019, Calendar.JANUARY, 13);
        Dog dog = AnimalFactory.createDog(expectedName, expectedBirthdate);

        // When
        String actualName = dog.getName();
        Date actualBirthdate = dog.getBirthDate();

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthdate, actualBirthdate);
    }

    @Test
    public void createCatTest() {
        // Given
        String expectedName = "Mack";
        Date expectedBirthdate = new Date(2018, Calendar.MARCH, 17);
        Cat cat = AnimalFactory.createCat(expectedName, expectedBirthdate);

        // When
        String actualName = cat.getName();
        Date actualBirthdate = cat.getBirthDate();

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthdate, actualBirthdate);
    }

}
