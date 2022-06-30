package Zad3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.json.JSONArray;

import java.io.*;


public class JSON implements IFiles {

    private String _fileName;
    private Collection collection;
    //C:\Users\eliza\IdeaProjects\Lab5\src\Zad3\TestsJSON.json

    public JSON(String fileName, Collection collection) {
        this._fileName = fileName;
        this.collection=collection;
    }

    @Override
    public Collection Read() {
        Gson gson = new Gson();

        try(FileReader reader = new FileReader(_fileName)){
            collection=gson.fromJson(reader, new TypeToken<Collection>(){}.getType());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return collection;
    }

    @Override
    public void Write() {
        try (Writer writer = new FileWriter(_fileName, false)) {
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            gson.toJson(collection, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
