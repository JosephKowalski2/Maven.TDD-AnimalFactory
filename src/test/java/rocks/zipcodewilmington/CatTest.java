package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given
        Cat cat = new Cat(null, null, null);
        String expectedName = "Murphy";

        // When
        cat.setName(expectedName);
        String actualName = cat.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setBirthdateTest() {
        // Given
        Cat cat = new Cat(null, null, null);
        Date expectedBirthdate = new Date(9,11,2000);

        // When
        cat.setBirthDate(expectedBirthdate);
        Date actualBirthdate = cat.getBirthDate();

        // Then
        Assert.assertEquals(expectedBirthdate, actualBirthdate);
    }

    @Test
    public void speakTest() {
        // Given
        Cat cat = new Cat(null, null, null);
        String expectedSpeak = "meow!";

        // When
        String actualSpeak = cat.speak();

        // Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void eatTest() {
        // Given
        Cat cat = new Cat(null, null, null);
        Food food = new Food();
        Integer expectedEat = 4;

        // When
        cat.eat(food);
        cat.eat(food);
        cat.eat(food);
        cat.eat(food);
        Integer actualEat = cat.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expectedEat, actualEat);
    }

    @Test
    public void getIdTest() {
        // Given
        Cat cat = new Cat(null, null, 123);
        Integer expectedId = 123;

        // When
        Integer actualId = cat.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
    }

}
