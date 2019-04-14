
CREATE TABLE PRODUCTO(
id int NOT NULL,
nombre varchar(255) NOT NULL ,
id_Servicio int NOT NULL,
costo double precision,
CONSTRAINT PRODUCTO_PK PRIMARY KEY(id)
);

CREATE TABLE DESCUENTO(
nombre_Plan varchar(255) NOT NULL,
id_Producto int NOT NULL,
porcentaje int,
maximo_Productos int,
CONSTRAINT DESCUENTO_PK PRIMARY KEY(nombre_Plan, id_Producto)
);

CREATE TABLE UTENSILIO(
id INT NOT NULL,
nombre varchar(255),
costo_Reparacion float,
CONSTRAINT UTENSILIO_PK PRIMARY KEY(id)
);

CREATE TABLE CONSUMO(
id int NOT NULL,
total_Consumo float,
id_Reserva int NOT NULL,
id_Servicio int NOT NULL,
fecha date NOT NULL,
CONSTRAINT CONSUMO_PK PRIMARY KEY(id)
);

CREATE TABLE TIENE_UTENSILIO(
id int NOT NULL,
id_Reserva int NOT NULL,
id_Utensilio int not null,
buen_Estado char(1),
costo float,
CONSTRAINT TIENE_UTENSILIO_PK PRIMARY KEY(id)
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
id_Cliente int,
val_Habitacion float,
codigo_Habitacion varchar(255),
CONSTRAINT RESERVA_PK PRIMARY KEY(id)
);

CREATE TABLE SERVICIO (
id int NOT NULL,
nombre varchar(255) NOT NULL,
descripcion varchar(255),
capacidad int,
id_TipoServicio int,
id_Hotel int,
costo float,	
CONSTRAINT SERVICIO_PK PRIMARY KEY(id)
);

CREATE TABLE RESERVA_DE_SERVICIO(
id int NOT NULL,
reserva date NOT NULL,
id_Servicio int NOT NULL,
id_Reserva int NOT NULL,
tiempo_Reserva int,
CONSTRAINT RESERVA_DE_SERVICIO_PK PRIMARY KEY(id)
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
id_Hotel int,
tipo_Plan varchar(255),
fecha_Limite date,
CONSTRAINT PLANES_DISPONIBLES_PK PRIMARY KEY(nombre)
);

CREATE TABLE ACOMPANIANTE(
documento int NOT NULL,
tipo_Documento varchar(255),
nombre varchar(255),
acompaniante char(1),
id_Reserva int,
CONSTRAINT ACOMPANIANTE_PK PRIMARY KEY(documento)
);

CREATE TABLE HOTEL(
id int NOT NULL,
nombre varchar(255) NOT NULL,
ciudad varchar(255),
numero_Habitaciones int,
CONSTRAINT HOTEL_PK PRIMARY KEY(id)
);

CREATE TABLE TIPO_HABITACION(
nombre varchar(255) NOT NULL,
costo_Noche float,
descripcion varchar(800),
CONSTRAINT TIPO_HABITACION_PK PRIMARY KEY(nombre)
);

CREATE TABLE HABITACION(
codigo varchar(255) NOT NULL,
id_Hotel int,
nombre_Tipo_Habitacion varchar(255),
CONSTRAINT HABITACION_PK PRIMARY KEY(codigo )
);

CREATE TABLE USUARIO (
id int NOT NULL,
documento int NOT NULL,
tipo_Documento varchar(255),
nombre varchar(255),
correo varchar(255),
nombre_Rol_Usuario varchar(255),
id_Hotel int,
CONSTRAINT USUARIO_PK PRIMARY KEY(id)
);

CREATE TABLE ROL_USUARIO (
nombre varchar(255) NOT NULL,
descripcion varchar(600),
CONSTRAINT ROL_USUARIO_PK PRIMARY KEY(nombre)
);

CREATE TABLE PRODUCTOS_CONSUMIDOS(
id int NOT NULL,
id_Consumo int NOT NULL,
id_Producto int NOT NULL,
cantidad int NOT NULL,
CONSTRAINT PRODUCTOS_CONSUMIDOS_PK PRIMARY KEY(id)
);

CREATE TABLE DESCUENTO_SERVICIO(
id_Servicio int NOT NULL,
nombre_Plan varchar(255),
porcentaje float,
CONSTRAINT DESCUENTO_SERVICIO_PK PRIMARY KEY(id_Servicio, nombre_Plan)
);

CREATE TABLE MANTENIMIENTO(
id int NOT NULL,
fecha date NOT NULL,
id_Servicio int,
codigo_Habitacion varchar(255),
tipoMantenimiento varchar(255),
CONSTRAINT MANTENIMIENTO_PK PRIMARY KEY(id)
);

CREATE TABLE FACTURA
(
id int NOT NULL,
total_APagar float,
id_Usuario int NOT NULL,
id_Reserva int NOT NULL,
CONSTRAINT FACTURA_PK PRIMARY KEY(id)
);

ALTER TABLE FACTURA
ADD CONSTRAINT FK_ID_RESERVA_F
FOREIGN KEY(id_Reserva) REFERENCES RESERVA(id);

ALTER TABLE FACTURA
ADD CONSTRAINT FK_ID_USUARIO_F
FOREIGN KEY(id_Usuario) REFERENCES USUARIO(id);

ALTER TABLE MANTENIMIENTO
ADD CONSTRAINT FK_SERVICIO
FOREIGN KEY(id_Servicio) REFERENCES SERVICIO(id);

ALTER TABLE MANTENIMIENTO
ADD CONSTRAINT FK_HABITACION
FOREIGN KEY(codigo_Habitacion) REFERENCES HABITACION(codigo);

ALTER TABLE DESCUENTO_SERVICIO
ADD CONSTRAINT FK_SERVICIO_DS
FOREIGN KEY(id_Servicio) REFERENCES SERVICIO(id);

ALTER TABLE DESCUENTO_SERVICIO
ADD CONSTRAINT FK_PLAN
FOREIGN KEY(nombre_Plan) REFERENCES PLANES_DISPONIBLES(nombre);

ALTER TABLE DESCUENTO
ADD CONSTRAINT FK_producto 
FOREIGN KEY (id_producto) REFERENCES PRODUCTO(id);

ALTER TABLE PRODUCTO
ADD CONSTRAINT FK_id_servicio
FOREIGN KEY (id_servicio) REFERENCES SERVICIO(id);

ALTER TABLE CONSUMO
ADD CONSTRAINT FK_reserva
FOREIGN KEY (id_Reserva) REFERENCES RESERVA(id);

ALTER TABLE CONSUMO
ADD CONSTRAINT FK_Servicio_C
FOREIGN KEY (id_Servicio) REFERENCES SERVICIO(id);

ALTER TABLE TIENE_UTENSILIO 
ADD CONSTRAINT FK_id_Reserva
FOREIGN KEY (id_Reserva) REFERENCES RESERVA(id);

ALTER TABLE TIENE_UTENSILIO
ADD CONSTRAINT FK_Id_Utensilio
FOREIGN KEY (id_Utensilio) REFERENCES UTENSILIO(id);

ALTER TABLE RESERVA
ADD CONSTRAINT FK_id_Cliente
FOREIGN KEY (id_Cliente) REFERENCES USUARIO(id);

ALTER TABLE RESERVA
ADD CONSTRAINT FK_codigo_Habitacion
FOREIGN KEY (codigo_Habitacion) REFERENCES HABITACION(codigo);

ALTER TABLE RESERVA
ADD CONSTRAINT FK_nombre_PlanPago
FOREIGN KEY (nombre_PlanPago) REFERENCES PLANES_DISPONIBLES(nombre);

ALTER TABLE RESERVA_DE_SERVICIO
ADD CONSTRAINT FK_id_Servicio_RDS
FOREIGN KEY (id_Servicio) REFERENCES SERVICIO(id);

ALTER TABLE RESERVA_DE_SERVICIO
ADD CONSTRAINT FK_id_Reserva_RDS
FOREIGN KEY (id_Reserva) REFERENCES RESERVA(id);

ALTER TABLE ACOMPANIANTE
ADD CONSTRAINT FK_id_Reserva_A
FOREIGN KEY (id_Reserva) REFERENCES RESERVA(id);

ALTER TABLE PLANES_DISPONIBLES
ADD CONSTRAINT FK_id_Hotel_PD
FOREIGN KEY (id_Hotel) REFERENCES HOTEL(id);

ALTER TABLE HABITACION
ADD CONSTRAINT FK_id_Hotel_H
FOREIGN KEY (id_Hotel) REFERENCES HOTEL(id);

ALTER TABLE HABITACION
ADD CONSTRAINT FK_nombre_Tipo_Habitacion_H
FOREIGN KEY (nombre_Tipo_Habitacion) REFERENCES TIPO_HABITACION(nombre);

ALTER TABLE USUARIO
ADD CONSTRAINT FK_nombre_Rol_Usuario
FOREIGN KEY (nombre_Rol_Usuario) REFERENCES ROL_USUARIO(nombre);

ALTER TABLE USUARIO
ADD CONSTRAINT FK_id_Hotel_Usuario
FOREIGN KEY (id_Hotel) REFERENCES HOTEL(id);

ALTER TABLE PRODUCTOS_CONSUMIDOS
ADD CONSTRAINT FK_id_Consumo_PC
FOREIGN KEY (id_Consumo) REFERENCES CONSUMO(id);

ALTER TABLE PRODUCTOS_CONSUMIDOS
ADD CONSTRAINT FK_id_Producto_PC
FOREIGN KEY (id_Producto) REFERENCES PRODUCTO(id);

ALTER TABLE SERVICIO
ADD CONSTRAINT FK_id_TIPO_SERVICIO
FOREIGN KEY (id_TipoServicio) REFERENCES TIPO_SERVICIO(id);

ALTER TABLE SERVICIO
ADD CONSTRAINT FK_id_Hotel_SERVICIO
FOREIGN KEY (id_Hotel) REFERENCES HOTEL(id);



