package com.example.demo.structure.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@Validated
@ConfigurationProperties("votacao.configurations.server")
public class ServerProperties {

    @NotBlank
    private String contextPath;

    @NotNull
    @Positive
    private Integer port;
}
