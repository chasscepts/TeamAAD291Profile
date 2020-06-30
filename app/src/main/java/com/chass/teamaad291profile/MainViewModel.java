package com.chass.teamaad291profile;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
  private User user;

  public User getUser(){
    return user;
  }

  public MainViewModel(){
    user = new User("Obetta Francis", "Android", "Nigeria", "francischassobetta@gmail.com",
        "+2348031332801", "@Francis");
  }
}
