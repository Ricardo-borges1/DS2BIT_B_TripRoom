package br.senai.sp.jandira.atividade2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    Greeting()
                    SignUp()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
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
                    .offset(x = 8.dp, y = -2.dp),
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
                    value = "Teste@email.com",
                    onValueChange = {},
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
                    value = "Insira sua senha",
                    onValueChange = {},
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

            Button(onClick = { /*TODO*/ },
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
                modifier = Modifier.offset(x = 320.dp, y = 30.dp),
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
        Greeting()
    }
}

@Composable
fun SignUp(){


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
        }

        Image(painter = painterResource(id = R.drawable.contorno),
            contentDescription = "",
            modifier = Modifier
                .offset(x = 160.dp, y = 170.dp)
                .size(width = 80.dp, height = 80.dp)
        )

    Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = "",
        tint = Color(0xFFC51BCA),
        modifier = Modifier
            .offset(x = 165.dp, y = 175.dp)
            .size(width = 70.dp, height = 70.dp)
        )

    Card (
        modifier = Modifier
            .width(380.dp)
            .height(480.dp)
            .offset(x = 10.dp, y = 250.dp),
        colors = CardDefaults.cardColors(Color.Transparent)
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(10.dp)
        ) {
            OutlinedTextField(
                value = "Suzanna Hofs",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
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
                    focusedTextColor = Color(0xEDEE0505),
                    unfocusedTextColor = Color(0xFF0A0A0A)
                )
            )

            Spacer(modifier = Modifier.height(15.dp))

            OutlinedTextField(
                value = "1199824-9607",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
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
                    focusedTextColor = Color(0xEDEE0505),
                    unfocusedTextColor = Color(0xFF0A0A0A)
                )
            )

            Spacer(modifier = Modifier.height(15.dp))

            OutlinedTextField(
                value = "Teste@email.com",
                onValueChange = {},
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

            Spacer(modifier = Modifier.height(15.dp))

            OutlinedTextField(
                value = "Insira sua senha",
                onValueChange = {},
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

            Checkbox(checked = true, onCheckedChange = {},
                modifier = Modifier.offset(x = -165.dp),
                colors = CheckboxDefaults.colors(Color(0xFFC51BCA))
                )
            Text(text = "Over 18?",
                modifier = Modifier.offset(x= -110.dp, y = -35.dp),
                fontWeight = FontWeight.Bold,
                color = Color(0xFFC51BCA)
                )
        }

        Button(onClick = { /*TODO*/ },
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
        modifier = Modifier.offset(x = 320.dp, y = 677.dp),
        fontWeight = FontWeight.Bold
    )

    Card (
        modifier = Modifier
            .height(40.dp)
            .width(150.dp)
            .offset(x = -20.dp, y = 742.dp)
            .padding(0.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(Color(0xFFC51BCA))

    ){

    }


}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignUpPreview() {
    Atividade2Theme {
        SignUp()
    }
}

