package Zad3;

import java.util.Scanner;

public class MainZad3 {
    public void Main()
    {
        var file=new File("D:\\МУСОР!!!\\Competitions.txt");
        var collection=new Collection() ;
        //file.ReadByFile(collection);
//        Output.OutputData(collection.getArr());
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Введите имя для поиска:");
//        String fullName=sc.nextLine();
//        System.out.println(SearchData.Search(collection.getArr(),fullName));
//        SortingData.Sort(collection.getArr());
//        Output.OutputData(collection.getArr());
//        System.out.println();
//        collection.AddRecordByIndex(1, new Competitions("Суслик","Потапов Потап Потапович",
//                1990,200,1));
//        Output.OutputData(collection.getArr());
//        System.out.println();
//        collection.DeliteRecord(1);
//        Output.OutputData(collection.getArr());
//        System.out.println();
//        collection.EditingRecords(1);
//        Output.OutputData(collection.getArr());
//        var fileTwo=new File("D:\\File.txt");
//        fileTwo.WriteInFile(collection);
        //__________________________________________________________________________________________________________
        //Запись в JSON
        //____________________________________________________________________________________________________________
        IFiles filess=new CSV("C:\\Users\\eliza\\IdeaProjects\\Lab5\\src\\Zad3\\TestsCSV.csv", collection);
        //filess.Write(collection);
        //__________________________________________________________________________________________________________
        //Чтение с JSON
        //____________________________________________________________________________________________________________
      // Collection collection1= filess.Read();
        //__________________________________________________________________________________________________________
        //Запись в CSV
        //____________________________________________________________________________________________________________
        filess.Write();

    }
}
