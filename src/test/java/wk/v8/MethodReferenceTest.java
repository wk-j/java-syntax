package wk.v8;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;
import org.junit.Assert;
import org.junit.Test;

public class MethodReferenceTest {

    @Test
    public void staticTest() {
        Collection<String> emails = Arrays.asList("a", "b", "a@c.com");
        Stream<String> r1 = emails.stream().filter(User::isEmail);
        Assert.assertEquals(1, r1.count());
    }

    @Test
    public void instanceTest() {
        Collection<String> emails = Arrays.asList("a", "b", "a@c.com");
        User user = new User();
        Stream<String> r2 = emails.stream().filter(user::isEmail2);
        Assert.assertEquals(1, r2.count());
    }

    @Test
    public void testVar() {
        var a = 100;
        var b = 100;
        Assert.assertEquals(a, b);
    }

    @Test
    public void constructorTest() {
        Collection<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
        Stream<User> users = data.stream().map(User::new);
        Assert.assertEquals(5, users.count());
    }
}

class User {

    private int age;

    public User() {
    }

    public User(int age) {
        this.age = age;
    }

    public static boolean isEmail(String token) {
        return token.contains("@");
    }

    public boolean isEmail2(String token) {
        return token.contains("@");
    }
}
