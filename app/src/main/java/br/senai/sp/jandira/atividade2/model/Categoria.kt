package br.senai.sp.jandira.atividade2.model

import androidx.compose.ui.graphics.painter.Painter

data class Categoria(
var id: Int = 0,
var nome: String = "",
var image: Painter? = null
)

