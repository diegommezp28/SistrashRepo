INSERT INTO TIPO_SERVICIO (id, nombre, reserva)
VALUES ('01', 'piscina', 'F');

INSERT INTO SERVICIO (nombre, descripcion, capacidad)
VALUES ('piscina general', 'piscina más grande del hotel. Todo cliente puede entras si hay cupo.', 100);

INSERT INTO SERVICIO_TIPO_SERVICIO (nombre_servicio, id_tipo_servicio)
VALUES ('piscina general', '01');

INSERT INTO TIPO_SERVICIO (id, nombre, reserva)
VALUES ('02', 'gimnasio', 'F');

INSERT INTO SERVICIO (nombre, descripcion, capacidad)
VALUES ('bodytech', 'Sede de BodyTech en el hotel', 50);

INSERT INTO SERVICIO_TIPO_SERVICIO (nombre_servicio, id_tipo_servicio)
VALUES ('bodytech', '02');

INSERT INTO TIPO_SERVICIO (id, nombre, reserva)
VALUES ('03', 'internet', 'F');

INSERT INTO SERVICIO (nombre, descripcion, capacidad)
VALUES ('internet banda ancha', 'Internet de 50 Megas del hotel', 50);

INSERT INTO SERVICIO_TIPO_SERVICIO (nombre_servicio, id_tipo_servicio)
VALUES ('internet banda ancha', '03');

INSERT INTO TIPO_SERVICIO (id, nombre, reserva)
VALUES ('04', 'supermercado', 'F');

INSERT INTO SERVICIO (nombre, descripcion, capacidad)
VALUES ('Ara', 'Sede de Ara en el hotel');

INSERT INTO SERVICIO_TIPO_SERVICIO (nombre_servicio, id_tipo_servicio)
VALUES ('Ara', '04');

INSERT INTO TIPO_SERVICIO (id, nombre, reserva)
VALUES ('05', 'tienda', 'F');

INSERT INTO SERVICIO (nombre, descripcion)
VALUES ('Sony Store', 'Sede de Sony en el hotel');

INSERT INTO SERVICIO_TIPO_SERVICIO (nombre_servicio, id_tipo_servicio)
VALUES ('Sony Store', '05');

INSERT INTO TIPO_SERVICIO (id, nombre, reserva)
VALUES ('06', 'spa', 'T');

INSERT INTO SERVICIO (nombre, descripcion, capacidad)
VALUES ('spa las delicias', 'spa del hotel', 15);

INSERT INTO SERVICIO_TIPO_SERVICIO (nombre_servicio, id_tipo_servicio)
VALUES ('spa las delicias', '06');

INSERT INTO TIPO_SERVICIO (id, nombre, reserva)
VALUES ('07', 'Lavado/planchado/embolada', 'F');

INSERT INTO SERVICIO (nombre, descripcion)
VALUES ('lavanderia principal', 'Lavanderia del hotel');

INSERT INTO SERVICIO_TIPO_SERVICIO (nombre_servicio, id_tipo_servicio)
VALUES ('lavanderia principal', '07');

INSERT INTO TIPO_SERVICIO (id, nombre, reserva)
VALUES ('08', 'Préstamo de utensilios.', 'F');

INSERT INTO SERVICIO (nombre, descripcion)
VALUES ('prestamo de utensilio', 'Prestamo de utensilios del hotel');

INSERT INTO SERVICIO_TIPO_SERVICIO (nombre_servicio, id_tipo_servicio)
VALUES ('lavanderia principal', '08');

INSERT INTO TIPO_SERVICIO (id, nombre, reserva)
VALUES ('09', 'salón de reuniones', 'T');

INSERT INTO SERVICIO (nombre, descripcion, capacidad)
VALUES ('salón Comodore', 'salón de reuniones del hotel', 9);

INSERT INTO SERVICIO_TIPO_SERVICIO (nombre_servicio, id_tipo_servicio)
VALUES ('salón Comodore', '09');

INSERT INTO TIPO_SERVICIO (id, nombre, reserva)
VALUES ('10', 'salón de conferencias', 'T');

INSERT INTO SERVICIO (nombre, descripcion, capacidad)
VALUES ('auditorio Concorde', 'Auditorio del hotel', 150);

INSERT INTO SERVICIO_TIPO_SERVICIO (nombre_servicio, id_tipo_servicio)
VALUES ('auditorio Concorde', '10');

INSERT INTO TIPO_SERVICIO (id, nombre, reserva)
VALUES ('11', 'bar', 'F');

INSERT INTO SERVICIO (nombre, descripcion, capacidad)
VALUES ('BBC', 'BBC del hotel. Estilo jazz', 40);

INSERT INTO SERVICIO_TIPO_SERVICIO (nombre_servicio, id_tipo_servicio)
VALUES ('BBC', '11');

INSERT INTO PRODUCTO (nombre, nombre_servicio, costo)
VALUES ('cerveza BBC', 'BBC', 8000);

INSERT INTO PRODUCTO (nombre, nombre_servicio, costo)
VALUES ('cerveza rosada', 'BBC', 8500);

INSERT INTO PRODUCTO (nombre, nombre_servicio, costo)
VALUES ('cerveza nerga', 'BBC', 8500);

INSERT INTO TIPO_SERVICIO (id, nombre, reserva)
VALUES ('12', 'restaurante', 'F');

INSERT INTO SERVICIO (nombre, descripcion, capacidad)
VALUES ('Andrés Carne de Rés', 'Andrés del hotel. Estilo steak house', 80);

INSERT INTO SERVICIO_TIPO_SERVICIO (nombre_servicio, id_tipo_servicio)
VALUES ('Andrés Carne de Rés', '12');

INSERT INTO PRODUCTO (nombre, nombre_servicio, costo)
VALUES ('Solomillo de res', 'Andrés Carne de Rés', 35000);

INSERT INTO PRODUCTO (nombre, nombre_servicio, costo)
VALUES ('Bife de chorizo', 'Andrés Carne de Rés', 45000);

INSERT INTO PRODUCTO (nombre, nombre_servicio, costo)
VALUES ('PorterHouse steak', 'Andrés Carne de Rés', 55000);