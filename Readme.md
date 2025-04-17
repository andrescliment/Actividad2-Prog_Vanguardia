# Actividad 2 - Proyecto Java con Apache Commons CLI y Log4j

Este proyecto es una aplicación Java de consola desarrollada como parte de la **Actividad 2** del curso de Programación Visual en **UDECI**.

El objetivo principal es incorporar y utilizar bibliotecas externas en un proyecto Java, específicamente:

- **Apache Commons CLI**: para gestionar argumentos de línea de comandos.
- **Apache Log4j**: para registrar logs del programa en consola.

Además, se contó con el apoyo de un **modelo de lenguaje de inteligencia artificial (LLM)** para asistir en la integración de tecnologías y la documentación del proyecto.

---

## 🤖 Asistencia con IA

Durante el desarrollo del proyecto, se utilizó **ChatGPT (basado en modelos de lenguaje de OpenAI)** para:

- Asistir en la integración de bibliotecas externas (Commons CLI y Log4j).
- Solucionar errores durante el empaquetado y ejecución del proyecto.
- Generar esta documentación en formato Markdown para GitHub.

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

## 🚀 Cómo ejecutar el proyecto

### 1. Compilar el proyecto con Maven

Desde la raíz del proyecto, ejecutá:

```bash
mvn clean package
```

Esto generará un archivo ejecutable en `target/`:

```
Actividad2-1.0-SNAPSHOT-jar-with-dependencies.jar
```

> Incluye tu código y todas las dependencias necesarias.

---

### 2. Ejecutar el JAR

```bash
java -jar target/Actividad2-1.0-SNAPSHOT-jar-with-dependencies.jar -n TuNombre
```

📌 Argumento `-n` o `--name`: nombre del usuario.

**Ejemplo de salida:**

```
Hola y bienvenido, Juan!
i = 1
i = 2
i = 3
i = 4
i = 5
```

---

## 🧰 Tecnologías Utilizadas

- Java 24
- Apache Maven
- Apache Commons CLI 1.5.0
- Apache Log4j 1.2.17
- Maven Assembly Plugin (para generar JAR con dependencias)
- ChatGPT (IA de OpenAI) para asistencia técnica y documentación

---

## 📝 Configuración del Log

Archivo: `src/main/resources/log4j.properties`

```properties
log4j.rootLogger=DEBUG, console
log4j.appender.console=org.apache.log4j.ConsoleAppender
log4j.appender.console.layout=org.apache.log4j.PatternLayout
log4j.appender.console.layout.ConversionPattern=%d{HH:mm:ss} %-5p [%c] - %m%n
```

**Ejemplo de log en ejecución:**

```
12:00:01 INFO  [ar.edu.udeci.pv.Main] - Aplicación iniciada con el nombre: Juan
12:00:01 DEBUG [ar.edu.udeci.pv.Main] - Iteración i = 1
...
```

---

## 📌 Notas adicionales

- Si no se pasa el parámetro `-n`, el valor por defecto es `"Mundo"`.
- El programa imprime una secuencia de iteraciones con logs asociados.
- El `pom.xml` ya incluye todas las dependencias necesarias para compilar y ejecutar.

---

## 📬 Contacto

Este proyecto fue realizado como parte del curso de **Programación Visual** en **UDECI**.  
Para consultas o sugerencias, contactá con tu docente o vía el aula virtual.
