package iwakorp.com.atividade06092017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button gerar = (Button) findViewById(R.id.btnSortear);
        ListView lista = (ListView) findViewById(R.id.listaSorteio);

        Integer[] numeros = new Integer[]{

        };
        final List<Integer> numerosSorteados = new ArrayList<>(Arrays.asList(numeros));

        final ArrayAdapter<Integer> mAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, numerosSorteados);

        lista.setAdapter(mAdapter);

        gerar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Random r = new Random();
                if(numerosSorteados.size() >= 6){
                    Toast.makeText(getApplicationContext(), "Sorteio acabou :)", Toast.LENGTH_SHORT).show();
                }else{
                    int valor = r.nextInt(60);
                    if (numerosSorteados.contains(valor) || valor == 0) {
                        Toast.makeText(getApplicationContext(), "Numero já foi sorteado", Toast.LENGTH_SHORT).show();
                    } else {
                        numerosSorteados.add(valor);
                        mAdapter.notifyDataSetChanged();
                    }

                    List<Integer> numEscolhidos = new ArrayList<Integer>();
                    numEscolhidos.add(1);
                    numEscolhidos.add(2);
                    numEscolhidos.add(3);
                    numEscolhidos.add(4);
                    numEscolhidos.add(5);
                    numEscolhidos.add(6);

                    Collection listaSorteio = new ArrayList(numerosSorteados);
                    Collection listaEscolhidos = new ArrayList(numEscolhidos);



                    if(numerosSorteados.size() == 6) {
                        if (listaSorteio.containsAll(listaEscolhidos)) {
                            Toast.makeText(getApplicationContext(), "Parabens! você foi sorteado !!", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getApplicationContext(), "Premio acumulado para 1.000.000", Toast.LENGTH_SHORT).show();
                        }
                    }
//                    if(numerosSorteados.size() == 6){
//                        if(listaSorteio.retainAll( listaEscolhidos )){
//                            Toast.makeText(getApplicationContext(), "Parabens! você foi sorteado !!", Toast.LENGTH_SHORT).show();
//                        }else{
//                            Toast.makeText(getApplicationContext(), "Premio acumulado para 1.000.000", Toast.LENGTH_SHORT).show();
//                        }
//                    }

                }
            }
        });
    }
}
