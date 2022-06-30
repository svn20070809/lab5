package Zad3;
import java.io.*;
import java.util.Arrays;

public class File {
    private String _fileName;

    public File(String fileName) {
        this._fileName = fileName;
    }

    public void ReadByFile(Collection collection)
    {
        try {
            FileReader fr = new FileReader(_fileName);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] str=line.split(";");
                collection.Add(new Competitions(str[0], str[1], Integer.parseInt(str[2]),
                        Double.parseDouble(str[3]), Integer.parseInt(str[4])));

                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void WriteInFile(Collection collection)
    {
        try(FileWriter writer = new FileWriter(_fileName, false))
        {
            Arrays.stream(collection.getArr()).toList().forEach(x->{
                try {
                    writer.write(x.getOrganization()+";"+x.getFullName()+";"+x.getBirthYear()+";"
                            +x.getResult()+";"+x.getRankedPlace()+'\n');
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
