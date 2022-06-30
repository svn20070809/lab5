package Zad3;

import java.util.Arrays;
import java.util.Objects;

public class SearchData {
    public static Competitions Search(Competitions[] competitions, String fullName) {
        return Arrays.stream(competitions).filter(c -> c.getFullName().equals(fullName)).findFirst().get();
    }
}
