package com.example.application.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ErrorBaseDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-05T16:28:17.547846-03:00[America/Sao_Paulo]")
public class ErrorBaseDto   {

  @JsonProperty("statusCode")
  private Integer statusCode;

  @JsonProperty("message")
  private String message;

  @JsonProperty("path")
  private String path;

  public ErrorBaseDto statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Code de status http
   * @return statusCode
  */
  
  @Schema(name = "statusCode", example = "0", description = "Code de status http", required = false)
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public ErrorBaseDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Mensagem da ocorrencia do erro.
   * @return message
  */
  
  @Schema(name = "message", example = "Um erro ocorreu.", description = "Mensagem da ocorrencia do erro.", required = false)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorBaseDto path(String path) {
    this.path = path;
    return this;
  }

  /**
   * uri da ocorrencia do erro
   * @return path
  */
  
  @Schema(name = "path", example = "/path", description = "uri da ocorrencia do erro", required = false)
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorBaseDto errorBase = (ErrorBaseDto) o;
    return Objects.equals(this.statusCode, errorBase.statusCode) &&
        Objects.equals(this.message, errorBase.message) &&
        Objects.equals(this.path, errorBase.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, message, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorBaseDto {\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

