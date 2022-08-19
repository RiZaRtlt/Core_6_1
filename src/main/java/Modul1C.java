import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Modul1C {
    public Modul1C(){

    }
    // При начале сеанса 1С необходимо установить ПараметрыСеанса которые между сеансами хранятся в константах.
    // Количество ПараметровСеанса и количество констант должны всегда
    // совпадать. Чтобы не поместить сломанный код в продакшен для этой процедуры добавим тест
    public void getParamSeans(List<String> rezultZaprosa) {
        // Данная процедура заполняет параметры сеанса из констант
        Map<Const, String> map = new HashMap<>();
        int i = 0;
        for (Const elem:Const.values()) {
            map.put(elem, rezultZaprosa.get(i));
            i++;
        }
    }
}
