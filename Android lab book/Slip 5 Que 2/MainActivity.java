package com.example.assign12;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText t1,t2;
    TextView t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        t1=(EditText)findViewById(R.id.editText);
        t2=(EditText)findViewById(R.id.editText2);
     t3=(TextView)findViewById(R.id.textView);
     t4=(TextView) findViewById(R.id.textView2);
 b1.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
       int a=Integer.parseInt(t1.getText().toString());
       int b=Integer.parseInt(t2.getText().toString());
         if(a<10 && b<10) {
             t3.setText("" + a);
             t4.setText("" + b);
         }
         else
         {
             t1.setText("");
             t2.setText("");
             t3.setText("");
             t4.setText("");
         }
     }
 });
    }
}
