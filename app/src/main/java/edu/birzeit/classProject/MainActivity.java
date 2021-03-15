package edu.birzeit.classProject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText weightTxt ;
    private EditText heightTxt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weightTxt = findViewById(R.id.weightTxt) ;
        heightTxt = findViewById(R.id.heightTxt) ;

    }

    public void mass_btn(View view) {
        double  weight =Double.parseDouble(weightTxt.getText().toString().trim())  ;
        double height = Double.parseDouble(heightTxt.getText().toString().trim()) ;
        double mass = weight/height ;
        Toast.makeText(this, "your mass is " + mass , Toast.LENGTH_SHORT).show();

    }
}