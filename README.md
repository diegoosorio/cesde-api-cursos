# API REST de Gestión de Cursos y Docentes

## Descripción

Esta es una API RESTful para gestionar la información de los cursos ofrecidos por Cesde. La aplicación permite a los administradores agregar, editar y eliminar cursos, así como gestionar los docentes que dictarán cada curso. Los datos se almacenan en una base de datos PostgreSQL.

## Requisitos

- Java 17
- Spring Boot 3.4.3
- PostgreSQL
- Gradle
- Lombok

## Instalación

1. Clona el repositorio:

```bash
https://github.com/diegoosorio/cesde-api-cursos.git
```

2. Navega al directorio del proyecto:

3. Configura la base de datos PostgresSQL
   
4. Uso

5. La API ofrece los siguientes endpoints:

Endpoints para Cursos

GET /api/cursos: Obtener una lista de todos los cursos.

POST /api/cursos: Crear un nuevo curso.

GET /api/cursos/{id}: Obtener los detalles de un curso específico.

PUT /api/cursos/{id}: Actualizar un curso existente.

DELETE /api/cursos/{id}: Eliminar un curso.

Endpoints para Docentes

GET /api/docentes: Obtener una lista de todos los docentes.

POST /api/docentes: Crear un nuevo docente.

GET /api/docentes/{id}: Obtener los detalles de un docente específico.

PUT /api/docentes/{id}: Actualizar un docente existente.

DELETE /api/docentes/{id}: Eliminar un docente.
