package br.unitins.ecare.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import br.unitins.ecare.data.Exam
import br.unitins.ecare.data.Vaccine
import br.unitins.ecare.viewmodel.ExamViewModel
import java.util.Date
import androidx.compose.foundation.shape.RoundedCornerShape
import java.time.LocalDate
import br.unitins.ecare.data.Consultation as Consultation1

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PatientData() {
    val selectedItem = remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Olá, Anna!") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(255, 117, 128, 128),
                    titleContentColor = Color.White
                ),
                modifier = Modifier.fillMaxWidth()
            )
        },
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    label = { Text(text = "Exames") },
                    onClick = { selectedItem.intValue = 1 },
                    selected = selectedItem.intValue == 1,
                    icon = {},
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.Black,
                        unselectedIconColor = Color.Gray,
                        selectedTextColor = Color.Black,
                        indicatorColor = Color.Gray
                    )
                )
                NavigationBarItem(
                    label = { Text(text = "Vacinas") },
                    onClick = { selectedItem.intValue = 2 },
                    selected = selectedItem.intValue == 2,
                    icon = {},
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.Black,
                        unselectedIconColor = Color.Gray,
                        selectedTextColor = Color.Black,
                        indicatorColor = Color.Gray
                    )
                )
                NavigationBarItem(
                    label = { Text(text = "Consultas") },
                    onClick = { selectedItem.intValue = 3 },
                    selected = selectedItem.intValue == 3,
                    icon = {},
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.Black,
                        unselectedIconColor = Color.Gray,
                        selectedTextColor = Color.Black,
                        indicatorColor = Color.Gray
                    )
                )
                NavigationBarItem(
                    label = { Text(text = "Notificações") },
                    onClick = { selectedItem.intValue = 4 },
                    selected = selectedItem.intValue == 4,
                    icon = {},
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.Black,
                        unselectedIconColor = Color.Gray,
                        selectedTextColor = Color.Black,
                        indicatorColor = Color.Gray
                    )
                )
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Text(
                text = "Primeiro trimestre da gestação",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Red,
                modifier = Modifier.padding(16.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                when (selectedItem.intValue) {
                    1 -> ExamPage()
                    2 -> VaccinePage()
                    3 -> ConsultationPage()
                    4 -> NotificationPage()
                    else -> NoOptionSelectedPage()
                }
            }
        }
    }
}

@Composable
fun NoOptionSelectedPage() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Bem-vindo Anna!",
                style = MaterialTheme.typography.headlineLarge,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Selecione uma opção no menu abaixo:",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExamPage() {
    val examList = listOf(
        Exam("Hemograma", Date(2023, 10, 2, 10, 30), false),
        Exam("Glicemia (TOTG)", Date(2023, 10, 3, 8, 15), false),
        Exam("Ultrassom", Date(2023, 10, 2, 10, 30), false),
        Exam("Exame de urina", Date(2023, 10, 3, 8, 15), false),
        Exam("Sorologias", Date(2023, 10, 2, 10, 30), false),




        )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Exames") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(255, 0, 21, 128),
                    titleContentColor = Color.White
                )
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        )

        {
            items(examList) { exam ->
                ExamItem(exam)
            }
        }
    }

}

@Composable
fun ExamItem(exam: Exam) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF0F0F0))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = exam.descricao,
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black
            )
            Text(
                text = "Data: ${exam.data}",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(8.dp))
            Divider()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VaccinePage() {
    val vaccineList = listOf(
        Vaccine("DT", "Aplicada", Date(2023, 10, 1, 9, 0)),
        Vaccine("Hepatite B", "Agendada", Date(2023, 10, 2, 10, 30))
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Vacinas") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(96, 4, 13, 128),
                    titleContentColor = Color.White
                )
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            items(vaccineList) { vaccine ->
                VaccineItem(vaccine)
            }
        }
    }
}

@Composable
fun VaccineItem(vaccine: Vaccine) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF0F0F0))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = vaccine.name,
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black
            )
            Text(
                text = vaccine.status,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Gray
            )
            Text(
                text = "Data: ${vaccine.data}",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(8.dp))
            Divider()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConsultationPage() {
    val consultationList = listOf(
        Consultation1("Dr. Mateus Aquino", "Generalista", Date(2023, 10, 1, 9, 0)),
        Consultation1("Enf. Maria", "Enfermagem", Date(2023, 10, 2, 10, 30)),
        Consultation1("Dr. Smith", "Cardiology", Date(2023, 10, 1, 9, 0)),
        Consultation1("Dr. Johnson", "Dermatology", Date(2023, 10, 2, 10, 30))
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Consultas") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(255, 0, 102, 178),
                    titleContentColor = Color.White
                )
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            items(consultationList) { consultation ->
                ConsultationItem(consultation)
            }
        }
    }
}

@Composable
fun ConsultationItem(consultation: Consultation1) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        shape = RoundedCornerShape(size = 8.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF0F0F0))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = consultation.doctor,
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Black
            )
            Text(
                text = consultation.speciality,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Gray
            )
            Text(
                text = "Data: ${consultation.data}",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(8.dp))
            Divider()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotificationPage() {
    val upcomingConsultations = listOf(
        Consultation1("Dra. Silva", "Obstetra", Date(System.currentTimeMillis() + 14 * 24 * 60 * 60 * 1000)),
        Consultation1("Enf. Maria", "Enfermagem", Date(System.currentTimeMillis() + 21 * 24 * 60 * 60 * 1000))
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Notificações") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(255, 0, 102, 178),
                    titleContentColor = Color.White
                )
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            items(upcomingConsultations) { consultation ->
                ConsultationItem(consultation)
            }
        }
    }
}