package br.senai.sp.jandira.atividade2.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.atividade2.R
import br.senai.sp.jandira.atividade2.model.Usuarios
import br.senai.sp.jandira.atividade2.repository.UsuarioRepository
import br.senai.sp.jandira.atividade2.ui.theme.Atividade2Theme

@Composable
fun SignUp(controleDeNavegacao: NavHostController) {//controleDeNavegacao: NavHostController) {

    var nomeState = remember {
        mutableStateOf("")
    }

    var phoneState = remember {
        mutableStateOf("")
    }

    var emailState = remember {
        mutableStateOf("")
    }

    var senhaState = remember {
        mutableStateOf("")
    }

    var lembrarState = remember {
        mutableStateOf(false)
    }

    var usuarioRepository = UsuarioRepository(LocalContext.current)

    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Row (
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .height(40.dp)
                .fillMaxWidth()
        ){
            Card (
                modifier = Modifier
                    .width(160.dp)
                    .fillMaxHeight()
                    .padding(0.dp)
                    .offset(x = 8.dp, y = -2.dp),
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(Color(0xFFC51BCA)),

                ) {

            }
        }

        Text(text = "Sign Up",
            fontSize = 30.sp,
            color = (Color(0xFFC51BCA)),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.offset(x = 130.dp, y = 30.dp)
        )

        Text(text = "Create a new account",
            fontSize = 15.sp,
            color = (Color(0xFF757272)),
            modifier = Modifier.offset(x =120.dp, y = 35.dp)
        )

        Image(painter = painterResource(id = R.drawable.contorno),
            contentDescription = "",
            modifier = Modifier
                .offset(x = 70.dp, y = (-200.dp))
                .size(width = 22.dp, height = 22.dp),
            contentScale = ContentScale.Inside
        )

        Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = "",
            tint = Color(0xFFC51BCA),
            modifier = Modifier
                .offset(x = 165.dp, y = 55.dp)
                .size(width = 70.dp, height = 70.dp)
        )

        Icon(imageVector = Icons.Filled.AddCircle, contentDescription = "",
            tint = Color(0xFFC51BCA),
            modifier = Modifier
                .offset(x = 205.dp, y = 10.dp)
                .size(width = 30.dp, height = 70.dp)
        )
    }


    Card (
        modifier = Modifier
            .width(380.dp)
            .height(480.dp)
            .offset(x = 10.dp, y = 250.dp),
        colors = CardDefaults.cardColors(Color.Transparent)
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(5.dp)
        ) {
            OutlinedTextField(
                value = nomeState.value,
                onValueChange = {
                    nomeState.value = it
                },
                modifier = Modifier.width(380.dp),
                shape = RoundedCornerShape(20.dp),
                leadingIcon = {
                    Icon(imageVector = Icons.Filled.AccountCircle,
                        contentDescription = "",
                        tint = Color(0xFFC51BCA)
                    )
                },
                label = {
                    Text(text = "Username")
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF8BC34A),
                    unfocusedBorderColor = Color(0xFFC51BCA),
                    focusedTextColor = Color(0xED000000),
                    unfocusedTextColor = Color(0xFF0A0A0A)
                )
            )

            Spacer(modifier = Modifier.height(15.dp))

            OutlinedTextField(
                value = phoneState.value,
                onValueChange = {
                    phoneState.value = it
                },
                modifier = Modifier.width(380.dp),
                shape = RoundedCornerShape(20.dp),
                leadingIcon = {
                    Icon(imageVector = Icons.Filled.Phone,
                        contentDescription = "",
                        tint = Color(0xFFC51BCA)
                    )
                },
                label = {
                    Text(text = "Phone")
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF8BC34A),
                    unfocusedBorderColor = Color(0xFFC51BCA),
                    focusedTextColor = Color(0xED090909),
                    unfocusedTextColor = Color(0xFF0A0A0A)
                )
            )

            Spacer(modifier = Modifier.height(15.dp))

            OutlinedTextField(
                value = emailState.value ,
                onValueChange = {
                    emailState.value = it
                },
                modifier = Modifier.width(380.dp),
                shape = RoundedCornerShape(20.dp),
                leadingIcon = {
                    Icon(imageVector = Icons.Filled.Email,
                        contentDescription = "",
                        tint = Color(0xFFC51BCA)
                    )
                },
                label = {
                    Text(text = "Email")
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF8BC34A),
                    unfocusedBorderColor = Color(0xFFC51BCA),
                    focusedTextColor = Color(0xED141414),
                    unfocusedTextColor = Color(0xFF0A0A0A)
                )
            )

            Spacer(modifier = Modifier.height(15.dp))

            OutlinedTextField(
                value = senhaState.value,
                onValueChange = {
                    senhaState.value = it
                },
                modifier = Modifier.width(380.dp),
                shape = RoundedCornerShape(20.dp),
                leadingIcon = {
                    Icon(imageVector = Icons.Filled.Lock,
                        contentDescription = "",
                        tint = Color(0xFFC51BCA)
                    )
                },
                label = {
                    Text(text = "Password")
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF8BC34A),
                    unfocusedBorderColor = Color(0xFFC51BCA),
                    focusedTextColor = Color(0xED000000),
                    unfocusedTextColor = Color(0xFF0A0A0A)
                )
            )

            Checkbox(checked = lembrarState.value, onCheckedChange = {
                lembrarState.value = it
            },
                modifier = Modifier.offset(x = -165.dp),
                colors = CheckboxDefaults.colors(Color(0xFFC51BCA))
            )
            Text(text = "Over 18?",
                modifier = Modifier.offset(x= -110.dp, y = -35.dp),
                fontWeight = FontWeight.Bold,
                color = Color(0xFFC51BCA)
            )
        }

        Button(onClick = {
            val novoUsuario = Usuarios(
                nome = nomeState.value,
                telefone = phoneState.value,
                email = emailState.value,
                senha = senhaState.value
            )
            usuarioRepository.salvar(novoUsuario)

            controleDeNavegacao.navigate("login") },
            modifier = Modifier
                .width(340.dp)
                .height(50.dp)
                .offset(x = 20.dp, y = -20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFCA22CF))
        ) {
            Text(text = "CREATE ACCOUNT ",
                fontWeight = FontWeight.ExtraBold
            )
        }

        Text(text = "Already have an account?",
            modifier = Modifier.offset(x = 110.dp, y = -15.dp),
            color = (Color(0xFF757272))
        )
    }

    Text(
        text = "Sign UP",
        fontSize = 15.sp,
        color = Color(0xFFC51BCA),
        modifier = Modifier
            .offset(x = 320.dp, y = 677.dp)
            .clickable { controleDeNavegacao.navigate("login") },
            fontWeight = FontWeight.Bold
    )

    Card (
        modifier = Modifier
            .height(20.dp)
            .width(20.dp)
            .offset(x = -190.dp, y = 800.dp)
            .padding(0.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(Color(0xFFC51BCA))


    ) {

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpPreview() {
    Atividade2Theme {

    }
}


