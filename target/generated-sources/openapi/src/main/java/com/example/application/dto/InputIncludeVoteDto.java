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
 * InputIncludeVoteDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-05T16:28:17.547846-03:00[America/Sao_Paulo]")
public class InputIncludeVoteDto   {

  @JsonProperty("idStave")
  private Long idStave;

  @JsonProperty("legalDocumentNumberAssociate")
  private String legalDocumentNumberAssociate;

  @JsonProperty("value")
  private Boolean value;

  public InputIncludeVoteDto idStave(Long idStave) {
    this.idStave = idStave;
    return this;
  }

  /**
   * Identificador a Pauta que será incluida o voto
   * @return idStave
  */
  @NotNull 
  @Schema(name = "idStave", example = "10000", description = "Identificador a Pauta que será incluida o voto", required = true)
  public Long getIdStave() {
    return idStave;
  }

  public void setIdStave(Long idStave) {
    this.idStave = idStave;
  }

  public InputIncludeVoteDto legalDocumentNumberAssociate(String legalDocumentNumberAssociate) {
    this.legalDocumentNumberAssociate = legalDocumentNumberAssociate;
    return this;
  }

  /**
   * Cpf do associado que está votando. Api aceita CPF com ou sem pontuação
   * @return legalDocumentNumberAssociate
  */
  @NotNull @Pattern(regexp = "([0-9]{3}[.]?[0-9]{3}[.]?[0-9]{3}-[0-9]{2})|([0-9]{11})") @Size(min = 11, max = 14) 
  @Schema(name = "legalDocumentNumberAssociate", example = "111.111.111-11", description = "Cpf do associado que está votando. Api aceita CPF com ou sem pontuação", required = true)
  public String getLegalDocumentNumberAssociate() {
    return legalDocumentNumberAssociate;
  }

  public void setLegalDocumentNumberAssociate(String legalDocumentNumberAssociate) {
    this.legalDocumentNumberAssociate = legalDocumentNumberAssociate;
  }

  public InputIncludeVoteDto value(Boolean value) {
    this.value = value;
    return this;
  }

  /**
   * Valor do voto,  * `True` para sim,  * `Falso` para não
   * @return value
  */
  @NotNull 
  @Schema(name = "value", example = "true", description = "Valor do voto,  * `True` para sim,  * `Falso` para não", required = true)
  public Boolean getValue() {
    return value;
  }

  public void setValue(Boolean value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputIncludeVoteDto inputIncludeVote = (InputIncludeVoteDto) o;
    return Objects.equals(this.idStave, inputIncludeVote.idStave) &&
        Objects.equals(this.legalDocumentNumberAssociate, inputIncludeVote.legalDocumentNumberAssociate) &&
        Objects.equals(this.value, inputIncludeVote.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idStave, legalDocumentNumberAssociate, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputIncludeVoteDto {\n");
    sb.append("    idStave: ").append(toIndentedString(idStave)).append("\n");
    sb.append("    legalDocumentNumberAssociate: ").append(toIndentedString(legalDocumentNumberAssociate)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

