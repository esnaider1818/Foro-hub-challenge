package com.challenge.forohub.domain.topico.dto;

import com.challenge.forohub.domain.topico.Estado;

public record ActualizarTopicoDTO (
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
){
}
