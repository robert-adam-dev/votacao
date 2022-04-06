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
 * InputStartSessionDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-05T16:28:17.547846-03:00[America/Sao_Paulo]")
public class InputStartSessionDto   {

  @JsonProperty("timeToLive")
  private Long timeToLive = 60l;

  public InputStartSessionDto timeToLive(Long timeToLive) {
    this.timeToLive = timeToLive;
    return this;
  }

  /**
   * Tempo em seguntos da duração de uma sessão.
   * minimum: 1
   * @return timeToLive
  */
  @Min(1L) 
  @Schema(name = "timeToLive", example = "10", description = "Tempo em seguntos da duração de uma sessão.", required = false)
  public Long getTimeToLive() {
    return timeToLive;
  }

  public void setTimeToLive(Long timeToLive) {
    this.timeToLive = timeToLive;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputStartSessionDto inputStartSession = (InputStartSessionDto) o;
    return Objects.equals(this.timeToLive, inputStartSession.timeToLive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeToLive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputStartSessionDto {\n");
    sb.append("    timeToLive: ").append(toIndentedString(timeToLive)).append("\n");
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

