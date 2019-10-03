package com.example.androidlistnumber;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewNumber;
    int[] numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewNumber = findViewById(R.id.recyclerNumber);
        recyclerViewNumber.setLayoutManager(new LinearLayoutManager(this));

        final NumberAdapter numberAdapter =new NumberAdapter();
        recyclerViewNumber.setAdapter(numberAdapter);


        numbers = new int[100];

        for (int i=0; i<100; i++){
           numbers[i]=i;
        }

        numberAdapter.numbers = numbers;
        recyclerViewNumber.setAdapter(numberAdapter);

    }
}
