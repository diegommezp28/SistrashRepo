
CREATE TABLE PRODUCTO(
nombre varchar(255) NOT NULL ,
nombre_Servicio varchar(255)NOT NULL,
costo double precision,
CONSTRAINT PRODUCTO_PK PRIMARY KEY(nombre, nombre_Servicio)
);

CREATE TABLE DESCUENTO(
nombre_Plan varchar(255) NOT NULL,
nombre_Producto varchar(255) NOT NULL,
nombre_Servicio varchar(255) NOT NULL,
porcentaje int,
maximo_Productos int,
CONSTRAINT DESCUENTO_PK PRIMARY KEY(nombre_Plan, nombre_Producto, nombre_servicio)
);

CREATE TABLE UTENSILIO(
id INT NOT NULL,
nombre varchar(255),
buen_Estado char(1),
prestado char(1),
CONSTRAINT UTENSILIO_PK PRIMARY KEY(id)
);

CREATE TABLE CONSUMO(
id int NOT NULL,
total_Consumo float,
id_Reserva int NOT NULL,
nombre_Servicio varchar(255) NOT NULL,
CONSTRAINT CONSUMO_PK PRIMARY KEY(id)
);

CREATE TABLE TIENE_UTENSILIO(
id_Reserva int NOT NULL,
id_Utensilio int not null,
buen_Estado char(1),
costo float,
CONSTRAINT TIENE_UTENSILIO_PK PRIMARY KEY(id_Reserva, id_Utensilio)
);

CREATE TABLE RESERVA(
id int NOT NULL,
fecha_Llegada date,
fecha_Salida date,
numero_Personas int,
nombre_PlanPago varchar(255),
total_Pago float,
check_In int,
check_Out int,
documento_Cliente int,
codigo_Habitacion varchar(255),
CONSTRAINT RESERVA_PK PRIMARY KEY(id)
);

CREATE TABLE SERVICIO (
nombre varchar(255) NOT NULL,
descripcion varchar(255),
capacidad int,
CONSTRAINT SERVICIO_PK PRIMARY KEY(nombre)
);

CREATE TABLE RESERVA_DE_SERVICIO(
reserva date NOT NULL,
nombre_Servicio varchar(255) NOT NULL,
id_Reserva int NOT NULL,
tiempo_Reserva int,
CONSTRAINT RESERVA_DE_SERVICIO_PK PRIMARY KEY(reserva, nombre_Servicio, id_Reserva)
);

CREATE TABLE TIPO_SERVICIO(
id int NOT NULL,
nombre varchar(255),
reserva char(1),
CONSTRAINT TIPO_SERVICIO_PK PRIMARY KEY(id)
);

CREATE TABLE PLANES_DISPONIBLES(
nombre varchar(255) NOT NULL,
descripcion varchar(255),
dias_Totales int,
costo_Total float,
nombre_Hotel varchar(255),
CONSTRAINT PLANES_DISPONIBLES_PK PRIMARY KEY(nombre)
);

CREATE TABLE ACOMPANIANTE(
documento int NOT NULL,
tipo_Documento varchar(255),
nombre varchar(255),
acompaniante char(1),
CONSTRAINT ACOMPANIANTE_PK PRIMARY KEY(documento)
);

CREATE TABLE HOTEL(
nombre varchar(255) NOT NULL,
ciudad varchar(255),
numero_Habitaciones int,
CONSTRAINT HOTEL_PK PRIMARY KEY(nombre)
);

CREATE TABLE TIPO_HABITACION(
nombre varchar(255) NOT NULL,
costo_Noche float,
descripcion varchar(800),
CONSTRAINT TIPO_HABITACION_PK PRIMARY KEY(nombre)
);

CREATE TABLE HABITACION(
codigo varchar(255) NOT NULL,
nombre_Hotel varchar(255),
nombre_Tipo_Habitacion varchar(255),
CONSTRAINT HABITACION_PK PRIMARY KEY(codigo )
);

CREATE TABLE USUARIO (
documento int NOT NULL,
tipo_Documento varchar(255),
nombre varchar(255),
correo varchar(255),
nombre_Rol_Usuario varchar(255),
nombre_Hotel varchar(255),
CONSTRAINT USUARIO_PK PRIMARY KEY(documento)
);

CREATE TABLE ROL_USUARIO (
nombre varchar(255) NOT NULL,
descripcion varchar(600),
CONSTRAINT ROL_USUARIO_PK PRIMARY KEY(nombre)
);

CREATE TABLE HABITACION_HOTEL(
nombre_Hotel varchar(255) NOT NULL,
codigo_Habitacion varchar(255),
CONSTRAINT HABITACION_HOTEL_PK PRIMARY KEY(nombre_Hotel, codigo_Habitacion)
);

CREATE TABLE ACOMPANIANTE_RESERVA (
documento_Acompaniante int NOT NULL,
id_Reserva int NOT NULL,
CONSTRAINT ACOMPANIANTE_RESERVA_PK PRIMARY KEY(documento_Acompaniante, id_Reserva)
);

CREATE TABLE PRODUCTOS_CONSUMIDOS(
id_Consumo int NOT NULL,
nombre_Producto varchar(255),
nombre_Servicio varchar(255),
CONSTRAINT PRODUCTOS_CONSUMIDOS_PK PRIMARY KEY(id_consumo)
);

CREATE TABLE SERVICIO_TIPO_SERVICIO(
nombre_servicio varchar(255) not null,
id_Tipo_servicio int NOT NULL,
CONSTRAINT SERVICIO_TIPO_SERVICIO_PK PRIMARY KEY(nombre_servicio, id_Tipo_Servicio)
);

CREATE TABLE TIPO_HABITACION_HOTEL(
nombre_tipo varchar(255) NOT NULL,
nombre_hotel varchar(255) NOT NULL,
CONSTRAINT TIPO_HABITACION_HOTEL_PK PRIMARY KEY(nombre_tipo, nombre_hotel)
);

ALTER TABLE DESCUENTO
ADD CONSTRAINT FK_producto 
FOREIGN KEY (nombre_producto, nombre_servicio) REFERENCES PRODUCTO(nombre, nombre_servicio);

ALTER TABLE PRODUCTO
ADD CONSTRAINT FK_nombre_servicio
FOREIGN KEY (nombre_servicio) REFERENCES SERVICIO(nombre);

ALTER TABLE CONSUMO
ADD CONSTRAINT FK_reserva
FOREIGN KEY (id_Reserva) REFERENCES RESERVA(id);

ALTER TABLE CONSUMO
ADD CONSTRAINT FK_Servicio
FOREIGN KEY (nombre_Servicio) REFERENCES SERVICIO(nombre);

ALTER TABLE TIENE_UTENSILIO 
ADD CONSTRAINT FK_id_Reserva
FOREIGN KEY (id_Reserva) REFERENCES RESERVA(id);

ALTER TABLE TIENE_UTENSILIO
ADD CONSTRAINT FK_Id_Utensilio
FOREIGN KEY (id_Utensilio) REFERENCES UTENSILIO(id);

ALTER TABLE RESERVA
ADD CONSTRAINT FK_documento_Cliente
FOREIGN KEY (documento_Cliente) REFERENCES USUARIO(documento);

ALTER TABLE RESERVA
ADD CONSTRAINT FK_codigo_Habitacion
FOREIGN KEY (codigo_Habitacion) REFERENCES HABITACION(codigo);

ALTER TABLE RESERVA_DE_SERVICIO
ADD CONSTRAINT FK_nombre_Servicio_RDS
FOREIGN KEY (nombre_Servicio) REFERENCES SERVICIO(nombre);

ALTER TABLE RESERVA_DE_SERVICIO
ADD CONSTRAINT FK_id_Reserva_RDS
FOREIGN KEY (id_Reserva) REFERENCES RESERVA(id);

ALTER TABLE PLANES_DISPONIBLES
ADD CONSTRAINT FK_nombre_Hotel_PD
FOREIGN KEY (nombre_Hotel) REFERENCES HOTEL(nombre);

ALTER TABLE HABITACION
ADD CONSTRAINT FK_nombre_Hotel_H
FOREIGN KEY (nombre_Hotel) REFERENCES HOTEL(nombre);

ALTER TABLE HABITACION
ADD CONSTRAINT FK_nombre_Tipo_Habitacion_H
FOREIGN KEY (nombre_Tipo_Habitacion) REFERENCES TIPO_HABITACION(nombre);

ALTER TABLE USUARIO
ADD CONSTRAINT FK_nombre_Rol_Usuario
FOREIGN KEY (nombre_Rol_Usuario) REFERENCES ROL_USUARIO(nombre);

ALTER TABLE USUARIO
ADD CONSTRAINT FK_nombre_Hotel_Usuario
FOREIGN KEY (nombre_Hotel) REFERENCES HOTEL(nombre);

ALTER TABLE HABITACION_HOTEL
ADD CONSTRAINT FK_nombre_Hotel_HH
FOREIGN KEY (nombre_Hotel) REFERENCES HOTEL(nombre);

ALTER TABLE HABITACION_HOTEL
ADD CONSTRAINT FK_codigo_Habitacion_HH
FOREIGN KEY (codigo_Habitacion) REFERENCES HABITACION(codigo);

ALTER TABLE ACOMPANIANTE_RESERVA
ADD CONSTRAINT FK_documento_Acompaniante
FOREIGN KEY (documento_Acompaniante) REFERENCES ACOMPANIANTE(documento);

ALTER TABLE ACOMPANIANTE_RESERVA
ADD CONSTRAINT FK_id_Reserva_AR
FOREIGN KEY (id_Reserva) REFERENCES RESERVA(id);

ALTER TABLE PRODUCTOS_CONSUMIDOS
ADD CONSTRAINT FK_id_Consumo_PC
FOREIGN KEY (id_Consumo) REFERENCES CONSUMO(id);

ALTER TABLE PRODUCTOS_CONSUMIDOS
ADD CONSTRAINT FK_nombre_Producto_PC
FOREIGN KEY (nombre_Producto, nombre_Servicio) REFERENCES PRODUCTO(nombre, nombre_Servicio);

ALTER TABLE SERVICIO_TIPO_SERVICIO
ADD CONSTRAINT FK_nombre_Servicio_STS
FOREIGN KEY (nombre_Servicio) REFERENCES SERVICIO(nombre);

ALTER TABLE SERVICIO_TIPO_SERVICIO
ADD CONSTRAINT FK_id_Tipo_Servicio_STS
FOREIGN KEY (id_Tipo_Servicio) REFERENCES TIPO_SERVICIO(id);

ALTER TABLE TIPO_HABITACION_HOTEL
ADD CONSTRAINT FK_nombre_Tipo_THH
FOREIGN KEY (nombre_Tipo) REFERENCES TIPO_HABITACION(nombre);

ALTER TABLE TIPO_HABITACION_HOTEL
ADD CONSTRAINT FK_nombre_Hotel_THH
FOREIGN KEY (nombre_Hotel) REFERENCES HOTEL(nombre);
