package Zad1;

import com.company.File;

public class TestsClass {

    public Integer[] Arr()
    {
        var file=new File("D:\\МУСОР!!!\\TestsFileJava.txt");
        var arr = new Integer[file.ReadByFile().length];
               for (int i = 0; i < file.ReadByFile().length; i++) {
                  arr[i] = Integer.parseInt(file.ReadByFile()[i]);
               }
        return arr;
    }

}
