package br.com.zupacademy.apass

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate

class LivroRequest(
        val titulo: String,
        val isbn: String,
        @JsonFormat(shape=  JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy") val dataPublicacao: LocalDate
)
