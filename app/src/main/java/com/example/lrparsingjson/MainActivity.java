package com.example.lrparsingjson;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.lrparsingjson.Root.Status;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSONObject obj = toObject(createTestRoot());

        Root root1 = toModel(obj.toString());

        JSONArray jsonArray = toArray(createTestRoots());

        List<Root> roots2 = toListModel(jsonArray.toString());

        Log.e("1", "1");
    }

    public Root toModel(String string){
        Gson gson = new Gson();
        try{
            return gson.fromJson(string, Root.class);
        }catch (Exception e){
            Log.e("GsonParser:toModel", e.getLocalizedMessage());
        }
        return null;
    }

    public JSONObject toObject(Root rootObj){
        Gson gson = new Gson();
        try {
            String jsonObject = gson.toJson(rootObj);
            return new JSONObject(jsonObject);
        }catch (Exception e){
            Log.e("GSONParser:toObject", e.getLocalizedMessage());
        }
        return null;
    }

    public JSONArray toArray(List<Root> roots){
        Gson gson = new Gson();
        try {
            String jsonObject = gson.toJson(roots);
            return new JSONArray(jsonObject);
        }catch (Exception e){
            Log.e("GsonParser:toArray", e.getLocalizedMessage());
        }
        return null;
    }

    public List<Root> toListModel(String string){
        Gson gson = new Gson();
        try{
            Type type = new TypeToken<List<Root>>(){}.getType();
            return gson.fromJson(string, type);
        }catch (Exception e){
            Log.e("GsonParser:toListModel", e.getLocalizedMessage());
        }
        return null;
    }

    private List<Root> createTestRoots(){
        ArrayList<Root> roots = new ArrayList<>();
        roots.add(createTestRoot());
        roots.add(createTestRoot());
        roots.add(createTestRoot());
        return roots;
    }
    private Root createTestRoot(){
        ArrayList<String> email = new ArrayList<String>();
        email.add("test_email1");
        email.add("test_email2");

        ArrayList<Cart> carts = new ArrayList<>();
        carts.add(new Cart(
                "test_btitle1",
                "test_bgenre1",
                "test_bauthor1",
                2.0,
                10.0,
                1
        ));
        carts.add(new Cart(
                "test_btitle2",
                "test_bgenre2",
                "test_bauthor2",
                2.0,
                10.0,
                1200
        ));

        return new Root(
                "test_message",
                "test_phone",
                Status.active,
                new Name(
                        "test_fname",
                        "test_mname",
                        "test_lname"
                ),
                carts,
                email,
                new Location("test_street1",
                        "test_city1",
                        "test_contry1",
                        new Coordinates(
                                1.0,
                                0.1
                        ),
                        true,
                        0.0,
                        1.1
                ),
                new Date("Mon May 15 00:00:00 GMT 2023"),
                true,
                100,
                100,
                0
        );
    }
}