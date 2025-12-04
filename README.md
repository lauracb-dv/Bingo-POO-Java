# 🎲 Bingo PRO - Java Project / Proyecto Java

[English](#english) | [Español](#español)

---

## ENGLISH

# 🎲 Bingo PRO - Java Project

A complete Bingo game system developed in Java with console interface, multiple players, and dynamically generated cards.

## 📋 Description

This project implements a complete Bingo game with the following features:
- Automatic generation of cards with unique numbers
- Support for multiple players (up to 10)
- Random number drawing system without repetition
- Automatic detection of lines and bingo
- Enhanced visual interface with ASCII boxes
- Turn-based game control with pauses

## 🏗️ Project Structure

```
src/
├── bingoPRO_LauraCespedesBerdonces/
│   ├── Main.java          # Program entry point
│   ├── Bingo.java         # Main game controller
│   ├── Jugador.java       # Player class
│   └── Carton.java        # Bingo card class
```

## 🎮 Features

### 1. **Card Generation**
- 3x9 cards (3 rows, 9 columns)
- Numbers distributed by ranges (1-9, 10-19, ..., 80-89)
- Random holes (4 per row)
- No repeated numbers in the same column

### 2. **Game Mechanics**
- Number drawing from 1 to 89
- No repeated numbers
- Automatic line detection (1st, 2nd, 3rd)
- Bingo detection (all three lines completed)
- Real-time card updates

### 3. **Visual Interface**
- ASCII-based card display
- Colored borders and clear formatting
- Game status messages
- Final results display

### 4. **Player Management**
- Up to 10 players
- Custom player names
- Individual cards per player
- Progress tracking

## 🚀 How to Run

### Prerequisites
- Java JDK 8 or higher
- Any Java IDE (Eclipse, IntelliJ, VS Code) or command line

### Execution
1. Clone the repository:
```bash
git clone [repository-url]
```

2. Compile the project:
```bash
javac bingoPRO_LauraCespedesBerdonces/*.java
```

3. Run the game:
```bash
java bingoPRO_LauraCespedesBerdonces.Main
```

## 🎯 Game Rules

1. Each player receives a unique 3x9 card
2. Numbers are drawn randomly from 1 to 89
3. Players mark numbers on their cards
4. First player to complete a line shouts "LINE!"
5. First player to complete all three lines shouts "BINGO!"
6. Game ends when a player gets bingo

## 📊 Card Structure

```
╔═════╦══════╦══════╦══════╦══════╦══════╦══════╦══════╦══════╗
║  1  ║  10  ║  20  ║  30  ║  40  ║  50  ║  60  ║  70  ║  80  ║
╠═════╬══════╬══════╬══════╬══════╬══════╬══════╬══════╬══════╣
║  2  ║  11  ║  21  ║  31  ║  41  ║  51  ║  ##  ║  71  ║  81  ║
╠═════╬══════╬══════╬══════╬══════╬══════╬══════╬══════╬══════╣
║  3  ║  12  ║  ##  ║  32  ║  42  ║  52  ║  62  ║  72  ║  ##  ║
╚═════╩══════╩══════╩══════╩══════╩══════╩══════╩══════╩══════╝
```
- `##` represents empty spaces (holes)
- Numbers are marked with `0` when drawn

## 🛠️ Technical Details

### Classes Overview

#### **Main.java**
- Simple entry point
- Creates Bingo game instance

#### **Bingo.java**
- Main game controller
- Manages players and turns
- Handles number drawing
- Controls game flow

#### **Jugador.java (Player)**
- Stores player information
- Manages player's card
- Checks for lines and bingo

#### **Carton.java (Card)**
- Generates and displays cards
- Handles card logic
- Checks numbers and lines

### Key Algorithms
1. **Card Generation**: Ensures no repeated numbers and proper hole distribution
2. **Number Drawing**: Random selection without replacement
3. **Line Detection**: Checks for 5 marked numbers in a row (excluding holes)
4. **Bingo Detection**: Verifies all three lines are completed

## 📝 Code Conventions

- Variables in UPPER_CASE for constants and important game elements
- Methods in UPPERCASE for main game actions
- Clear separation of concerns between classes
- Comprehensive error handling

## 🎨 Visual Elements

The game uses ASCII characters to create:
- Card borders (╔, ═, ╗, ║, ╚, ╝)
- Column separators (╦, ╬, ╩)
- Row separators (╠, ╣)
- Number formatting with spaces

## 📈 Game Flow

1. **Setup Phase**
   - Enter number of players
   - Enter player names
   - Generate cards

2. **Game Phase**
   - Number drawing
   - Card updating
   - Line checking
   - Bingo checking

3. **End Phase**
   - Display winner
   - Show all cards
   - Show game statistics

## 🤝 Contributing

Feel free to fork this project and submit pull requests with improvements.

## 📄 License

This project is for educational purposes.

## 👥 Authors

**Laura Céspedes Berdonces** - Java Programming Project

---

## ESPAÑOL

# 🎲 Bingo PRO - Proyecto Java

Un sistema completo de juego de Bingo desarrollado en Java con interfaz de consola, múltiples jugadores y cartones generados dinámicamente.

## 📋 Descripción

Este proyecto implementa un juego de Bingo completo con las siguientes características:
- Generación automática de cartones con números únicos
- Soporte para múltiples jugadores (hasta 10)
- Sistema de sorteo de números aleatorios sin repetición
- Detección automática de líneas y bingo
- Interfaz visual mejorada con cuadros ASCII
- Control de juego por turnos con pausas

## 🏗️ Estructura del Proyecto

```
src/
├── bingoPRO_LauraCespedesBerdonces/
│   ├── Main.java          # Punto de entrada del programa
│   ├── Bingo.java         # Controlador principal del juego
│   ├── Jugador.java       # Clase de jugador
│   └── Carton.java        # Clase de cartón de bingo
```

## 🎮 Características

### 1. **Generación de Cartones**
- Cartones de 3x9 (3 filas, 9 columnas)
- Números distribuidos por rangos (1-9, 10-19, ..., 80-89)
- Huecos aleatorios (4 por fila)
- Sin números repetidos en la misma columna

### 2. **Mecánicas del Juego**
- Sorteo de números del 1 al 89
- Sin números repetidos
- Detección automática de líneas (1ª, 2ª, 3ª)
- Detección de bingo (las tres líneas completadas)
- Actualización en tiempo real de los cartones

### 3. **Interfaz Visual**
- Visualización de cartones basada en ASCII
- Bordes coloreados y formato claro
- Mensajes de estado del juego
- Visualización de resultados finales

### 4. **Gestión de Jugadores**
- Hasta 10 jugadores
- Nombres personalizados de jugadores
- Cartones individuales por jugador
- Seguimiento del progreso

## 🚀 Cómo Ejecutar

### Prerrequisitos
- Java JDK 8 o superior
- Cualquier IDE de Java (Eclipse, IntelliJ, VS Code) o línea de comandos

### Ejecución
1. Clona el repositorio:
```bash
git clone [url-del-repositorio]
```

2. Compila el proyecto:
```bash
javac bingoPRO_LauraCespedesBerdonces/*.java
```

3. Ejecuta el juego:
```bash
java bingoPRO_LauraCespedesBerdonces.Main
```

## 🎯 Reglas del Juego

1. Cada jugador recibe un cartón único de 3x9
2. Los números se sortean aleatoriamente del 1 al 89
3. Los jugadores marcan números en sus cartones
4. El primer jugador que completa una línea grita "¡LÍNEA!"
5. El primer jugador que completa las tres líneas grita "¡BINGO!"
6. El juego termina cuando un jugador consigue bingo

## 📊 Estructura del Cartón

```
╔═════╦══════╦══════╦══════╦══════╦══════╦══════╦══════╦══════╗
║  1  ║  10  ║  20  ║  30  ║  40  ║  50  ║  60  ║  70  ║  80  ║
╠═════╬══════╬══════╬══════╬══════╬══════╬══════╬══════╬══════╣
║  2  ║  11  ║  21  ║  31  ║  41  ║  51  ║  ##  ║  71  ║  81  ║
╠═════╬══════╬══════╬══════╬══════╬══════╬══════╬══════╬══════╣
║  3  ║  12  ║  ##  ║  32  ║  42  ║  52  ║  62  ║  72  ║  ##  ║
╚═════╩══════╩══════╩══════╩══════╩══════╩══════╩══════╩══════╝
```
- `##` representa espacios vacíos (huecos)
- Los números se marcan con `0` cuando salen sorteados

## 🛠️ Detalles Técnicos

### Resumen de Clases

#### **Main.java**
- Punto de entrada simple
- Crea instancia del juego Bingo

#### **Bingo.java**
- Controlador principal del juego
- Gestiona jugadores y turnos
- Maneja el sorteo de números
- Controla el flujo del juego

#### **Jugador.java**
- Almacena información del jugador
- Gestiona el cartón del jugador
- Verifica líneas y bingo

#### **Carton.java**
- Genera y muestra cartones
- Maneja la lógica del cartón
- Verifica números y líneas

### Algoritmos Clave
1. **Generación de Cartones**: Asegura números no repetidos y distribución adecuada de huecos
2. **Sorteo de Números**: Selección aleatoria sin reemplazo
3. **Detección de Líneas**: Verifica 5 números marcados en fila (excluyendo huecos)
4. **Detección de Bingo**: Verifica que las tres líneas estén completadas

## 📝 Convenciones de Código

- Variables en MAYÚSCULAS para constantes y elementos importantes del juego
- Métodos en MAYÚSCULAS para acciones principales del juego
- Separación clara de responsabilidades entre clases
- Manejo exhaustivo de errores

## 🎨 Elementos Visuales

El juego usa caracteres ASCII para crear:
- Bordes de cartones (╔, ═, ╗, ║, ╚, ╝)
- Separadores de columnas (╦, ╬, ╩)
- Separadores de filas (╠, ╣)
- Formato de números con espacios

## 📈 Flujo del Juego

1. **Fase de Configuración**
   - Introducir número de jugadores
   - Introducir nombres de jugadores
   - Generar cartones

2. **Fase de Juego**
   - Sorteo de números
   - Actualización de cartones
   - Verificación de líneas
   - Verificación de bingo

3. **Fase Final**
   - Mostrar ganador
   - Mostrar todos los cartones
   - Mostrar estadísticas del juego

## 🤝 Contribuciones

Siéntete libre de hacer fork de este proyecto y enviar pull requests con mejoras.

## 📄 Licencia

Este proyecto es con fines educativos.

## 👥 Autores

**Laura Céspedes Berdonces** - Proyecto de Programación Java
