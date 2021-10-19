package practica1.ivandelfatovar.iesseveroochoa.net;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SaludoActivity extends AppCompatActivity {

    private TextView tvSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        //Localizamos los controles
        tvSaludo = (TextView) findViewById(R.id.tvSaludo);

        //Recuperamos la información pasada al intent
        Bundle bundle = this.getIntent().getExtras();

        //Construimos el mensaje a imprimir en pantalla
        tvSaludo.setText("Hola " + bundle.getString("NOMBRE"));


    }
}