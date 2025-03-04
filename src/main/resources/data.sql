-- Insertar Docentes
INSERT INTO Docente (nombre, documento, correo) VALUES
('Maria Rodriguez', '123456789', 'maria.rodriguez@example.com'),
('Juan Perez', '987654321', 'juan.perez@example.com');

-- Insertar Cursos
INSERT INTO Curso (nombre, descripcion, duracion_semanas, precio, fecha_inicio, docente_id) VALUES
('Introducción a la Programación', 'Curso básico de programación para principiantes', 8, 299.99, '2025-03-10 09:00:00', 1),
('Desarrollo Web con Java', 'Curso avanzado de desarrollo web usando Java y Spring Boot', 12, 499.99, '2025-03-15 10:00:00', 2);
