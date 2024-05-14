package br.senai.sp.jandira.contatos_ba.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.senai.sp.jandira.atividade2.dao.UsuarioDAO
import br.senai.sp.jandira.atividade2.model.Usuarios
import br.senai.sp.jandira.contatos_ba.dao.UsuarioDb

@Database(entities = [Usuarios::class], version = 1)
abstract class UsuarioDb : RoomDatabase() {

    abstract fun usuarioDao(): UsuarioDAO

    companion object{
        private lateinit var instancia: UsuarioDb

        fun getBancoDeDados(context: Context): UsuarioDb{
            instancia = Room
                .databaseBuilder(
                    context,
                    UsuarioDb::class.java,
                    "db_usuarios"
                )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()

            return instancia
        }

    }

}