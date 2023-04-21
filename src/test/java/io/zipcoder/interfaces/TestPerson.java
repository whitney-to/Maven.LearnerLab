package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        Person person = new Person(2897124l,"BOO");
        Long expected = 2897124l;
        String expectedName = "BOO";

        Long actual = person.getId();
        String actualName = person.getName();

        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expectedName,actualName);
    }
}
