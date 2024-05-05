package com.example.assignment5;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText e1;
    Spinner s1;
    String name,nn;
    List<String> list1=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editText);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        s1=(Spinner)findViewById(R.id.spinner);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                  name=e1.getText().toString();
                  list1.add(name);
                ArrayAdapter<String> DA=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,list1);
                DA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                s1.setAdapter(DA);
                DA.notifyDataSetChanged();
                e1.setText(" ");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayAdapter<String> DA=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item,list1);
                list1.remove(e1.getText().toString());
                DA.notifyDataSetChanged();
            }
        });
    }
}

