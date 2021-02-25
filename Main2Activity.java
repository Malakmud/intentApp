package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import org.w3c.dom.Text;
import static android.content.Intent.EXTRA_TEXT;

public class Main2Activity extends AppCompatActivity {
    TextView TV1, TV2;
    String usernameText, idText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        usernameText= intent.getStringExtra("EXTRA_TEXT");
        idText=intent.getStringExtra("EXTRA_Number");

        TV1 = (TextView) findViewById(R.id.msg);
        TV2 = (TextView) findViewById(R.id.mssg2);

        TV1.setText(usernameText);
        TV2.setText(idText);
    }
}
