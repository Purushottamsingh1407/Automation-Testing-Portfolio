import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {

    // Count the number of names starting with alphabet A in list
    @Test
    public void regular() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Abhijeet");
        names.add("DON");
        names.add("Alekhaya");
        names.add("Adam");
        names.add("Ram");

        int count = 0;
        System.out.println("Names starting with A:");
        for (String name : names) {
            if (name != null && name.toUpperCase().startsWith("A")) {
                System.out.println(name);
                count++;
            }
        }

        System.out.println("Total names starting with A = " + count);
        // Assertion using TestNG
        Assert.assertEquals(count, 3, "Count of names starting with A should be 3");
    }
    // no additional tests
    
    
}