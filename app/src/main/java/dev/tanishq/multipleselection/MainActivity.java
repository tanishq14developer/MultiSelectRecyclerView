package dev.tanishq.multipleselection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RvAdapter.I1 {
    RecyclerView recyclerView;
    RvAdapter adapter;

    ArrayList<DataClass> arrayList;
    ArrayList<Boolean> booleanArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);


        arrayList = new ArrayList<DataClass>();
        booleanArrayList = new ArrayList<Boolean>();
        arrayList.add(new DataClass("1"));
        arrayList.add(new DataClass("2"));
        arrayList.add(new DataClass("3"));
        arrayList.add(new DataClass("4"));
        arrayList.add(new DataClass("5"));
        arrayList.add(new DataClass("6"));
        arrayList.add(new DataClass("7"));
        arrayList.add(new DataClass("8"));
        arrayList.add(new DataClass("9"));
        arrayList.add(new DataClass("10"));
        adapter = new RvAdapter(getApplicationContext(),arrayList,this);
        recyclerView.setAdapter(adapter);
        for (int i =0 ; i<arrayList.size();i++){
            booleanArrayList.add(Boolean.FALSE);

        }











    }

    @Override
    public void clickListener(int position, CardView materialCardView) {
        if (!booleanArrayList.get(position)){
            booleanArrayList.set(position,true);
            materialCardView.setBackgroundColor(Color.parseColor("#6c63ff"));
            Log.d("myLogs", "getPosition: " +booleanArrayList);

        }else{
            materialCardView.setBackgroundColor(Color.parseColor("#FFFFFF"));
            booleanArrayList.set(position,false);
            Log.d("myLogs", "getPosition:"+booleanArrayList);
        }


    }
}