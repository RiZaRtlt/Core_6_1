import java.util.ArrayList;
import java.util.List;

public class Upakovka {
    boolean itsUpak;
    String name;
    int chis;
    int znam;

    public Upakovka() {

    }

    public Upakovka(boolean itsUpak, String name, int chis, int znam) {
        this.itsUpak = itsUpak;
        this.name = name;
        this.chis = chis;
        this.znam = znam;
    }

    public List<Upakovka> generUpak() {
        List<Upakovka> list = new ArrayList<>();
        list.add(new Upakovka(false, "шт.", 1,1));
        list.add(new Upakovka(false, "л", 1,1));
        list.add(new Upakovka(true, "короб", 10, 1));

        return list;
    }

    public long testOnNolInZnam() {
        List<Upakovka> list = generUpak();
        long rezult = list.stream()
                .filter(elem -> elem.znam == 0)
                .count();
        return rezult;
    }
}
