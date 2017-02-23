package com.example.morga.fragmentdynamico;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener
{
    Button btnAddFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddFragment = (Button)findViewById(R.id.buttonAddFragment);
    }

    public void metodoAddFragment (View view)
    {

        //Paso 1: Obtener la instancia del administrador de fragmentos
        FragmentManager fragmentManager = getFragmentManager();

        //Paso 2: Crear una nueva transaccion
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        //Paso 3: Crear el nuevo fragmento y añadirlo
        BlankFragment fragment = new BlankFragment();
        transaction.add(R.id.activity_main, fragment);

        //Paso 4: Confirmar el cambio
        transaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
