package com.sag.versioning.api_version.controller;

import com.sag.versioning.api_version.domain.Payment2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/payment", produces = MediaType.APPLICATION_JSON_VALUE)
public class PaymentController {
  @GetMapping(value = "/{version}", version = "1", produces = MediaType.APPLICATION_JSON_VALUE)
  public Payment1 getPayment1() {
    var p1 = new Payment1(100d, "INR", "CREDIT");
    return p1;
  }

  public record Payment1(Double amt, String currency, String method) {}

  @GetMapping(value = "/{version}", version = "2", produces = MediaType.APPLICATION_JSON_VALUE)
  public Payment2 getPayment2() {
    var p2= new Payment2(100d, "ing", "credit", "nghia", "quach dieu");
    return p2;

  }

}
