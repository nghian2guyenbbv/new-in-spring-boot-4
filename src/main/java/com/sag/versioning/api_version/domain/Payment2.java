package com.sag.versioning.api_version.domain;

import java.io.Serializable;

public class Payment2 implements Serializable {
  public Payment2(Double amt, String currency, String method, String user, String address) {
    this.amt = amt;
    this.currency = currency;
    this.method = method;
    this.user = user;
    this.address = address;
  }
  private Double amt;
  private String currency;
  private String method;
  private String user;
  private String address;

  @Override
  public String toString() {
    return "Payment2{" + "amt=" + amt + ", currency='" + currency + '\'' + ", method='" + method + '\'' + ", user='"
        + user + '\'' + ", address='" + address + '\'' + '}';
  }
}
