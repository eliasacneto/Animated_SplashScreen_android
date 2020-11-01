package br.com.realmapp.coderealm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Hooks
        textView = findViewById(R.id.textView);
        btn = findViewById(R.id.btn);
        //Hooks
        textView = findViewById(R.id.textView);
        btn = findViewById(R.id.btn);
        //Btn click
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Button Clicked");
            }
        });
    }
}