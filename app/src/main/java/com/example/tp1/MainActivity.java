package com.example.tp1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.tp1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private IncrementarViewModel incrementarViewModel;
    private int res = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        incrementarViewModel = new ViewModelProvider(this).get(IncrementarViewModel.class);
        Log.d("TAG1", "onCreate()");
        binding.tvResCon.setText("Con ViewModel: " + incrementarViewModel.getResultado());
        binding.tvResSin.setText("Sin ViewModel " + res);
        tarea();
    }

    public void tarea() {
        binding.btIncrementarSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = Incrementar.incrementar(res);
                binding.tvResSin.setText("Sin ViewModel: " + res);
            }
        });
        binding.btnIncrementarCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementarViewModel.setResultado(Incrementar.incrementar(incrementarViewModel.getResultado()));
                binding.tvResCon.setText("Con ViewModel: " + incrementarViewModel.getResultado());
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG1", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG1", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG1", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG1", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG1", "onDestroy");
    }
}
