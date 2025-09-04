# Kotlin Counter App

A simple counter application built with Kotlin and Jetpack Compose for Android.

## Features

- **Increment Counter**: Tap the "+" button to increase the counter value
- **Decrement Counter**: Tap the "-" button to decrease the counter value
- **Negative Protection**: Prevents the counter from going below zero with a Toast message
- **Clean UI**: Modern Material Design 3 interface with Jetpack Compose
- **Edge-to-Edge Display**: Utilizes full screen space for better user experience

## Screenshots

The app displays a centered counter with two buttons for increment and decrement operations.

## Technology Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Design System**: Material Design 3
- **Architecture**: Component-based with state management
- **Minimum SDK**: Android API level (check your app's build.gradle)

## Project Structure

```
com.example.kotlincounterapp/
├── MainActivity.kt          # Main activity and app entry point
├── ui/theme/               # App theming components
│   └── KotlinCounterAppTheme.kt
└── Counter composable      # Main counter UI component
```

## Key Components

### MainActivity
- Extends `ComponentActivity`
- Sets up the main theme and scaffold
- Enables edge-to-edge display

### Counter Composable
- Uses `mutableIntStateOf` for state management
- Implements increment/decrement logic
- Shows toast notification for negative value prevention

## Getting Started

### Prerequisites
- Android Studio (latest version recommended)
- Android SDK
- Kotlin plugin

### Installation

1. Clone or download this project
2. Open the project in Android Studio
3. Wait for Gradle sync to complete
4. Run the app on an emulator or physical device

### Building the App

```bash
# Debug build
./gradlew assembleDebug

# Release build
./gradlew assembleRelease
```

## Usage

1. Launch the app
2. The counter starts at 0
3. Tap the **+** button to increment the counter
4. Tap the **-** button to decrement the counter
5. If you try to go below 0, a toast message will appear

## Code Highlights

- **State Management**: Uses Compose's `remember` and `mutableIntStateOf` for reactive UI updates
- **Material Icons**: Utilizes built-in Material Design icons for buttons
- **Toast Integration**: Shows user-friendly messages for invalid operations
- **Responsive Layout**: Column and Row layouts with proper spacing

## Future Enhancements

Potential improvements for this app could include:
- Save counter value across app sessions
- Custom counter step values
- Multiple counters
- Counter history
- Custom themes and colors
- Sound effects
- Animation effects

## License

This project is for educational purposes. Feel free to use and modify as needed.

## Contributing

This is a simple demo project, but contributions and suggestions are welcome for learning purposes.

---

**Package**: `com.example.kotlincounterapp`  
**Developed with**: Android Studio & Jetpack Compose
