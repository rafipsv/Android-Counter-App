# Kotlin Counter App 🧮

A simple Android app built with **Kotlin** and **Jetpack Compose** that demonstrates:
- State management with `remember` and `mutableIntStateOf`
- UI layout using **Material 3 Components**
- Button actions for increment and decrement
- Toast message integration inside Compose using `LocalContext`

---

## 📱 Features
- Increment counter by clicking the **Add** button ➕
- Decrement counter by clicking the **Delete** button ➖
- Prevent counter from going below `0`  
  → Shows a **Toast** message: `"Counter cannot be negative"`

---

## 🛠️ Tech Stack
- **Kotlin**
- **Jetpack Compose (Material 3)**
- **AndroidX**
- **Toast in Compose**

---

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/KotlinCounterApp.git
````

2. Open the project in **Android Studio (Hedgehog or newer)**.
3. Make sure you have:

   * **compileSdk = 35 or 36**
   * **AGP 8.6.1+**
4. Connect a device/emulator.
5. Run the app:

   ```bash
   ./gradlew installDebug
   ```

---

## 📸 Screenshot (Example)

*Add your app screenshot here*

---

## 📂 Project Structure

```
KotlinCounterApp/
 ├── app/
 │   ├── src/main/java/com/example/kotlincounterapp/MainActivity.kt
 │   ├── src/main/res/values/themes.xml
 │   └── ...
 └── README.md
```

---

## 🔮 Future Improvements

* Replace Toast with **Snackbar** (Material Design friendly).
* Add a **Reset** button.
* Persist counter value using **ViewModel + DataStore**.

---

## 👨‍💻 Author

Made with ❤️ in Kotlin by **\[Muhammad Fazlul Karim]**

