# DSY1103-011V-proyecto-playgg
proyecto FullStack año 2026

COMANDOS GIT

// ir a la carpeta del proyecto
cd nombre-del-repo


// iniciar git en un proyecto nuevo
git init


// clonar un repositorio desde github
git clone URL_DEL_REPO

// entrar al repo clonado
cd nombre-del-repo


// ver estado actual (archivos modificados, pendientes, etc)
git status


// agregar TODOS los cambios
git add .

// agregar un archivo específico
git add archivo.java


// guardar cambios con mensaje
git commit -m "mensaje descriptivo"


// subir cambios al repositorio remoto
git push

// subir por primera vez una rama nueva
git push -u origin nombre-rama


// traer cambios del repositorio remoto
git pull


// ver ramas locales
git branch

// ver TODAS las ramas (incluye remotas)
git branch -a


// cambiarse a una rama existente
git checkout nombre-rama

// crear una nueva rama y cambiarse a ella
git checkout -b nombre-rama


// unir cambios de otra rama (ej: develop) a la actual
git merge develop


// eliminar una rama local
git branch -d nombre-rama


// ver en qué rama estás actualmente
git branch




📚GLOSARIO (traducción humana + técnica)
🔌 Driver
👉 Conector específico para una BD (MySQL, H2, etc.)
•	Es el “traductor básico” 
•	Sin esto, Java no puede conectarse 
📌 De tus apuntes:
“Driver… es el traductor básico para conectarse a una base de datos específica” 
________________________________________
🔗 JDBC (Java Database Connectivity)
👉 Forma estándar de Java para hablar con la BD
•	Aquí usas SQL directamente 
•	Es bajo nivel 
📌 De tus apuntes:
“JDBC… puedes hacer cosas como SELECT * FROM users; pero tienes que escribir mucho SQL a mano” 
💡 Traducción:
👉 JDBC = “hablarle a la BD con SQL”
________________________________________
🧩 JPA (Java Persistence API)
👉 Interfaz que te permite trabajar con objetos en vez de SQL
📌 De tus apuntes:
“JPA… en vez de usar SQL directo, trabajas con objetos Java” 
💡 Traducción:
👉 JPA = “olvídate del SQL, usa clases”
________________________________________
⚙️ Hibernate
👉 Implementación de JPA (el que hace la magia real)
📌 De tus apuntes:
“Hibernate convierte tus clases Java en tablas automáticamente” 
💡 Traducción:
👉 Hibernate = “el robot que traduce objetos ↔ tablas”
________________________________________
🏷️ Anotaciones JPA
Sirven para mapear clases a tablas
📌 De tus apuntes:
“@Entity, @Table, @Column, @JoinColumn, @OneToMany…” 
Ejemplo:
@Entity
@Table(name="users")
class User {
    @Column(name="name")
    String nombre;
}
________________________________________
🌐 Spring Boot
👉 Framework que une todo
•	Levanta el servidor 
•	Configura dependencias 
•	Hace todo automático 
💡 Traducción:
👉 Spring Boot = “el jefe que coordina todo el sistema”
________________________________________
🌍 Spring Web
👉 Permite crear APIs REST
•	Endpoints tipo: 
GET /users
POST /users


________________________________________
🧠 REST Controller
👉 Clase que recibe peticiones HTTP
📌 De la pauta:
“Controller → manejo de solicitudes REST” 
________________________________________
🧠 Service
👉 Lógica del sistema
📌 De la pauta:
“Service → lógica de negocio” 
________________________________________
🗄️ Repository
👉 Acceso a datos (JPA)
📌 De la pauta:
“Repository → acceso a datos” 
________________________________________
🧱 CSR (Controller-Service-Repository)
👉 Forma de ordenar el código
📌 De la pauta:
“Flujo ordenado, coherente y sin mezclar responsabilidades” 
💡 Traducción:
•	Controller → recibe 
•	Service → piensa 
•	Repository → guarda 
________________________________________
📦 Maven
👉 Gestor de dependencias
•	Descarga librerías automáticamente 
•	Usa archivo pom.xml 
________________________________________
🧪 H2 Database
👉 Base de datos liviana para pruebas
📌 De tus apuntes:
“H2 > ddl -> create” 
💡 Traducción:
👉 Se crea sola al correr el proyecto
________________________________________
⚡ Lombok
👉 Reduce código repetido
Ejemplo:
@Getter
@Setter
________________________________________
✔️ Bean Validation
👉 Validar datos automáticamente
📌 De la pauta:
“Validación de datos con Bean Validation” 
Ejemplo:
@NotNull
@Email
________________________________________
📡 ResponseEntity
👉 Controlar respuestas HTTP
📌 De la pauta:
“Uso obligatorio de ResponseEntity” 
________________________________________


⚠️ @ControllerAdvice
👉 Manejo global de errores
📌 De la pauta:
“manejo centralizado de errores” 
________________________________________
🧾 JSON
👉 Formato de respuesta de APIs
Ejemplo:
{
  "id": 1,
  "nombre": "Juan"
}
________________________________________
🧩 Microservicio
👉 Aplicación pequeña con una sola responsabilidad
📌 De tu documento:
“separando responsabilidades por dominios funcionales independientes” 
💡 Traducción:
👉 Un microservicio = un mini proyecto
________________________________________
🔗 WebClient / Feign
👉 Comunicación entre microservicios
📌 De la pauta:
“Consumo de endpoints entre microservicios mediante WebClient o Feign Client” 
________________________________________
🗃️ Base de datos por microservicio
📌 De tu documento:
“Cada microservicio tendrá base de datos independiente.” 

