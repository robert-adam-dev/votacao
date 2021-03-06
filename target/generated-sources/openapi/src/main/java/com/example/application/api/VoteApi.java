/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.application.api;

import com.example.application.dto.ErrorBaseDto;
import com.example.application.dto.ErrorDto;
import com.example.application.dto.InputIncludeVoteDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-05T16:28:17.547846-03:00[America/Sao_Paulo]")
@Validated
@Tag(name = "Vote", description = "the Vote API")
public interface VoteApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /vote : Include uma voto a uma pauta especifica.
     * Adiciona um voto
     *
     * @param inputIncludeVoteDto Valor do voto. (required)
     * @return Voto foi aceito com sucesso. (status code 202)
     *         or Requisição está invalida, o corpo da mensagem está mal formatada, por exemplo, campos faltando ou campos estão inválidos (formato inválido).   No corpo da resposta encontrar uma lista de detalhes que dará informações pertinentes para corrigir o erro. Para maiores informações consulte a [rfc-7231](https://datatracker.ietf.org/doc/html/rfc7231#section-6.5.1).  (status code 400)
     *         or Error inesperado em alguma parte do processo, neste caso a api não conseguiu se recuperar do error.  Caso isto ocorra, por favor, notifique o momento do erro, crie uma issue no __repositório__ da aplicação explicando os detalhes de como aconteceu o error.  Para maiores informações consulte a [rfc-7231](https://datatracker.ietf.org/doc/html/rfc7231#section-6.6.1).  (status code 500)
     */
    @Operation(
        operationId = "includeVote",
        summary = "Include uma voto a uma pauta especifica.",
        tags = { "Vote" },
        responses = {
            @ApiResponse(responseCode = "202", description = "Voto foi aceito com sucesso."),
            @ApiResponse(responseCode = "400", description = "Requisição está invalida, o corpo da mensagem está mal formatada, por exemplo, campos faltando ou campos estão inválidos (formato inválido).   No corpo da resposta encontrar uma lista de detalhes que dará informações pertinentes para corrigir o erro. Para maiores informações consulte a [rfc-7231](https://datatracker.ietf.org/doc/html/rfc7231#section-6.5.1). ", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  ErrorDto.class))),
            @ApiResponse(responseCode = "500", description = "Error inesperado em alguma parte do processo, neste caso a api não conseguiu se recuperar do error.  Caso isto ocorra, por favor, notifique o momento do erro, crie uma issue no __repositório__ da aplicação explicando os detalhes de como aconteceu o error.  Para maiores informações consulte a [rfc-7231](https://datatracker.ietf.org/doc/html/rfc7231#section-6.6.1). ", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  ErrorBaseDto.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/vote",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> includeVote(
        @Parameter(name = "InputIncludeVoteDto", description = "Valor do voto.", required = true, schema = @Schema(description = "")) @Valid @RequestBody InputIncludeVoteDto inputIncludeVoteDto
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
