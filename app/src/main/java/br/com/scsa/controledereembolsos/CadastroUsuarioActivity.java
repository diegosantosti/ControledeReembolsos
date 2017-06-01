package br.com.scsa.controledereembolsos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class CadastroUsuarioActivity extends AppCompatActivity {

    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);


        TabHost host = (TabHost) findViewById(R.id.tab_host);
        host.setup();

        //Aba 1
        TabHost.TabSpec spec = host.newTabSpec(String.valueOf(R.string.info_usuario));
        spec.setContent(R.id.cad_usuario_info_usuario);
        spec.setIndicator(String.valueOf(R.string.info_usuario));
        host.addTab(spec);

        //Aba 2
        spec = host.newTabSpec(String.valueOf(R.string.info_complementar));
        spec.setContent(R.id.cad_usuario_info_complementares);
        spec.setIndicator(String.valueOf(R.string.info_complementar));
        host.addTab(spec);

        //Aba 3
        spec = host.newTabSpec(String.valueOf(R.string.info_bancaria));
        spec.setContent(R.id.cad_usuario_info_bancarias);
        spec.setIndicator(String.valueOf(R.string.info_bancaria));
        host.addTab(spec);

    }
}
