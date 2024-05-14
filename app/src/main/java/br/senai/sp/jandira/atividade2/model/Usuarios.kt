package br.senai.sp.jandira.atividade2.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "tbl_usuarios")

data class Usuarios(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    var nome: String = "",
    var telefone: String = "",
    var email: String = "",
    var senha: String = ""
)
