# Actividad 2 - Proyecto Java con Apache Commons CLI y Log4j

Este proyecto es una aplicación Java de consola desarrollada como parte de la actividad 2 del curso, cuyo objetivo es demostrar el uso de bibliotecas externas como **Apache Commons CLI** para el manejo de argumentos desde la línea de comandos, y **Log4j** para la gestión de logs.

---

## 📁 Estructura del Proyecto

```
Actividad2/
├── pom.xml
├── README.md
├── .gitignore
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── ar/edu/udeci/pv/Main.java
│   │   └── resources/
│   │       └── log4j.properties
└── target/
```

---

## 🚀 Ejecución del Proyecto

### 1. Compilar con Maven

```bash
mvn clean package
```

Esto generará un `.jar` en la carpeta `target/`:

```
Actividad2-1.0-SNAPSHOT-jar-with-dependencies.jar
```

---

### 2. Ejecutar el JAR

```bash
java -jar target/Actividad2-1.0-SNAPSHOT-jar-with-dependencies.jar -n TuNombre
```

📌 Opción `-n` o `--name`: permite pasar tu nombre como parámetro.

**Ejemplo:**

```
Hola y bienvenido, Juan!
i = 1
i = 2
...
```

---

## 🧰 Tecnologías Utilizadas

- Java 24
- Maven
- Apache Commons CLI 1.5.0
- Apache Log4j 1.2.17
- maven-assembly-plugin

---

## 📝 Configuración del Log

En `src/main/resources/log4j.properties`:

```properties
log4j.rootLogger=DEBUG, console
log4j.appender.console=org.apache.log4j.ConsoleAppender
log4j.appender.console.layout=org.apache.log4j.PatternLayout
log4j.appender.console.layout.ConversionPattern=%d{HH:mm:ss} %-5p [%c] - %m%n
```

Esto muestra mensajes como:

```
12:00:01 INFO  [ar.edu.udeci.pv.Main] - Aplicación iniciada con el nombre: Juan
```

---

## 📌 Notas

- Si no se pasa el parámetro `-n`, se usa `Mundo` por defecto.
- El código imprime 5 iteraciones con logs en cada paso.

---

## 📬 Contacto

Este proyecto fue realizado como parte del curso de Programación Visual en la **UDECI**.  
Para consultas, contactá con tu docente o a través del aula virtual.
