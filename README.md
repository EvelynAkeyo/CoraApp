Cora App – Social Spark Assistant

Purpose of the App

CoraApp is a simple and user-friendly Android application designed to help users maintain social connections during busy days. It provides quick and meaningful “social spark” suggestions based on the time of day entered by the user. This ensures users can stay connected with friends, family and colleagues in a fun and effortless way.

Features
Time-based Social Sparks: Personalized suggestions based on the hour of the day.
Interactive UI: Allows users to input the time and get an instant social recommendation.
Reset Functionality: Quickly clear inputs and suggestions for a fresh start.
Input Validation: Ensures time input is a valid number between 0 and 24, with appropriate error handling.
Logging: Tracks user interactions for debugging and optimization purposes.

---

## Social Spark Suggestions

| Time of Day       | Suggestion                                                                  |
| ----------------- | --------------------------------------------------------------------------- |
| **06:00 – 09:00** | 🌅 **Morning**: Send a "Good morning" text to a family member.              |
| **10:00 – 11:00** | ☕ **Mid-morning**: Reach out to a colleague with a quick "Thank you."       |
| **12:00 – 15:00** | 🌞 **Afternoon**: Share a funny meme or interesting link with a friend.     |
| **16:00 – 17:00** | 🍩 **Afternoon Snack Time**: Send a quick "thinking of you" message.        |
| **18:00 – 20:00** | 🍽️ **Dinner**: Call a friend or relative for a 5-minute catch-up.          |
| **21:00 – 05:00** | 🌙 **After Dinner / Night**: Leave a thoughtful comment on a friend's post. |

---

## User Interface

* **LinearLayout**: Clean and intuitive design for seamless user interaction.
* **Input Field**: An editable `EditText` for entering the hour.
* **Output Field**: A `TextView` to display the suggested social spark.
* **Buttons**:

  * **Calculate**: Fetches the suggestion based on the entered hour.
  * **Reset**: Clears the input and suggestion, allowing a fresh start.

---

## Screenshots



---

## Installation

### Clone the repository:

```bash
git clone https://github.com/EvelyneAkeyo/CoraApp.git
```

### Open the project in Android Studio.

### Build and run the app:

* Make sure you have Android Studio installed.
* Use an **API 27+ emulator** or a physical Android device.
* **Run the project** on your device or emulator.

---

## Usage

1. **Enter the hour** of the day (0–24) in the input field.
2. Click **Calculate** to see your suggested social spark.
3. To try again, click **Reset** to clear the input and suggestion.
4. **Invalid input** (e.g., non-numeric values or hours outside 0–24) will trigger an error message, guiding the user to input a valid hour.

---

## GitHub Actions (CI/CD)

This project uses **GitHub Actions** for continuous integration (CI). The action ensures that the app builds correctly on every push to the repository.

### Workflow File:

`.github/workflows/build.yml`

---

## Testing

### Manual Testing:

* **Tested Valid Inputs**: E.g., 8, 13, 19 — all return the expected social suggestions.
* **Tested Invalid Inputs**: E.g., letters, empty fields, or numbers outside the 0–24 range — all trigger an error message and prompt for correct input.
* **Logs**: Used `Log.d` to track button clicks and internal logic.

---

## Design Considerations

* **Simplicity**: The UI is clean, with straightforward instructions to minimize confusion.
* **Accessibility**: Large text fields and buttons to ensure ease of use.
* **Maintainability**: Code is well-commented and structured using simple logic (if-else).
* **Scalability**: New social spark suggestions can be easily added or customized.

---

## Video Demonstration

Watch the full demonstration of CoraApp here:
*(Insert YouTube link or video here)*

---

## Author

**Your Name**
Evelyne, IMAD5112 – The Independent Institute of Education (Pty) Ltd

---

## License

This project is for educational purposes and is submitted as part of the IMAD5112 assignment requirements. All rights reserved to the original creators.

---

### **Conclusion**

CoraApp successfully meets the assignment requirements by combining **functionality**, **simplicity**, and **user engagement**. It demonstrates an effective use of **Kotlin**, **UI design**, **error handling**, and **version control**. The choice of a **LinearLayout** for the user interface ensures simplicity and consistency, while still providing an intuitive user experience. This makes the app suitable for users who need quick and easy social interaction suggestions.

### **Design Decisions**

#### UI Layout

The user interface was designed using a **LinearLayout** for **simplicity** and **readability**. Proper spacing and alignment were applied to ensure a clean layout. While **ConstraintLayout** allows more advanced positioning using constraints, **LinearLayout** was chosen because it ensures a **consistent structure** across different devices, making it easier to manage and maintain. In this app, it strikes the right balance between ease of use and visual clarity.

#### Why LinearLayout over ConstraintLayout?

While **ConstraintLayout** is ideal for more complex UI designs that require flexible positioning, **LinearLayout** was more efficient and easier to maintain for this application. Given the relatively simple UI requirements, **LinearLayout** allowed for faster implementation and clear structure without unnecessary complexity.

---



---

