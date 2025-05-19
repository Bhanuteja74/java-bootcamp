import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        assertEquals(1,1);
    }

    @Test
    void anotherTest() {
        Main main = new Main();
        String greet = main.greet();
        assertEquals(greet,"Hello World!");
    }

}