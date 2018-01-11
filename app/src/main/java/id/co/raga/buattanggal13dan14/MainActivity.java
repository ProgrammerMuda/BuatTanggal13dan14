package id.co.raga.buattanggal13dan14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2, bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button)findViewById(R.id.button);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, input.class));
                Toast.makeText(MainActivity.this, "please input your data", Toast.LENGTH_LONG).show();
            }
        });

        bt2 = (Button)findViewById(R.id.button2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, sahabatnabi.class));
                Toast.makeText(MainActivity.this, "read and understand the story", Toast.LENGTH_LONG).show();

            }
        });
        bt3 = (Button)findViewById(R.id.button3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, developer.class));
                Toast.makeText(MainActivity.this, "About developer", Toast.LENGTH_LONG).show();
            }
        });


    }
}
