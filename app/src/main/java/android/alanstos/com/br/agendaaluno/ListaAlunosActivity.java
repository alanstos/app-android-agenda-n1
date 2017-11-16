package android.alanstos.com.br.agendaaluno;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        FragmentTransaction transaction =
                getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.alunos_view,
                new AlunoFragment(), "listaAlunos");

        Log.i("LISTA_ALUNOS","Por enquanto tudo certo.");

        transaction.commit();


    }
}
