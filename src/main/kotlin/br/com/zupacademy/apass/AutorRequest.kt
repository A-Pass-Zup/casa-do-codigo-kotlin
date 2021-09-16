package br.com.zupacademy.apass

import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotBlank

@Introspected
data class AutorRequest(
        val nome: String,
        val email: String,
        val livros: Set<LivroRequest>
)
