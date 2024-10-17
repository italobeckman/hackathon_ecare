# Projeto de Saúde - Acompanhamento da Gestação
Nome do Aplicativo: Ecare - Gestante

Este projeto tem como objetivo fornecer uma plataforma que auxilia no acompanhamento da saúde da gestante, facilitando a comunicação entre profissionais de saúde e pacientes. O sistema possui duas interfaces principais: uma para o profissional de saúde e outra para a gestante.

Na interface do Profissonal de saúde é a interação com a plataforma do e-sus.

O sistema também notifica a paciente sobre suas consultas e permite que o profissional de saúde registre essas informações.

## Funcionalidades

### Tela do Profissional de Saúde
- **Consulta:** O profissional pode realizar consultas, registrar informações e acompanhar o progresso da gestante.
- **Vacinação:** Permite o agendamento e a marcação das vacinas necessárias durante a gestação.
- **Histórico:** Acesso ao histórico de atendimentos e vacinações da paciente.

### Tela da Gestante
- **Exames:** Foi pensado na divisão dos três trimestre da gestação, com os exames que ela tem que seguir em cada trimestre, sujerido pelo ministerio da saúde.
- **Vacinas:** Com base nos trimestre serão separados as vacinas que a gestante tomara em cada um deles.
- **Consultas:** As consultas que foram realizadas em cada trimestre da gestação.
- **Agendamentos:** Visualização de consultas e vacinas agendadas.
- **Notificações:** Recebe lembretes para consultas e vacinação.

## Tecnologias Utilizadas

**Linguagens:**
-
![Kotlin](https://img.shields.io/badge/Kotlin-000?style=for-the-badge&logo=Kotlin)
![Quarkus](https://img.shields.io/badge/Quarkus-000?style=for-the-badge&logo=Quarkus)

**IDE:**
-
![Android Studio](https://img.shields.io/badge/Android-Studio-000?style=for-the-badge&logo=Android-Studio&logoColor=30A3DC)

## Motivo da Escolha

- Kotlin
   - Escolhemos Kotlin como a principal linguagem de programação para o desenvolvimento do aplicativo devido à sua interoperabilidade com Java e à modernidade de sua sintaxe.

- Quarkus
   - A escolha do Quarkus como framework para o backend foi motivada por sua leveza e eficiência em ambientes de nuvem.
   - Para base de teste de interação para o projeto.
 
- Android Studio
   - Optamos pelo Android Studio como a IDE principal para o desenvolvimento do aplicativo. O Android Studio oferece um conjunto robusto de ferramentas de desenvolvimento, incluindo um emulador integrado, suporte para depuração avançada e um editor de código inteligente.

## Instalação

Para rodar este projeto localmente, siga os passos abaixo:

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/italobeckman/ecare.git

## Pré-requisitos
Antes de começar, você precisará ter as seguintes ferramentas instaladas:

- Java JDK (versão 21 ou superior)
- Kotlin (Versão 2.0.20)
- JetBrains Toolbox
- Android Studio


## Executando a aplicação em modo de desenvolvimento
Este projeto utiliza o Quarkus, o Supersonic Subatomic Java Framework.

Você pode executar sua aplicação em modo de desenvolvimento, que habilita a codificação ao vivo, usando:

```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.



