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
 * InputUpdateStaveDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-05T16:28:17.547846-03:00[America/Sao_Paulo]")
public class InputUpdateStaveDto   {

  @JsonProperty("theme")
  private String theme;

  @JsonProperty("description")
  private String description;

  public InputUpdateStaveDto theme(String theme) {
    this.theme = theme;
    return this;
  }

  /**
   * Tema da pauta
   * @return theme
  */
  
  @Schema(name = "theme", example = "Pauta que será discutida tal assunto.", description = "Tema da pauta", required = false)
  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }

  public InputUpdateStaveDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Texto descrição da pauta
   * @return description
  */
  
  @Schema(name = "description", example = "Descrição da Pauta para o tema tal.", description = "Texto descrição da pauta", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputUpdateStaveDto inputUpdateStave = (InputUpdateStaveDto) o;
    return Objects.equals(this.theme, inputUpdateStave.theme) &&
        Objects.equals(this.description, inputUpdateStave.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(theme, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputUpdateStaveDto {\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

