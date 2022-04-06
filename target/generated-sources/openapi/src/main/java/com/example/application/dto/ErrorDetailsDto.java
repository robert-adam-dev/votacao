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
 * ErrorDetailsDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-05T16:28:17.547846-03:00[America/Sao_Paulo]")
public class ErrorDetailsDto   {

  @JsonProperty("field")
  private String field;

  @JsonProperty("descriptionError")
  private String descriptionError;

  public ErrorDetailsDto field(String field) {
    this.field = field;
    return this;
  }

  /**
   * nome do campo que contém um erro
   * @return field
  */
  
  @Schema(name = "field", example = "type.field", description = "nome do campo que contém um erro", required = false)
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ErrorDetailsDto descriptionError(String descriptionError) {
    this.descriptionError = descriptionError;
    return this;
  }

  /**
   * descreve o erro encontrado no campo.
   * @return descriptionError
  */
  
  @Schema(name = "descriptionError", example = "Campo inválido", description = "descreve o erro encontrado no campo.", required = false)
  public String getDescriptionError() {
    return descriptionError;
  }

  public void setDescriptionError(String descriptionError) {
    this.descriptionError = descriptionError;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetailsDto errorDetails = (ErrorDetailsDto) o;
    return Objects.equals(this.field, errorDetails.field) &&
        Objects.equals(this.descriptionError, errorDetails.descriptionError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, descriptionError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetailsDto {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    descriptionError: ").append(toIndentedString(descriptionError)).append("\n");
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

