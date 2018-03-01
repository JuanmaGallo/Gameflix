CREATE TABLE `usuario` (
`user` varchar(255) NOT NULL AUTO_INCREMENT,
`pass` varchar(255) NOT NULL,
`nombre` varchar(255) DEFAULT NULL,
`apellidos` varchar(255) DEFAULT NULL,
`correo` varchar(255) DEFAULT NULL,
`nacimiento` varchar(255) DEFAULT NULL,
`pais` varchar(255) DEFAULT NULL,
`residencia` varchar(255) DEFAULT NULL,
`perfil` varchar(255) NOT NULL,
PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;


insert into usuario(user,pass,nombre,apellidos,correo,nacimiento,pais,residencia,perfil) values ('gallito','1234','Juan','Gallo','juan@gmail.com','10/10/1994','España','Madrid','Gamer');
