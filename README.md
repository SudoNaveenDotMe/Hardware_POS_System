<br />
<div align="center">
  <a href="https://github.com/yourusername/Hardware_POS_System">
    <img src="src/main/resources/lk/ijse/athukorala_hardware/images/ATLOGO.png" alt="Logo" width="150" height="100">
  </a>

  <h3 align="center">Athukorala Hardware POS System</h3>

  <p align="center">
    A comprehensive Point of Sale (POS) solution built with JavaFX & MySQL for hardware retail management.
    <br />
    <a href="#demo">View Demo</a>
    ·
    <a href="#issues">Report Bug</a>
    ·
    <a href="#issues">Request Feature</a>
  </p>
</div>

<details>
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#about-the-project">About The Project</a></li>
    <li><a href="#built-with">Built With</a></li>
    <li><a href="#key-features">Key Features</a></li>
    <li><a href="#screenshots">Screenshots</a></li>
    <li><a href="#getting-started">Getting Started</a></li>
    <li><a href="#database-setup">Database Setup</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

## 🛒 About The Project

**Athukorala Hardware POS** is a desktop-based application designed to streamline the daily operations of a hardware store. It manages inventory, sales, customers, suppliers, and deliveries in a single interface. 

The system features a **role-based dashboard** (Admin & Cashier) to ensure secure access to sensitive data and provides automated reporting using JasperReports.

## 🛠 Built With

* ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) **Java 21**
* ![JavaFX](https://img.shields.io/badge/JavaFX-007396?style=for-the-badge&logo=java&logoColor=white) **JavaFX (UI)**
* ![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white) **MySQL (Database)**
* ![Maven](https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white) **Maven**
* ![Jasper](https://img.shields.io/badge/JasperReports-107C10?style=for-the-badge&logo=microsoft-excel&logoColor=white) **JasperReports**

## ✨ Key Features

* **👥 User Management:** Secure Login with Role-Based Access Control (Admin/Cashier).
* **📦 Inventory Management:** Real-time stock tracking, low stock alerts, and item management.
* **🧾 Point of Sale (POS):** Fast billing interface with automated total calculation and invoice generation.
* **🤝 Supplier & Customer Management:** Maintain detailed records of suppliers and customer contacts.
* **🚚 Delivery Management:** Manage drivers and track delivery orders.
* **📊 Reporting:** Generate PDF reports for Sales, Inventory, and Customer data using JasperReports.
* **📈 Dashboard Analytics:** Live view of Total Earnings, Order Counts, and Stock status.

## 📸 Screenshots

<div align="center">
  <h3>Login Screen</h3>
  <img src="src/main/resources/lk/ijse/athukorala_hardware/images/loginPageHardware.jpg" alt="Login Screen" width="600">
</div>

<br>

<div align="center">
  <h3>Admin Dashboard</h3>
  <img src="https://via.placeholder.com/800x500.png?text=Admin+Dashboard+Screenshot" alt="Admin Dashboard" width="800">
</div>

<br>

<div align="center">
  <h3>POS Interface</h3>
   <img src="https://via.placeholder.com/800x500.png?text=Order+Management+Screenshot" alt="POS Interface" width="800">
</div>

## 🚀 Getting Started

To get a local copy up and running, follow these steps.

### Prerequisites

* **JDK 21** or later
* **MySQL Server** 8.0+
* **Maven**

### Installation

1.  **Clone the repo**
    ```sh
    git clone [https://github.com/yourusername/Hardware_POS_System.git](https://github.com/yourusername/Hardware_POS_System.git)
    ```
2.  **Import the database**
    * Open your MySQL Client (Workbench/HeidiSQL).
    * Create a database named `hardware_db`.
    * Run the SQL script located in `database.sql` (if you haven't exported it yet, export your current DB).
3.  **Update Database Config**
    * Go to `src/main/java/lk/ijse/athukorala_hardware/db/DBConnection.java`.
    * Update your MySQL `username` and `password`.
4.  **Build and Run**
    ```sh
    mvn clean javafx:run
    ```

## 🗄 Database Schema

The system uses a relational database with the following core tables:
* `user` (Auth & Roles)
* `customer`
* `item` (Inventory)
* `order` & `order_detail` (Transactions)
* `supplier` & `driver`

## 📧 Contact

**Your Name** - [naveen@example.com](mailto:naveen@example.com)

Project Link: [https://github.com/yourusername/Hardware_POS_System](https://github.com/yourusername/Hardware_POS_System)
