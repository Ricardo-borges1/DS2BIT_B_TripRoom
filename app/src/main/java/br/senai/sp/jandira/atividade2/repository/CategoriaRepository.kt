package br.senai.sp.jandira.atividade2.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.atividade2.R
import br.senai.sp.jandira.atividade2.model.Categoria

class CategoriaRepository {

    @Composable
    fun ListarTodasCategorias(): List<Categoria>{
        val montanha = Categoria()
        montanha.id = 1
        montanha.nome = "Montanha"
        montanha.image = painterResource(id = R.drawable.montanha)

        val snow = Categoria()
        snow.id = 2
        snow.nome = "Snow"
        snow.image = painterResource(id = R.drawable.esqui)


        val beach = Categoria()
        beach.id = 3
        beach.nome = "Beach"
        beach.image = painterResource(id = R.drawable.beach2)

        return listOf(montanha,snow,beach)
    }
}