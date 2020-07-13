package test;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();

        List list = new ArrayList();
        list.add(new User("Ivanov",25));
        list.add(new User("Petrov",30));
        list.add(new User("Vasnetsov",28));

        String json = gson.toJson(list);
        System.out.println(json);
       try( FileWriter writer = new FileWriter("src\\main\\java\\test\\test.json")){
             gson.toJson(list,writer);
        }catch (IOException e) {
            e.printStackTrace();
        }


      try (Reader reader = new FileReader("src\\main\\java\\test\\test.json")) {

          ArrayList<User> list1 = gson.fromJson(reader, new TypeToken<List<User>>(){}.getType());
          System.out.println(list1);
             } catch (IOException e) {
             e.printStackTrace();
             }
    }
}
