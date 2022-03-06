package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addDogTest() {
        // Given
        Dog dog = new Dog(null,null,null);
        Integer expectedNumberofDogs = 2;

        // When
        DogHouse.add(dog);
        DogHouse.add(dog);
        Integer actualNumberofDogs = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expectedNumberofDogs, actualNumberofDogs);
    }

    @Test
    public void removeDogTest() {
        // Given
        Dog dog = new Dog(null,null,null);
        Integer expectedNumberofDogs = 2;

        // When
        DogHouse.add(dog);
        DogHouse.add(dog);
        DogHouse.add(dog);
        DogHouse.add(dog);
        DogHouse.remove(dog);
        DogHouse.remove(dog);
        Integer actualNumberofDog = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expectedNumberofDogs, actualNumberofDog);
    }

    @Test
    public void removeIdTest() {
        // Given
        Dog dog = new Dog(null,null,452);
        Dog dog2 = new Dog(null,null,756);
        Integer expectedDogs = 1;

        // When
        DogHouse.add(dog);
        DogHouse.add(dog2);
        DogHouse.remove(756);
        Integer actualDogs = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expectedDogs, actualDogs);
    }

    @Test
    public void getDogByIdTest() {
        // Given
        Dog dog = new Dog(null,null,876);
        Dog dog2 = new Dog(null,null,730);
        dog.setName("Rock");
        dog2.setName("Water");
        Date date = new Date(2014, Calendar.SEPTEMBER, 9);
        dog.setBirthDate(date);
        dog2.setBirthDate(date);
        Dog expectedDog = dog2;

        // When
        DogHouse.add(dog);
        DogHouse.add(dog2);
        Dog actualDog = DogHouse.getDogById(730);

        // Then
        Assert.assertEquals(expectedDog, actualDog);
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
