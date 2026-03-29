Memorial Plan System using Java Swing (Course Project)
---

A desktop project application developed during my 2nd year in college for calculating memorial lot prices, VAT, and installment plans.

---

**Project Structure**

The application is built using a modular multi-frame architecture:

MainLauncher.java: The entry point that triggers the initial registration screen.

MP.java: The core logic class; handles all mathematical formulas and interest calculations.

Frame1.java: User login and registration interface.

Frame2.java: Lot category selection and initial cost breakdown (VAT, Selling Price, Balance).

Frame3.java: Payment terms selection (1–3 Years or Cash) and final contract price generation.

Close.java: Final transaction confirmation screen.

---

**Installation & Running**

Clone the repository:

Bash
git clone https://github.com/your-username/memorial-plan-system.git


Compile the source files:

Bash

javac *.java


Run the application:

Bash

java MainLauncher
