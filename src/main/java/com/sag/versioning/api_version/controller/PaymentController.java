package com.sag.versioning.api_version.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

  @GetMapping(version = "1.1")
  public Payment1 getPay1() {
    return new Payment1("nghia", 100d);
  }

  @GetMapping(params = "version=1.2")
  public Payment2 getPay2() {
    return new Payment2("dung", 100d, "CREDIT", "QUACH DIEU");
  }


  record Payment1(String user, Double atm) {
  }

  record Payment2(String user, Double atm, String method, String address){};

}
