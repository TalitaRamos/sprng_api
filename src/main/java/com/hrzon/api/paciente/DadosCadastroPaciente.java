package com.hrzon.api.paciente;

import com.hrzon.api.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.br.CPF;

public record DadosCadastroPaciente(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Pattern(regexp="(^$|[0-9]{11})")
        String telefone,
        @NotBlank
        @CPF
        String cpf,
        @NotNull
        @Valid
        DadosEndereco endereco
){}

