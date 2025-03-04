CREATE TABLE Docente (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    documento VARCHAR(50) UNIQUE NOT NULL,
    correo VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE Curso (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT NOT NULL,
    duracion_semanas INT NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    fecha_inicio TIMESTAMP NOT NULL,
    docente_id INT,
    CONSTRAINT fk_docente
        FOREIGN KEY (docente_id)
        REFERENCES Docente(id)
        ON DELETE SET NULL
);