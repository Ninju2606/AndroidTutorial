package de.ninju.videoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_visible;
    TextView txt_hallo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        listeners();
    }

    private void init(){
        btn_visible = findViewById(R.id.btn_visible);
        txt_hallo = findViewById(R.id.txt_hallo);
    }

    private void listeners(){
        btn_visible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt_hallo.getVisibility() == View.VISIBLE){
                    txt_hallo.setVisibility(View.INVISIBLE);
                    btn_visible.setText("Sichtbar machen");
                }else{
                    txt_hallo.setVisibility(View.VISIBLE);
                    btn_visible.setText("Unsichtbar machen");
                }
            }
        });
    }
}
