package com.chass.teamaad291profile;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.squareup.picasso.Picasso;

public class DataBindings {
  @BindingAdapter("android:photo")
  public static void setPhoto(ImageView img, int resId){
    Picasso.get()
        .load(resId)
        .placeholder(R.drawable.ic_person)
        .into(img);
  }
  @BindingAdapter("android:photo")
  public static void setPhoto(ImageView img, String url){
    Picasso.get()
        .load(url)
        .placeholder(R.drawable.ic_person)
        .into(img);
  }
}
