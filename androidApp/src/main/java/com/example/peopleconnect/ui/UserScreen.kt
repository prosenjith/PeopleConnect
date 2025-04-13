package com.example.peopleconnect.ui


import androidx.compose.foundation.layout.*
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.peopleconnect.UserViewModel

@Composable
fun UserScreen() {
    val viewModel = remember { UserViewModel() }

    val userState by viewModel.user.collectAsState()

    // Optional cleanup if needed
    DisposableEffect(Unit) {
        onDispose {
            viewModel.clear()
        }
    }

    Box(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        contentAlignment = Alignment.Center
    ) {
        if (userState == null) {
            CircularProgressIndicator()
        } else {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "ID: ${userState!!.id}", style = MaterialTheme.typography.headlineLarge)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Name: ${userState!!.name}")
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Email: ${userState!!.email}")
            }
        }
    }
}
