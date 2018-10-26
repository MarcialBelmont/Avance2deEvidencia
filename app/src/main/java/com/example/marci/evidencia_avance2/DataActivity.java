package com.example.marci.evidencia_avance2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class DataActivity extends AppCompatActivity {

    EditText tCodigodeVerficacion, tPrimerApellido, tSegundoApellido, tNombre, tGenero, tFechadeNacimiento, tEntidadFederativa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tCodigodeVerficacion = (EditText)findViewById(R.id.codigo);
        tPrimerApellido = (EditText)findViewById(R.id.surname1);
        tSegundoApellido = (EditText)findViewById(R.id.surname2);
        tNombre = (EditText)findViewById(R.id.name);
        tGenero = (EditText)findViewById(R.id.genre);
        tFechadeNacimiento = (EditText)findViewById(R.id.birthday);
        tEntidadFederativa = (EditText)findViewById(R.id.state);
    }

    public void guardarData(View view) {
        db db = new db(this);
        db.agregarCURPNuevo(db, tCodigodeVerficacion.getText().toString(), tPrimerApellido.getText().toString(), tSegundoApellido.getText().toString(), tNombre.getText().toString(), tGenero.getText().toString(), tFechadeNacimiento.getText().toString(), tEntidadFederativa.getText().toString());
        tCodigodeVerficacion.setText("");
        tPrimerApellido.setText("");
        tSegundoApellido.setText("");
        tNombre.setText("");
        tGenero.setText("");
        tFechadeNacimiento.setText("");
        tEntidadFederativa.setText("");
        tCodigodeVerficacion.findFocus();
    }
}
