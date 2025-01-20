package com.challenge.forohub.domain.usuario.validations.update;

import com.challenge.forohub.domain.usuario.dto.ActualizarUsuarioDTO;

public interface ValidarActualizarUsuario {
    void validate(ActualizarUsuarioDTO data);
}