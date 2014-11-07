package com.codfac.contador.codfac;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;


public class MyActivity extends Activity implements OnClickListener,OnLongClickListener{
    EditText etNombre;
    Button btnEnviar;
    TextView tvMsj;
    Button btnLargo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        etNombre=(EditText)findViewById(R.id.etNombre);
        btnEnviar=(Button)findViewById(R.id.btnEnviar);
        btnLargo=(Button)findViewById(R.id.btnEnviarLento);

        tvMsj=(TextView)findViewById(R.id.tvMsj);
        /*Agregar escucha al btnEnviar a traves del onclick*/
        btnEnviar.setOnClickListener(this);
        btnLargo.setOnLongClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnEnviar:
                String nomInvitado=etNombre.getText().toString();
                tvMsj.setText("Tarjeta enviado a "+nomInvitado);
                                                    break;
        }

    }

    @Override
    public boolean onLongClick(View view) {
        switch (view.getId()){
            case R.id.btnEnviarLento:
                String nomInvitadoLento=etNombre.getText().toString();
                tvMsj.setText("Tarjeta enviada con boton lento a: "+nomInvitadoLento);
                break;
        }
        return false;
    }
}
