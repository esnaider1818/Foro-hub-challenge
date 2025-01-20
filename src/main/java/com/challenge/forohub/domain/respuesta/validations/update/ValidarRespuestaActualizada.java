package com.challenge.forohub.domain.respuesta.validations.update;


import com.challenge.forohub.domain.respuesta.dto.ActualizarRespuestaDTO;
import org.springframework.stereotype.Component;

//@Component
public interface ValidarRespuestaActualizada {

    void validate(ActualizarRespuestaDTO data, Long respuestaId);
}
