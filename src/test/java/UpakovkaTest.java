import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class UpakovkaTest {
    Upakovka upakovka;

    @BeforeEach
    public void init() {
        upakovka = new Upakovka();
    }

    @AfterEach
    public void complete() {
        upakovka = null;
    }

    @Test
    public void generUpak() {
        // Базе обязательно должны быть предопределенные элементы справочника "Упаковик единицы измерения"

        // given:
        List<Upakovka> nullList = new ArrayList<>();
        // when:
        List<Upakovka> result = upakovka.generUpak();
        // then:
       Assertions.assertNotEquals(result, nullList);
    }

    @Test
    public void testOnNolInZnam() {
        // Во всех элементах справочника "Упаковки единицы измерения" обязательно должен быть заполнен знаменатель
        // чтобы в работе не получать деления на 0 при преобразовании КоличествоУпаковок в Количество товара.

        // given:
        long NolRezult = 0;
        // when:
        long cout = upakovka.testOnNolInZnam();
        // then:
        Assertions.assertEquals(cout , NolRezult);
    }

}

