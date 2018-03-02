package bo.edu.umss.tarjetaarbitro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button roja, amarilla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roja = findViewById(R.id.roja);
        amarilla = findViewById(R.id.amarilla);

        roja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TarjetaActivity.class);
                intent.putExtra("color", "roja");
                startActivity(intent);
            }
        });

        amarilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TarjetaActivity.class);
                intent.putExtra("color", "amarilla");
                startActivity(intent);
            }
        });
    }
}
