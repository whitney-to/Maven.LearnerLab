package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor i = new Instructor(3452345l,"tea");
        Assert.assertTrue(i instanceof Teacher);
    }
    @Test
    public void testInheritance(){
        Instructor i = new Instructor(3452345l,"tea");
        Assert.assertTrue(i instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor i = new Instructor(3452345l,"tea");
        Student s = new Student(52345l,"stu");

        i.teach(s,10);

        Double expected = 10.0;
        Double actual = s.getTotalStudyTime();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testLecture(){
        Instructor i = new Instructor(3452345l,"tea");
        Student[] s = {new Student(52345l,"stu"),new Student(77800l,"stu2")};

        i.lecture(s,10);

        Double expected = 10.0;
        for(Learner l : s){
            Double actual = l.getTotalStudyTime();
            Assert.assertEquals(expected,actual);
        }

    }
}
