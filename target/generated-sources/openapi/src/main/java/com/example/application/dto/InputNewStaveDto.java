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
 * InputNewStaveDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-05T16:28:17.547846-03:00[America/Sao_Paulo]")
public class InputNewStaveDto   {

  @JsonProperty("theme")
  private String theme;

  @JsonProperty("description")
  private String description;

  public InputNewStaveDto theme(String theme) {
    this.theme = theme;
    return this;
  }

  /**
   * Texto simples para que defini o tema da pauta
   * @return theme
  */
  @NotNull @Size(min = 5, max = 100) 
  @Schema(name = "theme", example = "Pauta para definir o assunto tal.", description = "Texto simples para que defini o tema da pauta", required = true)
  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }

  public InputNewStaveDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Texto descritivo para melhor explicação referente ao tema.
   * @return description
  */
  @NotNull @Size(min = 5, max = 255) 
  @Schema(name = "description", example = "Pauta foi criada para melhor elaborar tal assunto.", description = "Texto descritivo para melhor explicação referente ao tema.", required = true)
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
    InputNewStaveDto inputNewStave = (InputNewStaveDto) o;
    return Objects.equals(this.theme, inputNewStave.theme) &&
        Objects.equals(this.description, inputNewStave.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(theme, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputNewStaveDto {\n");
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

