package br.com.netoalceu.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        String [] alunos = {"Daniel", "Ronaldo", "Jeferson", "Felipe"};
        ListView listaAlunos = (ListView) findViewById(R.id.LISTA_ALUNOS);
        /**
         * Views - Todos os objetos da tela (Activity)
         * findViewById(R.id.lista_alunos) - Pego a View apontada pelo ID
         * Guardo este objeto view em uma variavel ListView
         * Como eu pego uma View e nao uma listView, tem que fazer o CAST p listview
         */
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                        (this,android.R.layout.simple_list_item_1,alunos);
        /**
         * ArrayAdapter - Converte uma lista de String em uma view
         * this é o context - serve p dizer qual activity se trada a view
         * simple_list_item - é o layout da View que vamos usar
         *So falta testar o merge do github????
         */

        listaAlunos.setAdapter(adapter);
    }
}
