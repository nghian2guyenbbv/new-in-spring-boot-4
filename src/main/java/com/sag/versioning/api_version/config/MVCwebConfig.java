package com.sag.versioning.api_version.config;

import com.sag.versioning.api_version.ApiVersionApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class MVCwebConfig implements WebMvcConfigurer {
  @Override
  public void configureApiVersioning(ApiVersionConfigurer configurer) {
    configurer.useRequestHeader("API_VERSION");
  }
}
