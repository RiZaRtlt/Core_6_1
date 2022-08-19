import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //в 1С есть свой автотестер Vanessa-ADD в работе с которой у меня больше года опыта
        // зачем нужны тесты до боли знакомо.
        // Т.к. мне сложно придумать какие-то примеры на прошлых домашних работах,
        // то представим гипотетические методы из реальной работы в 1С

        Modul1C module = new Modul1C();

        module.getParamSeans(Arrays.asList("Rez1", "Rez2", "Rez3", "Rez4"));
    }
}
