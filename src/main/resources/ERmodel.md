**### Modelo Entidad-Relación (ER)

#### Entidades:
1. **Curso**
    - id (PK)
    - nombre (texto)
    - descripcion (texto)
    - duracion_semanas (entero)
    - precio (decimal)
    - fecha_inicio (fecha y hora)
    - docente_id (FK) -> hace referencia a la entidad Docente

2. **Docente**
    - id (PK)
    - nombre (texto)
    - documento (texto)
    - correo (texto)

#### Relaciones:
- Un **Docente** puede dictar varios **Cursos** (relación 1:N).

#### Diagrama:

```mermaid
erDiagram
    CURSO {
        int id PK
        varchar nombre
        text descripcion
        int duracion_semanas
        decimal precio
        timestamp fecha_inicio
        int docente_id FK
    }
    DOCENTE {
        int id PK
        varchar nombre
        varchar documento
        varchar correo
    }
    DOCENTE ||--o{ CURSO: dicta
**