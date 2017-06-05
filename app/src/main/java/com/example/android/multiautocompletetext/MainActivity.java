package com.example.android.multiautocompletetext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;
import static com.example.android.multiautocompletetext.R.id.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String[] Version = {"Aestro", "Blender", "CupCake", "Donut", "Eclair", "Froyo", "Gingerbread", "HoneyComb", "IceCream Sandwich", "Jellibean", "Kitkat", "Lollipop", "MarshMallow"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initiate a MultiAutoCompleteTextView
        MultiAutoCompleteTextView MultiAuto = (MultiAutoCompleteTextView)findViewById(MultiAutoCompleteTextView);
       // MultiAutoCompleteTextView MultiAuto = (MultiAutoCompleteTextView)findViewById(MultiAutoCompleteTextView);
        // set adapter to fill the data in suggestion list

        ArrayAdapter<String> versionNames = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Version);
        MultiAuto.setAdapter(versionNames);

        // set threshold value 1 that help us to start the searching from first character
        MultiAuto.setThreshold(1);
       // set tokenizer that distinguish the various substrings by comma
        MultiAuto.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
