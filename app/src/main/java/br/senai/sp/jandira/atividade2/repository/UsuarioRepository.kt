package br.senai.sp.jandira.atividade2.repository

import android.content.Context
import androidx.compose.runtime.Composable
import br.senai.sp.jandira.atividade2.model.Usuarios
import br.senai.sp.jandira.atividade2.dao.UsuarioDAO
import br.senai.sp.jandira.contatos_ba.dao.UsuarioDb

class UsuarioRepository(context: Context) {
    private val dao = UsuarioDb.getBancoDeDados(context).usuarioDao()

    fun salvar(usuario: Usuarios): Long {
        return dao.salvar(usuario)
    }

    @Composable
    fun listarTodosUsuarios(): List<Usuarios> {
        return dao.listarTodososUsuarios()
    }

    fun verificarCredenciais(email: String, senha: String): Boolean {
        val usuario = dao.buscarUsuarioPeloEmail(email)
        return usuario != null && usuario.senha == senha
    }
}
