package br.unitins.ecare.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun LoginScreen(controller: NavController) {
    val email = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

    Scaffold { paddingValues ->
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues), contentAlignment = Alignment.Center) {
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Bem-vinda ao E-Care!",
                    style = MaterialTheme.typography.headlineMedium)

                Spacer(modifier = Modifier.height(50.dp))

                TextField(
                    value = email.value,
                    onValueChange = { email.value = it },
                    label = { Text("Email") },
                    singleLine = true
                )

                Spacer(modifier = Modifier.height(21.dp))

                TextField(
                    value = password.value,
                    onValueChange = { password.value = it },
                    label = { Text("Senha") },
                    visualTransformation = PasswordVisualTransformation(),
                    singleLine = true
                )

                Spacer(modifier = Modifier.height(16.dp))

                Button(colors = ButtonDefaults.buttonColors(
                    containerColor = Color(255, 128, 128)
                ),
                    onClick = {
                        controller.navigate("patientdata")
                    }
                ) {
                    Text(text = "Logar")
                }

                Spacer(modifier = Modifier.height(16.dp))

                Button(colors = ButtonDefaults.buttonColors(
                    containerColor = Color(255, 128, 128)
                ),
                    onClick = {
                        controller.navigate("register")
                    }
                ) {
                    Text(text = "Criar uma conta")
                }
            }
        }
    }
}
