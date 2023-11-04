package uz.coder.d2lesson67;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Calendar;
import java.util.Date;

import uz.coder.d2lesson67.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Date date = new Date();
        long time = date.getHours();
        int minutes = date.getMinutes();
        binding.date.setText(time+":"+minutes);


    }
}