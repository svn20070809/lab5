package Zad3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortingData {
    public static void Sort(Competitions[] competitions)
    {
        Arrays.stream(competitions).sorted(Comparator.comparing(Competitions::getBirthYear));
    }
}
