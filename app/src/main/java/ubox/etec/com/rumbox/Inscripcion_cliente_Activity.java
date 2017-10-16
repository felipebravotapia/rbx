package ubox.etec.com.rumbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Inscripcion_cliente_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscripcion_cliente);


        Button btncredito = (Button) findViewById(R.id.btncredito);
        btncredito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (view.getContext(), Inscripcion_tarjeta_credito_cliente.class);
                startActivityForResult(intent, 0);
            }
        });



    }
}
