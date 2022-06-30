package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File {
    private String _fileName;

    public File(String fileName) {

        this._fileName = fileName;
    }

    public String[] ReadByFile()
    {
        try
        {
            FileReader fr = new FileReader(_fileName);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                var str = line.split(" ");
//                var arr = new Integer[str.length];
//
//                for (int i = 0; i < str.length; i++) {
//                    arr[i] = Integer.parseInt(str[i]);
//                }

                return str;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
