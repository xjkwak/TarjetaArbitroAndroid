package bo.edu.umss.tarjetaarbitro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TarjetaActivity extends AppCompatActivity {

    private Button button;
    private String color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarjeta);
        button = findViewById(R.id.button);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            color = extras.getString("color");
            System.out.println("El color es: " + color);

            if (color.equals("roja")) {
                button.setBackgroundColor(getResources().getColor(R.color.colorRed));
                button.setText("Tarjeta Roja");
            }
            else if (color.equals("amarilla")) {
                button.setBackgroundColor(getResources().getColor(R.color.colorYellow));
                button.setText("Tarjeta Amarilla");
            }
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
