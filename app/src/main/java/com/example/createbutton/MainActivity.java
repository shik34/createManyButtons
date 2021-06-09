package com.example.createbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private final int USERID = 6000;
    private int countID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (LinearLayout) findViewById(R.id.layout);

        Button [] b = new Button[10];
for(int i=0;i<10;i++) {
    b[i] = new Button(getApplicationContext());


    b[i].setText("Удалить данную кнопку №" + Integer.toString(countID + 1));
    b[i].setLayoutParams(
            new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT)
    );
    b[i].setId(USERID + countID);
/*            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    linearLayout.removeView(v);
                }
            });*/
    linearLayout.addView(b[i]);
}
//            countID++;


    }
}