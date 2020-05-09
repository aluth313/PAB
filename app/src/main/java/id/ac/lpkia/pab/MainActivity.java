package id.ac.lpkia.pab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView luas;
    EditText panjang;
    EditText lebar;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisiasi setiap component berdasarkan id pada layout
        luas = findViewById(R.id.luas);
        panjang = findViewById(R.id.panjang);
        lebar = findViewById(R.id.lebar);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjang1 = panjang.getText().toString();
                int panjang2 = Integer.parseInt(panjang1);
                String lebar1 = lebar.getText().toString();
                int lebar2 = Integer.parseInt(lebar1);
                int hasil = panjang2 * lebar2;
                String hasil1 = new Integer(hasil).toString();

                luas.setText(hasil1);
            }
        });
    }
}
