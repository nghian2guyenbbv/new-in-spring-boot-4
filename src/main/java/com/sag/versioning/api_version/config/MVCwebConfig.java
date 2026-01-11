package com.sag.versioning.api_version.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class MVCwebConfig implements WebMvcConfigurer {
  @Override
  public void configureApiVersioning(ApiVersionConfigurer configurer) {
    configurer.useQueryParam("version");
  }
}
