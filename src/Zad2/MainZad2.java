package Zad2;

import com.company.File;

public class MainZad2 {
    public void Main()
    {
        File file=new File("D:\\МУСОР!!!\\TestsFileJavaString.txt");
        var arr=file.ReadByFile();

        ProgramServiceForZad2 programServiceForZad2=new ProgramServiceForZad2();
        programServiceForZad2.arr=arr;

        var array=programServiceForZad2.SordetArrReverdeOrder();
        var i=programServiceForZad2.MaxElement();
        var one=programServiceForZad2.IndexMinElement();
        var two=programServiceForZad2.IndexRightMinElement();
        var asd=programServiceForZad2.ElementsBetweenMin();
        var s=programServiceForZad2.SumElementsBetweenMin();
        var y=programServiceForZad2.FiveElements();
        var t=programServiceForZad2.SumElementsStartingFoureToMin();
        var o=programServiceForZad2.ArrOfTwoArray();
        var yp=programServiceForZad2.ElementsStartB();
        var ty=programServiceForZad2.ElementsNotStartB();
    }
}
