package Zad2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProgramServiceForZad2 {
    public String[] arr;

    public String MaxElement()
    {
        return Arrays.stream(arr).max(Comparator.naturalOrder()).get();
    }
    public String MinElement() {return Arrays.stream(arr).min(Comparator.naturalOrder()).get();}

    public Integer IndexMinElement(){return Arrays.stream(arr).toList().indexOf(MinElement());}
    public Integer IndexRightMinElement() {return Arrays.stream(arr).toList().lastIndexOf(MinElement());}
    public String[] ElementsBetweenMin()
    {
        return IntStream.range(IndexMinElement()+1,IndexRightMinElement())
                .mapToObj(i->arr[i])
                .toArray(String[] :: new);
    }
    public String SumElementsBetweenMin()
    {
        return Arrays.stream(ElementsBetweenMin()).collect(Collectors.joining());
    }
    public Long CountElementsBetweenMin()
    {
        return Arrays.stream(ElementsBetweenMin()).collect(Collectors.counting());
    }
    public String[] SordetArr()
    {
        return  Arrays.stream(arr).sorted()
                .toArray(String[] :: new);
    }
    public String[] SordetArrReverdeOrder()
    {
        return  Arrays.stream(arr).sorted(Collections.reverseOrder())
                .toArray(String[] :: new);
    }
    public String[] FiveElements()
    {
        return  Arrays.stream(arr).skip(5).limit(5)
                .toArray(String[] :: new);
    }
    public String[] FiveMaxElements()
    {
        return  Arrays.stream(SordetArrReverdeOrder()).limit(5)
                .toArray(String[] :: new);
    }

    public String SumElementStartingFive()
    {
        return Arrays.stream(arr).skip(5).collect(Collectors.joining());
    }
    public String SumElementsStartingFoureToMin() {
        return IntStream.range(3, IndexMinElement())
                .mapToObj(i -> arr[i])
                .collect(Collectors.joining());
    }

    public String[] FiveMinElements()
    {
        return  Arrays.stream(SordetArr()).limit(5)
                .toArray(String[] :: new);
    }
    public String[] ArrOfTwoArray()
    {
        return Stream.concat(Stream.of(FiveMaxElements()), Stream.of(FiveMinElements()))
                .toArray(String[]::new);
    }
    public String[] ArrayDoesNotContainElementAnotherArray()
    {
        return  Arrays.stream(arr).filter(x-> Arrays.stream(FiveMaxElements()).noneMatch(x::equals))
                .toArray(String[] :: new);
    }
    public String[] ArrayWithoutRepeatingElements()
    {
        return  Arrays.stream(arr).distinct()
                .toArray(String[] :: new);
    }
    public String[] ElementsStartB()
    {
        return  Arrays.stream(arr).filter(x->x.startsWith("б"))
                .toArray(String[] :: new);
    }
    public String[] ElementsNotStartB()
    {
        return  Arrays.stream(arr).filter(x-> !x.startsWith("б"))
                .toArray(String[] :: new);
    }
}
