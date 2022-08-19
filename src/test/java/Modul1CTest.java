import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class Modul1CTest {
    Modul1C module;

    @BeforeEach
    public void init() {
        module = new Modul1C();
    }

    @AfterEach
    public void complete() {
        module = null;
    }

    @Test
    public void getParamSeans() {
    // given:
        List<String> testList = Arrays.asList("Rez1", "Rez2", "Rez3", "Rez4");
    // then:
        assertDoesNotThrow(() -> module.getParamSeans(testList));
    }

}