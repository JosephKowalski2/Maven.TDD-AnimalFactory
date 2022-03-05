package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;
import static java.util.Calendar.JANUARY;

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
        Date expectedBirthdate = new Date(2019, JANUARY, 13);
        Dog dog = AnimalFactory.createDog(expectedName, expectedBirthdate);

        // When
        String actualName = dog.getName();
        Date actualBirthdate = dog.getBirthDate();

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthdate, actualBirthdate);
    }
}
