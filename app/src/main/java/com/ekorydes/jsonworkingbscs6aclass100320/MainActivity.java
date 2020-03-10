package com.ekorydes.jsonworkingbscs6aclass100320;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        SubjectInfo obj1=new SubjectInfo("MAD",3);
//        SubjectInfo obj2=new SubjectInfo("WAD",3);
//        SubjectInfo obj3=new SubjectInfo("SAD",3);
//        SubjectInfo obj4=new SubjectInfo("OPP",3);
//
//        List<SubjectInfo> listOfSubjects=new ArrayList<>();
//        listOfSubjects.add(obj1);listOfSubjects.add(obj2);
//        listOfSubjects.add(obj3);listOfSubjects.add(obj4);
//
//
//        Student student=new Student("Saani",1,listOfSubjects);
//        Gson objectGson=new Gson();
//
//        objectGson.toJson(student);
//        String myJSON="{\"name\":\"Ali Raza\",\"roll\":1,\"subject\":[{\"name\":\"WAD\",\"credit\":3}" +
//                ",{\"name\":\"NAD\",\"credit\":12}]}";
//
//        String listArray="[{\"name\":\"WAD\",\"credit\":3},{\"name\":\"NAD\",\"credit\":12}]";
//
//        //Student jsonStudent=objectGson.fromJson(myJSON,Student.class);
//        Type objectType=new TypeToken<ArrayList<SubjectInfo>>(){}.getType();
//        ArrayList<SubjectInfo> object=objectGson.fromJson(listArray,objectType);

         Gson objectGson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
         Student student=new Student("Ali",3);

         objectGson.toJson(student);
    }
}
