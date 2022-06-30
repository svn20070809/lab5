package Zad1;

import java.util.Arrays;

public class MainZad1 {
    public void Main()
    {
        var tests=new TestsClass();
        ProgramServiceFor1Zad programServiceFor1Zad =new ProgramServiceFor1Zad();
        programServiceFor1Zad.arr=tests.Arr();
        System.out.printf("Максимальный:%d\n", programServiceFor1Zad.MaxElement());
        System.out.printf("Минимальный:%d\n", programServiceFor1Zad.MinElement());
        System.out.printf("Индекс левого минимального и правого:%d и %d\n",
                programServiceFor1Zad.IndexMinElement(), programServiceFor1Zad.IndexRightMinElement());
        System.out.print("Массив между левым и правым мин:\n");
        Arrays.stream(programServiceFor1Zad.ElementsBetweenMin()).forEach(i -> System.out.println(i));
        System.out.printf("Сумма между левым и правым мин:%d\n", programServiceFor1Zad.SumElementsBetweenMin());
        System.out.printf("Кол-во элементов между левым и правым мин:%d\n", programServiceFor1Zad.CountElementsBetweenMin());
        System.out.printf("Среднее элементов между левым и правым мин:%f\n", programServiceFor1Zad.AverageElementsBetweenMin());
//        System.out.printf("Массив по убыванию:\n");
//        Print(programService.SordetArrReverdeOrder());
//        System.out.printf("Массив по возрастанию:\n");
//        Print(programService.SordetArr());
//        System.out.printf("Пять элем-ов пропустив первые пять:\n");
//        Print(programService.FiveElements());
//        System.out.printf("Пять наибольших элем-ов:\n");
//        Print(programService.FiveMaxElements());
        System.out.printf("Сумма элем-ов после 5:%d\n", programServiceFor1Zad.SumElementStartingFive());
        System.out.printf("Сумма элем-ов после 3 до первого минимального:%d\n", programServiceFor1Zad.SumElementsStartingFoureToMin());
    }
    public void Print(Integer[] arr)
    {
        for(var i : arr)
        {
            System.out.println(i);
        }
    }
}
