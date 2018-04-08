package wk.features;

import org.junit.Assert;
import org.junit.Test;

public class JointUnionTest {
    @Test
    public void jointTest() {
        Person<Student> student = new Person<>(new Student());
        Assert.assertEquals(student.object.getFather(), "A");
        Assert.assertEquals(student.object.getAddress(), "B");
        //Person<Family> f = new Person();
    }
}

interface Address {
    public String getAddress();
}

interface Family {
    public String getFather();
}

class Person<T extends Address & Family> {
    public T object;

    Person(T t) {
        object = t;
    }
}

class Student implements Address, Family {

    @Override
    public String getFather() {
        return "A";
    }

    @Override
    public String getAddress() {
        return "B";
    }
}
