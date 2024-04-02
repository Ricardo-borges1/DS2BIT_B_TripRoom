package br.senai.sp.jandira.atividade2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.atividade2.screens.Greeting
import br.senai.sp.jandira.atividade2.screens.SignUp
import br.senai.sp.jandira.atividade2.screens.home
import br.senai.sp.jandira.atividade2.ui.theme.Atividade2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Atividade2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val controleDeNavegacao = rememberNavController()

                    NavHost(navController = controleDeNavegacao, startDestination = "cadastro"){
                        composable("login") { Greeting(controleDeNavegacao)}
                        composable("cadastro"){ SignUp(controleDeNavegacao)}
                        composable("home"){ home(controleDeNavegacao)}
                    }
                }
            }
        }
    }
}







