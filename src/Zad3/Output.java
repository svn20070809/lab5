package Zad3;

import java.util.Arrays;

public class Output {
    public static void OutputData(Competitions[] competitions)
    {
        Arrays.stream(competitions).forEach(i->System.out.println(i));
    }
}
