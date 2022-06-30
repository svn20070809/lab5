package Zad1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProgramServiceFor1Zad {
    public Integer[] arr;

    public Integer MaxElement()
    {
        return Arrays.stream(arr).max(Comparator.naturalOrder()).get();
    }
    public Integer MinElement() {return Arrays.stream(arr).min(Comparator.naturalOrder()).get();}
    public Integer IndexMinElement(){return Arrays.stream(arr).toList().indexOf(MinElement());}
    public Integer IndexRightMinElement() {return Arrays.stream(arr).toList().lastIndexOf(MinElement());}
    public int[] ElementsBetweenMin()
    {
        return IntStream.range(IndexMinElement()+1,IndexRightMinElement())
                .map(i->arr[i])
                .toArray();
    }
    public Integer SumElementsBetweenMin()
    {
        return Arrays.stream(ElementsBetweenMin()).sum();
    }
    public long CountElementsBetweenMin()
    {
        return Arrays.stream(ElementsBetweenMin()).count();
    }
    public double AverageElementsBetweenMin()
    {
        return Arrays.stream(ElementsBetweenMin()).average().getAsDouble();
    }
    public Integer[] SordetArrReverdeOrder()
    {
        return  Arrays.stream(arr).sorted(Collections.reverseOrder())
                .toArray(Integer[] :: new);
    }
    public Integer[] SordetArr()
    {
        return  Arrays.stream(arr).sorted()
                .toArray(Integer[] :: new);
    }
    public Integer[] FiveElements()
    {
        return  Arrays.stream(arr).skip(5).limit(5)
                .toArray(Integer[] :: new);
    }
    public Integer[] FiveMaxElements()
    {
        return Arrays.stream(SordetArrReverdeOrder()).limit(5)
                .toArray(Integer[] :: new);
    }
    public Integer SumElementStartingFive()
    {
        return Arrays.stream(arr).mapToInt(x->x).skip(5).sum();
    }
    public Integer SumElementsStartingFoureToMin() {
        return IntStream.range(3, IndexMinElement())
                .map(i -> arr[i])
                .sum();
    }
    public Integer[] FiveElementsSmallerByMaximumOfK(Integer k)
    {
        return Arrays.stream(arr).limit(5).filter(x->x<MaxElement()-k)
                .toArray(Integer[] :: new);
    }
    public Integer[] FiveMinElements()
    {
        return  Arrays.stream(SordetArr()).limit(5)
                .toArray(Integer[] :: new);
    }
    public Integer[] ArrOfTwoArray()
    {
        return Stream.concat(Stream.of(FiveMaxElements()), Stream.of(FiveMinElements()))
                .toArray(Integer[]::new);
    }
    public Integer[] ArrayDoesNotContainElementAnotherArray()
    {
        return Arrays.stream(arr).filter(x-> Arrays.stream(FiveMaxElements()).noneMatch(x::equals))
                .toArray(Integer[]::new);
    }
    public Integer[] ArrayWithoutRepeatingElements()
    {
        return Arrays.stream(arr).distinct()
                .toArray(Integer[]::new);
    }
}