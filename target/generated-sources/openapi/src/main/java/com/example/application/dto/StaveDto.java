package com.example.application.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * StaveDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-05T16:28:17.547846-03:00[America/Sao_Paulo]")
public class StaveDto   {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("theme")
  private String theme;

  @JsonProperty("description")
  private String description;

  @JsonProperty("state")
  private String state;

  @JsonProperty("createAt")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private java.time.LocalDateTime createAt;

  @JsonProperty("startSessionVoting")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private java.time.LocalDateTime startSessionVoting;

  @JsonProperty("endSessionVoting")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private java.time.LocalDateTime endSessionVoting;

  @JsonProperty("totalVotes")
  private Integer totalVotes;

  @JsonProperty("totalVotesYes")
  private Integer totalVotesYes;

  @JsonProperty("totalVotesNo")
  private Integer totalVotesNo;

  public StaveDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador único de uma Pauta
   * @return id
  */
  
  @Schema(name = "id", example = "1001", description = "Identificador único de uma Pauta", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public StaveDto theme(String theme) {
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

  public StaveDto description(String description) {
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

  public StaveDto state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Estado da pauta
   * @return state
  */
  
  @Schema(name = "state", example = "create", description = "Estado da pauta", required = false)
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public StaveDto createAt(java.time.LocalDateTime createAt) {
    this.createAt = createAt;
    return this;
  }

  /**
   * Data de criação da Pauta
   * @return createAt
  */
  @Valid 
  @Schema(name = "createAt", example = "2021-01-30T08:30Z", description = "Data de criação da Pauta", required = false)
  public java.time.LocalDateTime getCreateAt() {
    return createAt;
  }

  public void setCreateAt(java.time.LocalDateTime createAt) {
    this.createAt = createAt;
  }

  public StaveDto startSessionVoting(java.time.LocalDateTime startSessionVoting) {
    this.startSessionVoting = startSessionVoting;
    return this;
  }

  /**
   * Data do inicio da sessão de votação da Pauta
   * @return startSessionVoting
  */
  @Valid 
  @Schema(name = "startSessionVoting", example = "2021-01-30T08:30Z", description = "Data do inicio da sessão de votação da Pauta", required = false)
  public java.time.LocalDateTime getStartSessionVoting() {
    return startSessionVoting;
  }

  public void setStartSessionVoting(java.time.LocalDateTime startSessionVoting) {
    this.startSessionVoting = startSessionVoting;
  }

  public StaveDto endSessionVoting(java.time.LocalDateTime endSessionVoting) {
    this.endSessionVoting = endSessionVoting;
    return this;
  }

  /**
   * Data do fim da sessão de votação da Pauta
   * @return endSessionVoting
  */
  @Valid 
  @Schema(name = "endSessionVoting", example = "2021-01-30T08:30Z", description = "Data do fim da sessão de votação da Pauta", required = false)
  public java.time.LocalDateTime getEndSessionVoting() {
    return endSessionVoting;
  }

  public void setEndSessionVoting(java.time.LocalDateTime endSessionVoting) {
    this.endSessionVoting = endSessionVoting;
  }

  public StaveDto totalVotes(Integer totalVotes) {
    this.totalVotes = totalVotes;
    return this;
  }

  /**
   * total de votos que a Pauta teve na sessão de votação.
   * @return totalVotes
  */
  
  @Schema(name = "totalVotes", example = "500", description = "total de votos que a Pauta teve na sessão de votação.", required = false)
  public Integer getTotalVotes() {
    return totalVotes;
  }

  public void setTotalVotes(Integer totalVotes) {
    this.totalVotes = totalVotes;
  }

  public StaveDto totalVotesYes(Integer totalVotesYes) {
    this.totalVotesYes = totalVotesYes;
    return this;
  }

  /**
   * total de votos positivos que a Pauta teve.
   * @return totalVotesYes
  */
  
  @Schema(name = "totalVotesYes", example = "300", description = "total de votos positivos que a Pauta teve.", required = false)
  public Integer getTotalVotesYes() {
    return totalVotesYes;
  }

  public void setTotalVotesYes(Integer totalVotesYes) {
    this.totalVotesYes = totalVotesYes;
  }

  public StaveDto totalVotesNo(Integer totalVotesNo) {
    this.totalVotesNo = totalVotesNo;
    return this;
  }

  /**
   * total de votos negativos que a Pauta teve.
   * @return totalVotesNo
  */
  
  @Schema(name = "totalVotesNo", example = "200", description = "total de votos negativos que a Pauta teve.", required = false)
  public Integer getTotalVotesNo() {
    return totalVotesNo;
  }

  public void setTotalVotesNo(Integer totalVotesNo) {
    this.totalVotesNo = totalVotesNo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaveDto stave = (StaveDto) o;
    return Objects.equals(this.id, stave.id) &&
        Objects.equals(this.theme, stave.theme) &&
        Objects.equals(this.description, stave.description) &&
        Objects.equals(this.state, stave.state) &&
        Objects.equals(this.createAt, stave.createAt) &&
        Objects.equals(this.startSessionVoting, stave.startSessionVoting) &&
        Objects.equals(this.endSessionVoting, stave.endSessionVoting) &&
        Objects.equals(this.totalVotes, stave.totalVotes) &&
        Objects.equals(this.totalVotesYes, stave.totalVotesYes) &&
        Objects.equals(this.totalVotesNo, stave.totalVotesNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, theme, description, state, createAt, startSessionVoting, endSessionVoting, totalVotes, totalVotesYes, totalVotesNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaveDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
    sb.append("    startSessionVoting: ").append(toIndentedString(startSessionVoting)).append("\n");
    sb.append("    endSessionVoting: ").append(toIndentedString(endSessionVoting)).append("\n");
    sb.append("    totalVotes: ").append(toIndentedString(totalVotes)).append("\n");
    sb.append("    totalVotesYes: ").append(toIndentedString(totalVotesYes)).append("\n");
    sb.append("    totalVotesNo: ").append(toIndentedString(totalVotesNo)).append("\n");
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

