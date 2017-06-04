package com.example.user.checkboxcolor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox chkRed;
    CheckBox chkBlue;
    CheckBox chkGreen;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);

        chkRed = (CheckBox)findViewById(R.id.checkBoxRed);
        chkBlue = (CheckBox)findViewById(R.id.checkBoxBlue);
        chkGreen = (CheckBox)findViewById(R.id.checkBoxGreen);
    }


    public  void ClickMe(View v){
        if(chkRed.isChecked()==true && chkGreen.isChecked() ==true &&
                chkBlue.isChecked()==true){
            getWindow().getDecorView().setBackgroundColor(Color.WHITE);

        }
        else if (chkRed.isChecked()==true && chkGreen.isChecked()==true){
            getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
        }
        else if (chkRed.isChecked()==true && chkBlue.isChecked()==true){
            getWindow().getDecorView().setBackgroundColor(Color.MAGENTA);
        }
        else if (chkGreen.isChecked()==true && chkBlue.isChecked()==true){
            getWindow().getDecorView().setBackgroundColor(Color.CYAN);
        }

        else if (chkRed.isChecked()==true){
            getWindow().getDecorView().setBackgroundColor(Color.RED);
        }

        else if (chkGreen.isChecked()==true){
            getWindow().getDecorView().setBackgroundColor(Color.GREEN);
        }

        else if (chkBlue.isChecked()==true){
            getWindow().getDecorView().setBackgroundColor(Color.BLUE);
        }
        else {
            getWindow().getDecorView().setBackgroundColor(Color.BLACK);
        }


    }
}
