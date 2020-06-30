package com.chass.teamaad291profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.chass.teamaad291profile.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
  ActivityMainBinding B;
  MainViewModel viewModel;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    B = DataBindingUtil.setContentView(this, R.layout.activity_main);
    viewModel = new ViewModelProvider(getViewModelStore(),
        ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication())).get(MainViewModel.class);
    B.setUser(viewModel.getUser());
  }
}
