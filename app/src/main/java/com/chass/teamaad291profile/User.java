package com.chass.teamaad291profile;

public class User {
  int url = R.drawable.francis;
  String name, track, country, email, phoneNumber, slackUsername;

  public String getName() {
    return name;
  }

  public String getTrack() {
    return track;
  }

  public String getCountry() {
    return country;
  }

  public String getEmail() {
    return email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getSlackUsername() {
    return slackUsername;
  }

  public int getUrl(){
    return url;
  }

  public User(String name, String track, String country, String email, String phoneNumber, String slackUsername) {
    this.name = name;
    this.track = track;
    this.country = country;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.slackUsername = slackUsername;
  }
}
