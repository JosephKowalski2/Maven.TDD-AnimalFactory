package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;

import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

import static java.util.Calendar.APRIL;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setNameTest2() {
        // Given
        Dog dog = new Dog(null, null, null);
        String expectedName = "Hunter";

        // When
        dog.setName(expectedName);
        String actualName = dog.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void setBirthdateTest() {
        // Given
        Dog dog = new Dog(null, null, null);
        Date expectedBirthdate = new Date(2010,APRIL,11);

        // When
        dog.setBirthDate(expectedBirthdate);
        Date actualBirthdate = dog.getBirthDate();

        // Then
        Assert.assertEquals(expectedBirthdate, actualBirthdate);
    }

    @Test
    public void speakTest() {
        // Given
        Dog dog = new Dog(null, null, null);
        String expectedSpeak = "bark!";

        // When
        String actualSpeak = dog.speak();

        // Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void eatTest() {
        // Given
        Dog dog = new Dog(null, null, null);
        Food food = new Food();
        Integer expectedEat = 2;

        // When
        dog.eat(food);
        dog.eat(food);
        Integer actualEat = dog.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expectedEat, actualEat);
    }

    @Test
    public void getIdTest() {
        // Given
        Dog dog = new Dog(null, null, 321);
        Integer expectedId = 321;

        // When
        Integer actualId = dog.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void animalInheritanceTest() {
        // Given
        Dog dog = new Dog(null, null, null);

        // Then
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void mammalInheritanceTest() {
        // Given
        Dog dog = new Dog(null, null, null);

        // Then
        Assert.assertTrue(dog instanceof Mammal);
    }

}
