package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView TV;
    private ListView LV;
    private String infop[] = {
            " es de color marron y esta mas cerca del sol",
            " es el planeta brillante, porque cuando se mira a Venus desde la Tierra se le ve brillar como una estrella.",
            " es el único planeta conocido sobre el que hay agua líquida y vida.",
            " tiene una atmosfera delgada formada por dioxido de carbono, y 2 satelites: Fobos y Deimos.",
            " es el planeta más grande. Es una gigantesca bola de gas con grandes tempestades en su interior. ",
            " es el segundo planeta por su tamaño. Tiene anillos formados por rocas y hielo. También tiene muchas lunas, la más importante se llama Titán.",
            " es el planeta más frío del Sistema Solar. Gira muy inclinado sobre si mismo.",
            " hay vientos muy violentos. Es el planeta más alejado de la Tierra, ya que Plutón no se considera un planeta por su pequeño tamaño."
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LV = (ListView) findViewById(R.id.LV);
        TV = (TextView) findViewById(R.id.TV);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.Planetas, R.layout.list_item_planetas);

        LV.setAdapter(adapter);
        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), "Planeta Seleccionado: "+parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
                TV.setText(LV.getItemAtPosition(position).toString() + infop[position]);
            }
        });

    }
}