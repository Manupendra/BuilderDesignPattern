import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class BuilderPatternTest {
    @Test
    void testPerson(){
        Person p = new Person.Builder()
                .setAge(18)
                .setFathername("Naval")
                .setFirstname("Ratan")
                .setLastname("Tata")
                .setAge(84)
                .build();

        assertEquals(p.persondetails(),"84RatannullTataNavalnull");
    }
}
