import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class MainTest {
    List<Integer> list = new ArrayList<>();

    @Test
    public void testList() {
        list.add(4);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(7);
        list.add(9);
        Filter filter = new Filter(5);
        List<Integer> result = filter.filterOut(list);

        int expectedSize = 3;
        int resultSize = result.size();
        Assertions.assertEquals(expectedSize, resultSize);
    }
}