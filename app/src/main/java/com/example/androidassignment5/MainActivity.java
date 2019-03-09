/*
CSE41246 - Android Java Fundamentals
Winter 2019
Assignment 5
Hoong,Jasper
 */
package com.example.androidassignment5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView = null;
    EditText textField = null;
    Button submitButton = null;
    String addItem = null;
    private ArrayAdapter<String> newArray = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //.submitButton = (Button)findViewById(R.id.button);
        //this.textField = (EditText)findViewById(R.id.editText);
        // TO-DO: Create a reference to the ListView widget.
        this.listView = (ListView)findViewById(R.id._dynamic);
        initListView();
      //  addItem = "Hello";
        //submitButton.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View v) {
                //addItem = textField.getText().toString();
            //}
        //});
    }

    private void initListView() {
        // TO-DO:
        // 1. Create an ArrayAdapter and add String data to it. Use .add
        // 2. Set the adaptor for the ListView
        this.newArray = new ArrayAdapter<String>(this, R.layout.list_layout_entry);
        newArray.add("First Custom Item");
        newArray.add("Second Custom Item");
        newArray.add("Third Custom Item");
        //if(addItem()){
     //       newArray.add(addItem);
        //}
        // TO-DO: Set the adaptor for the ListView
        this.listView.setAdapter(newArray);
    }
    private boolean addItem(){
        //if(submitButton != null){
            return true;
        //}else{
            //return false;
        //}
    }
}
