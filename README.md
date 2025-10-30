# 🏦 AppBank - Proyecto de Lógica y Solución de Problemas

Este proyecto fue desarrollado como parte de la materia **Lógica para Solución de Problemas**.  
Su objetivo principal es aplicar los fundamentos de la **programación estructurada, modular y orientada a objetos**, a través de una **simulación de sistema bancario** construida con **Java** y **Spring Boot** 🧠💻

---

## 📘 Descripción del Proyecto

**AppBank** simula un sistema bancario básico que maneja información de **clientes**, **cuentas** y **transacciones**.  
Permite registrar nuevos clientes, crear cuentas bancarias, realizar operaciones financieras y consultar la información registrada.

Para mantener la simplicidad, el proyecto no utiliza una base de datos real, sino que almacena los datos en **archivos JSON**, los cuales actúan como una base de datos simulada.  
Esto facilita comprender cómo se gestiona la información sin depender de motores de base de datos.

El propósito académico es demostrar el razonamiento lógico detrás de cada operación, aplicando estructuras de datos y flujos de control para resolver problemas reales mediante la programación.

---

## ⚙️ Tecnologías Utilizadas

| Tecnología | Descripción |
|-------------|-------------|
| ☕ **Java 17+** | Lenguaje principal del proyecto |
| 🌱 **Spring Boot** | Framework usado para crear la aplicación |
| 🧩 **Maven** | Herramienta para gestionar dependencias |
| 📂 **JSON** | Archivos usados como base de datos simulada |
| 🧭 **Swagger UI** | Interfaz visual para documentar y ejecutar endpoints |
| 📜 **Javadoc** | Documentación generada del código |

---

## 🧱 Estructura del Proyecto

logica-solucion-problemas-main/
├── data/ # Archivos JSON con datos de ejemplo
│ ├── accounts.json
│ └── customers.json
├── docs/ # Documentación Javadoc generada
├── src/
│ └── main/java/com/logsoluprobl/appbank/
│ ├── AppbankApplication.java
│ └── controller/ # Controladores de la aplicación
├── pom.xml # Configuración de Maven
└── README.md

yaml
Copiar código

---

## 🧠 Lógica y Funcionamiento del Sistema

El sistema está diseñado bajo una arquitectura **en capas**, donde cada parte cumple una función específica:

- **Controladores:** manejan las peticiones HTTP y las respuestas REST.  
- **Servicios:** contienen la lógica de negocio, es decir, las operaciones principales.  
- **Modelos:** representan las entidades del sistema (cliente, cuenta, transacción).  
- **Datos:** se leen y escriben en archivos JSON, los cuales simulan el almacenamiento persistente.  

Cada acción —como registrar un cliente, transferir dinero o consultar transacciones— sigue una secuencia lógica clara y validada.

Por ejemplo:
1. Se valida la existencia del cliente o la cuenta.
2. Se procesa la operación solicitada.
3. Se actualiza el archivo JSON correspondiente.
4. Se devuelve una respuesta clara y estructurada al usuario.

---

## 🧩 Endpoints Principales (Swagger)

El proyecto cuenta con documentación automática generada con **Swagger**.  
Una vez en ejecución, puedes acceder a ella en:

http://localhost:8080/swagger-ui/index.html

markdown
Copiar código

### 📘 Endpoints disponibles

| Método | Endpoint | Descripción |
|--------|-----------|-------------|
| **GET** | `/api/bank/customers` | Lista todos los clientes |
| **POST** | `/api/bank/customers` | Crea un nuevo cliente |
| **GET** | `/api/bank/customers/{customerId}` | Consulta un cliente específico |
| **GET** | `/api/bank/customers/{customerId}/accounts` | Obtiene las cuentas de un cliente |
| **POST** | `/api/bank/customers/{customerId}/accounts` | Crea una cuenta para el cliente |
| **GET** | `/api/bank/accounts/{accountId}` | Consulta una cuenta por ID |
| **POST** | `/api/bank/accounts/{accountId}/deposit` | Realiza un depósito |
| **POST** | `/api/bank/accounts/{accountId}/withdraw` | Realiza un retiro |
| **POST** | `/api/bank/accounts/{fromAccountId}/transfer` | Transfiere dinero entre cuentas |
| **POST** | `/api/bank/accounts/{accountId}/apply-interest` | Aplica intereses a una cuenta |
| **GET** | `/api/bank/accounts/{accountId}/transactions` | Muestra el historial de transacciones |

---

🎯 Objetivos del Proyecto
✅ Aplicar conceptos de lógica de programación
✅ Aprender a estructurar un proyecto Java con Maven
✅ Simular un sistema bancario simple con archivos JSON
✅ Implementar controladores REST con Spring Boot
✅ Documentar endpoints con Swagger
✅ Fomentar buenas prácticas de diseño y documentación

👨‍💻 Autor
John Zuluaga
Proyecto académico – Lógica para Solución de Problemas

## 1 EVIDENCIAS
<img width="1594" height="768" alt="image" src="https://github.com/user-attachments/assets/923fcc42-af1d-43f4-b01a-f66d2b231a5d" />
<img width="921" height="241" alt="image" src="https://github.com/user-attachments/assets/4b850db5-7b6a-4502-af37-4f842b6d185b" />
<img width="1530" height="763" alt="image" src="https://github.com/user-attachments/assets/6d957978-4603-4264-9920-55eda32e4443" />
<img width="1553" height="803" alt="image" src="https://github.com/user-attachments/assets/2f5f5377-7a7c-421e-809d-f6d4a3c18b6a" />
<img width="1557" height="807" alt="image" src="https://github.com/user-attachments/assets/3dc55327-33f9-4b7e-9ab3-9b713244a226" />
<img width="1540" height="724" alt="image" src="https://github.com/user-attachments/assets/b2e851e6-6ea7-49c1-9744-67a0533ba28c" />
<img width="1475" height="730" alt="image" src="https://github.com/user-attachments/assets/e65ad565-1ee8-48f3-a746-db1c7fa3571b" />
<img width="1561" height="807" alt="image" src="https://github.com/user-attachments/assets/e17584cd-7049-4be0-a6b0-49f1777b81c8" />
<img width="1556" height="790" alt="image" src="https://github.com/user-attachments/assets/e43f6cba-c4d3-4351-bb81-550ea9adced9" />

## 2 EVIDENCIA SWAGGER










