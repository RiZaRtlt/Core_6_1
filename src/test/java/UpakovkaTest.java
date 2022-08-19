import org.junit.jupiter.api.*;

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
        List<Upakovka> list = upakovka.generUpak();
        // then:
       Assertions.assertNotEquals(list.size() ,0);

       // Во всех элементах справочника "Упаковки единицы измерения" обязательно должен быть заполнен знаменатель
        // чтобы в работе не получать деления на 0 при преобразовании КоличествоУпаковок в Количество товара.
       long cout = list.stream()
               .filter(elem -> elem.znam == 0)
               .count();
        Assertions.assertEquals(cout ,0);
    }

}

