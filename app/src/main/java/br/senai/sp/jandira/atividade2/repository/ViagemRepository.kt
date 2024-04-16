package br.senai.sp.jandira.atividade2.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.atividade2.R
import br.senai.sp.jandira.atividade2.model.Viagem
import java.time.LocalDate

class ViagemRepository {


    @Composable
    fun listarTodasAsViagens() : List<Viagem>{
        val londres = Viagem()
        londres.id = 1
        londres.destino = "Londres"
        londres.descricao = "Londres, capital da Inglaterra e do Reino Unido, é uma cidade do século 21 com uma história que remonta à era romana. "
        londres.dataChegada = LocalDate.of(2019,2,18)
        londres.dataPartida = LocalDate.of(2019,2,21)
        londres.imagem = painterResource(id = R.drawable.pais)

        val porto = Viagem()
        porto.id = 2
        porto.destino = "Porto"
        porto.descricao = "Porto cidade costeira de Portugal. "
        porto.dataChegada = LocalDate.of(2022,11,3)
        porto.dataPartida = LocalDate.of(2022,11,12)
        porto.imagem = painterResource(id = R.drawable.porto)


        return listOf(londres, porto)
    }
}