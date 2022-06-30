package Zad3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Collection {
    private Competitions[] arr;

    public Collection()
    {
        arr=new Competitions[0];
    }
    public Competitions[] getArr(){return arr;}

    public void setArr(Competitions[] arr)
    {
        this.arr=arr;
    }

    public Competitions AccessingArrayElementByIndex(int index)
    {
        return arr[index];
    }

    public Competitions AccessingArrayElementByOrganization(String organization)
    {
        return Arrays.stream(arr).filter(x->x.getOrganization().equals(organization)).findFirst().get();
    }

    public Competitions AccessingArrayElementByFullName(String fullName)
    {
        return Arrays.stream(arr).filter(x->x.getFullName().equals(fullName)).findFirst().get();
    }

    public void Add(Competitions obj)
    {
        arr=Arrays.copyOf(arr,arr.length+1);
        arr[arr.length-1]=obj;
    }

    public void AddRecordByIndex(int index, Competitions obj) {
        try {
            CheckIndex(index);
        } catch (Exception e) {
            e.printStackTrace();
        }
        arr=Arrays.copyOf(arr,arr.length+1);

        for (int i = arr.length - 2; i >= index; i--)
        {
            arr[i + 1] = arr[i];
        }

        arr[index] = obj;

    }

    private void CheckIndex(int index) throws Exception {
        if(index> arr.length || index<0)
        {
            throw new Exception("Неверно введён индекс");
        }
    }

    public void DeliteRecord(int index)
    {
        try {
            CheckIndex(index);
            Arrays.stream(arr).collect(Collectors.toUnmodifiableSet()).remove(arr[index]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void EditingRecords(int index)
    {
        Scanner sc=new Scanner(System.in);
        try {
            CheckIndex(index);
            boolean flag=true;
            while(flag)
            {
                flag=false;
                int number=Chois();

                switch (number)
                {
                    case 1:
                        System.out.println("Введите организацию:");
                        arr[index].setOrganization(sc.nextLine());
                        break;
                    case 2:
                        System.out.println("Введите ФИО:");
                        arr[index].setFullName(sc.nextLine());
                        break;
                    case 3:
                        System.out.println("Введите год рождения:");
                        arr[index].setBirthYear(sc.nextInt());
                        break;
                    case 4:
                        System.out.println("Введите результат:");
                        arr[index].setResult(sc.nextInt());
                        break;
                    case 5:
                        System.out.println("Введите занятое место:");
                        arr[index].setRankedPlace(sc.nextInt());
                        break;
                    default:
                        flag=true;
                        System.out.println("Вы ввели что-то не то");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int Chois()
    {
        System.out.println("Что вы хотите изменить?");
        System.out.println("1-Organization");
        System.out.println("2-Full Name");
        System.out.println("3-Birth year");
        System.out.println("4-Result");
        System.out.println("5-Ranked Place");
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        return number;
    }
}

