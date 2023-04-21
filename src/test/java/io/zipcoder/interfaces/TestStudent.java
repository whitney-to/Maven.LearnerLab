package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        Student s = new Student(null,null);
        Assert.assertTrue(s instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student s = new Student(null,null);
        Assert.assertTrue(s instanceof Person);
    }

    @Test
    public void testLearn(){
        Student s = new Student(3542345l,"GoodOne");
        s.learn(10);
        Double expected = 10.0;

        Double actual = s.getTotalStudyTime();

        Assert.assertEquals(expected,actual);
    }
}
