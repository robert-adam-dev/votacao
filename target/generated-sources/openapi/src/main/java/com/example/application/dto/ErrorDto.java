package com.example.application.dto;

import java.net.URI;
import java.util.Objects;
import com.example.application.dto.ErrorAllOfDto;
import com.example.application.dto.ErrorBaseDto;
import com.example.application.dto.ErrorDetailsDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ErrorDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-05T16:28:17.547846-03:00[America/Sao_Paulo]")
public class ErrorDto   {

  @JsonProperty("statusCode")
  private Integer statusCode;

  @JsonProperty("message")
  private String message;

  @JsonProperty("path")
  private String path;

  @JsonProperty("details")
  @Valid
  private List<ErrorDetailsDto> details = null;

  public ErrorDto statusCode(Integer statusCode) {
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

  public ErrorDto message(String message) {
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

  public ErrorDto path(String path) {
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

  public ErrorDto details(List<ErrorDetailsDto> details) {
    this.details = details;
    return this;
  }

  public ErrorDto addDetailsItem(ErrorDetailsDto detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

  /**
   * Get details
   * @return details
  */
  @Valid 
  @Schema(name = "details", required = false)
  public List<ErrorDetailsDto> getDetails() {
    return details;
  }

  public void setDetails(List<ErrorDetailsDto> details) {
    this.details = details;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDto error = (ErrorDto) o;
    return Objects.equals(this.statusCode, error.statusCode) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.path, error.path) &&
        Objects.equals(this.details, error.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, message, path, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDto {\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

