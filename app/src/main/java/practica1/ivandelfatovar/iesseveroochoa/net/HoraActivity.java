package practica1.ivandelfatovar.iesseveroochoa.net;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HoraActivity extends AppCompatActivity {

    //Declaramos el objeto
    private TextView tvHora;
    private EditText etNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hora);
        //Creamos la funcion para que nos muestre la hora del movil
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        Date date = new Date();
        String str = formatter.format(date);

        //Localizamos los controles
        tvHora = (TextView) findViewById(R.id.tvHora);
        //Declaramos lo almacenado en el edit Text
        Bundle bundle = this.getIntent().getExtras();

        //Construimos el mensaje a imprimir en pantalla
        tvHora.setText("La hora a la que has pulsado es " + date.toString() + " y mi nombre es " + bundle.getString("NOMBRE"));

    }
}