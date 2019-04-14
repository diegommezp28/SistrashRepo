
ALTER TABLE DESCUENTO
DROP CONSTRAINT FK_producto ;

ALTER TABLE PRODUCTO
DROP CONSTRAINT FK_id_servicio;

ALTER TABLE CONSUMO
DROP CONSTRAINT FK_reserva;

ALTER TABLE CONSUMO
DROP CONSTRAINT FK_Servicio_C;

ALTER TABLE TIENE_UTENSILIO 
DROP CONSTRAINT FK_id_Reserva;

ALTER TABLE TIENE_UTENSILIO
DROP CONSTRAINT FK_Id_Utensilio;

ALTER TABLE RESERVA
DROP CONSTRAINT FK_id_Cliente;

ALTER TABLE RESERVA
DROP CONSTRAINT FK_codigo_Habitacion;

ALTER TABLE RESERVA
DROP CONSTRAINT FK_nombre_PlanPago;

ALTER TABLE RESERVA_DE_SERVICIO
DROP CONSTRAINT FK_id_Servicio_RDS;

ALTER TABLE RESERVA_DE_SERVICIO
DROP CONSTRAINT FK_id_Reserva_RDS;

ALTER TABLE ACOMPANIANTE
DROP CONSTRAINT FK_id_Reserva_A;

ALTER TABLE PLANES_DISPONIBLES
DROP CONSTRAINT FK_id_Hotel_PD;

ALTER TABLE HABITACION
DROP CONSTRAINT FK_id_Hotel_H;

ALTER TABLE HABITACION
DROP CONSTRAINT FK_nombre_Tipo_Habitacion_H;

ALTER TABLE USUARIO
DROP CONSTRAINT FK_nombre_Rol_Usuario;

ALTER TABLE USUARIO
DROP CONSTRAINT FK_id_Hotel_Usuario;

ALTER TABLE PRODUCTOS_CONSUMIDOS
DROP CONSTRAINT FK_id_Consumo_PC;

ALTER TABLE PRODUCTOS_CONSUMIDOS
DROP CONSTRAINT FK_id_Producto_PC;

ALTER TABLE DESCUENTO_SERVICIO
DROP CONSTRAINT FK_SERVICIO_DS;

ALTER TABLE DESCUENTO_SERVICIO
DROP CONSTRAINT FK_PLAN;

ALTER TABLE MANTENIMIENTO
DROP CONSTRAINT FK_HABITACION;

ALTER TABLE MANTENIMIENTO
DROP CONSTRAINT FK_SERVICIO;

ALTER TABLE SERVICIO
DROP CONSTRAINT FK_id_TIPO_SERVICIO;

ALTER TABLE SERVICIO
DROP CONSTRAINT FK_id_Hotel_SERVICIO;

ALTER TABLE FACTURA
DROP CONSTRAINT FK_ID_RESERVA_F;

ALTER TABLE FACTURA
DROP CONSTRAINT FK_ID_USUARIO_F;


	DROP TABLE MANTENIMIENTO;
	DROP TABLE PRODUCTO;
	DROP TABLE DESCUENTO;
	DROP TABLE UTENSILIO;
	DROP TABLE CONSUMO;
	DROP TABLE TIENE_UTENSILIO;
	DROP TABLE RESERVA;
	DROP TABLE SERVICIO;
	DROP TABLE RESERVA_DE_SERVICIO;
	DROP TABLE TIPO_SERVICIO;
	DROP TABLE PLANES_DISPONIBLES;
	DROP TABLE ACOMPANIANTE;
	DROP TABLE HOTEL;
	DROP TABLE TIPO_HABITACION;
	DROP TABLE HABITACION;
	DROP TABLE USUARIO ;
	DROP TABLE ROL_USUARIO ;
	DROP TABLE PRODUCTOS_CONSUMIDOS;
	DROP TABLE DESCUENTO_SERVICIO;
	DROP TABLE FACTURA;