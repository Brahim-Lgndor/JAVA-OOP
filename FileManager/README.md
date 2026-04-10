📂 Java File Management System
🎯 Project Overview
The FileManager is a robust Java utility designed to handle low-level file operations and data persistence. This project demonstrates the ability to interact with the host operating system's file system, allowing for the creation, reading, and structured organization of data files.

🚀 Engineering Features
NIO & File I/O: Utilized the java.io and java.nio packages to manage streams and file buffers efficiently.

Data Persistence: Implemented logic to save application states and user data into external files, ensuring information is preserved across sessions.

Exception Handling: Developed a comprehensive error-handling system using try-with-resources to prevent memory leaks and handle IOException scenarios (e.g., file not found or access denied).

Directory Logic: Features automated directory scanning and file attribute retrieval (size, last modified, permissions).

🛠 Technical Stack
Language: Java (JDK 11+)

Core Libraries: java.io.File, java.io.FileWriter, java.util.Scanner

Paradigm: Procedural & Object-Oriented logic for file streaming.

📂 Key Functionalities
CRUD Operations for Files: Create, Read, Update, and Delete local text or data files.

Buffer Management: Use of BufferedReader and BufferedWriter to optimize performance when handling large files.

Security Checks: Basic implementation of file existence validation and permission checks before execution.

🏁 How to Run
Navigate to the src folder.

Compile the source code:

Bash
javac *.java
Run the manager:

Bash
java Main
