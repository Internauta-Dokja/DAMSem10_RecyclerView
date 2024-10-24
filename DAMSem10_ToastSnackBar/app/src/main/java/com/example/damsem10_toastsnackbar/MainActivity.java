package com.example.damsem10_toastsnackbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnToast, btnSnackBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // Vinculamos
        btnToast = findViewById(R.id.buttonToast);
        btnSnackBar = findViewById(R.id.buttonSnackBar);

        // Evento Click
        btnToast.setOnClickListener(this);
        btnSnackBar.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        if(v.getId()==R.id.buttonToast){
            Toast.makeText(this, "Mostrando Toast", Toast.LENGTH_SHORT).show();
        }else{
            Snackbar.make(v, "Mensaje de Tipo SnackBar", Snackbar.LENGTH_LONG).show();
        }
    }
}