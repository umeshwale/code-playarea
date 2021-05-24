package app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.naming.SizeLimitExceededException;

import com.google.gson.Gson;

import MockData.MockData;
import model.Person;

public class JavaToJSON {
    private static FileWriter file;
    public static void main(String[] args) {
        Person person = MockData.getPersonData();
        System.out.println(person);
        // convert java object to JSON using GSON
        System.out.println(new Gson().toJson(person));
        try {
            // Write JSON object to File and store it.
            file = new FileWriter("./javaToJson.json");
            file.write(new Gson().toJson(person));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                file.flush();
                file.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
