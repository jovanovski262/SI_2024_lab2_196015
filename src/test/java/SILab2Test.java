import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void checkAllItemsNull() {

        RuntimeException exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 300));

        assertEquals("allItems can not be Null", exception.getMessage());

    }

    @Test
    void checkTrue() {


        List<Item> allItems = new ArrayList<>();
        allItems.add((new Item("Item1", "123456", 200, 0.2f)));

        SILab2.checkCart(allItems, 300);
        assertFalse(SILab2.checkCart(allItems, 300));

    }
}