package practica1.ivandelfatovar.iesseveroochoa.net;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etNombre;
    private Button btAceptar;
    private Button btDimeLaHora;
    private TextView tvHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Obtenemos una referencia de los controles de la interfaz
        etNombre = (EditText) findViewById(R.id.etNombre);
        btAceptar = (Button) findViewById(R.id.btAceptar);
        btDimeLaHora = (Button) findViewById(R.id.btDimeLaHora);

        //Declaramos el evento click del botón
        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Creamos el intent
                Intent intent = new Intent(MainActivity.this, SaludoActivity.class);
                //Creamos la información a pasar entre las actividades
                Bundle b = new Bundle();
                b.putString("NOMBRE", etNombre.getText().toString());
                //Añadimos la información al intent
                intent.putExtras(b);
                //Iniciamos la actividad
                startActivity(intent);
            }
        });

        btDimeLaHora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent (MainActivity.this, HoraActivity.class);
                Bundle d = new Bundle();
                d.putString("NOMBRE", etNombre.getText().toString());
                intent2.putExtras(d);
                startActivity(intent2);
            }
        });

    }
}