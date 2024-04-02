package br.senai.sp.jandira.atividade2.screens

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.atividade2.ui.theme.Atividade2Theme


@Composable
fun Greeting(controleDeNavegacao: NavHostController) {

    var emailState = remember {
        mutableStateOf("")
    }

    var senhaState = remember {
        mutableStateOf("")
    }






    Column(
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
                    .offset(x = 8.dp, y = (-2.dp)),
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(Color(0xFFC51BCA)),
            ) {

            }
        }
        Text(
            text = "Login",
            fontSize = 35.sp,
            color = Color(0xFFC51BCA),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.offset(x = 30.dp, y = 120.dp)
        )

        Text(text = "Please sign in to continue.",
            fontSize = 20.sp,
            color = Color(0xFF757272),
            modifier = Modifier.offset(x = 30.dp, y = 125.dp)

        )

        Card (
            modifier = Modifier
                .width(380.dp)
                .height(350.dp)
                .offset(x = 10.dp, y = 190.dp),
            colors = CardDefaults.cardColors(Color.Transparent)

        ) {


            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(10.dp)
            ) {

                OutlinedTextField(
                    value = emailState.value,
                    onValueChange = {
                        emailState.value = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(10.dp),
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
                        focusedTextColor = Color(0xEDEE0505),
                        unfocusedTextColor = Color(0xFF0A0A0A)
                    )
                )

                Spacer(modifier = Modifier.height(20.dp))

                OutlinedTextField(
                    value = senhaState.value,
                    onValueChange = {
                        senhaState.value = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(10.dp),
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
                        focusedTextColor = Color(0xEDEE0505),
                        unfocusedTextColor = Color(0xFF0A0A0A)
                    )
                )
            }

            Button(onClick = { controleDeNavegacao.navigate("home") },
                modifier = Modifier
                    .width(150.dp)
                    .height(50.dp)
                    .offset(x = 190.dp, y = 30.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFC51BCA)),

                ) {
                Text(

                    text = "SIGN IN",
                    fontSize = 17.sp,
                )
                Icon(imageVector = Icons.Filled.ArrowForward, contentDescription = "",
                    modifier = Modifier.offset(x = 20.dp)
                )
            }

            Text(
                text = "Don’t have an account?",
                fontSize = 15.sp,
                color = Color(0xFF757272),
                modifier = Modifier.offset(x = 150.dp, y = 50.dp)
            )

            Text(
                text = "Sign UP",
                fontSize = 15.sp,
                color = Color(0xFFC51BCA),
                modifier = Modifier.offset(x = 320.dp, y = 30.dp).clickable { controleDeNavegacao.navigate("cadastro") },
                fontWeight = FontWeight.Bold
            )

        }
        Card (
            modifier = Modifier
                .height(40.dp)
                .width(150.dp)
                .offset(x = -20.dp, y = 278.dp)
                .padding(0.dp),
            shape = RoundedCornerShape(10.dp),
            colors = CardDefaults.cardColors(Color(0xFFC51BCA))

        ){

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Atividade2Theme {
        //Greeting(controleDeNavegacao)
    }
}
