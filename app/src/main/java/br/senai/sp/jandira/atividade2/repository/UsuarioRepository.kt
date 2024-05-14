package br.senai.sp.jandira.atividade2.repository

import android.content.Context
import androidx.compose.runtime.Composable
import br.senai.sp.jandira.atividade2.model.Usuarios
import br.senai.sp.jandira.contatos_ba.dao.UsuarioDb

class UsuarioRepository (context: Context){
    private val db = UsuarioDb.getBancoDeDados(context).usuarioDao()

    fun salvar(usuarios: Usuarios): Long{
        return db.salvar(usuarios)
    }
    @Composable
    fun listarTodosUsuarios(): List<Usuarios>{
        return db.listarTodososUsuarios()
    }
}