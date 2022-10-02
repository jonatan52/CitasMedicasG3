-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-10-2022 a las 17:48:08
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `citas medicas g3 salud`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citasmedicas`
--

CREATE TABLE `citasmedicas` (
  `idCitasMedicas` int(11) NOT NULL COMMENT 'llave primaria de la tabla citas medicas',
  `Fecha` date NOT NULL,
  `Hora` time NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `idDoctor` int(11) NOT NULL,
  `idCopago` int(11) NOT NULL COMMENT 'Clave foranea que relaciona al clave primaria en la tabla copago'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Información de los datos en la tabla citas medicas';

--
-- Volcado de datos para la tabla `citasmedicas`
--

INSERT INTO `citasmedicas` (`idCitasMedicas`, `Fecha`, `Hora`, `idPaciente`, `idDoctor`, `idCopago`) VALUES
(301, '2022-10-03', '08:30:53', 101, 201, 502),
(302, '2022-10-21', '10:21:53', 102, 202, 505),
(303, '2022-10-15', '10:21:33', 103, 203, 506),
(304, '2022-10-16', '10:20:33', 104, 204, 502),
(305, '2022-10-17', '09:30:59', 105, 205, 506);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `copago`
--

CREATE TABLE `copago` (
  `idCopago` int(11) NOT NULL COMMENT 'llave primaria de la tabla copago',
  `Precio` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Información de los precios a pagar según copago';

--
-- Volcado de datos para la tabla `copago`
--

INSERT INTO `copago` (`idCopago`, `Precio`) VALUES
(502, '3700.00'),
(505, '14700.00'),
(506, '38500.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleformula`
--

CREATE TABLE `detalleformula` (
  `idFormula` int(11) NOT NULL COMMENT 'llave primaria que relaciona con el id de la formula',
  `idMedicamento` int(11) NOT NULL COMMENT 'llave primaria que relaciona con el id del medicameneto',
  `Cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Informacion del detalle de la formula';

--
-- Volcado de datos para la tabla `detalleformula`
--

INSERT INTO `detalleformula` (`idFormula`, `idMedicamento`, `Cantidad`) VALUES
(601, 401, 30),
(602, 402, 20),
(603, 403, 2),
(604, 404, 2),
(605, 405, 20);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `doctor`
--

CREATE TABLE `doctor` (
  `idDoctor` int(11) NOT NULL COMMENT 'Llave primaria de la tabla Doctor',
  `NombreDoctor` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `ApellidoDoctor1` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `ApellidoDoctor2` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `EdadDoctor` int(3) NOT NULL,
  `Correo` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `idEspecializacion` int(11) NOT NULL,
  `Telefono` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Información de la tabla doctor';

--
-- Volcado de datos para la tabla `doctor`
--

INSERT INTO `doctor` (`idDoctor`, `NombreDoctor`, `ApellidoDoctor1`, `ApellidoDoctor2`, `EdadDoctor`, `Correo`, `idEspecializacion`, `Telefono`) VALUES
(201, 'Rogelio', 'Marin', 'Gomez', 45, 'Rogelio@gmail.com', 501, 324156595),
(202, 'Ana', 'Pulgarin', 'Lopez', 30, 'AnaL@gamil.com', 504, 325694235),
(203, 'Pedro', 'Perez', 'Perea', 26, 'Pprerea@gmail.com', 502, 695824361),
(204, 'Piedad', 'Gutierrez', 'Rengifo', 35, 'PGutierrez@gmail.com', 501, 825436915),
(205, 'Lorenzo', 'Beltran', 'Martinez', 45, 'Bmartinez@gmail.com', 502, 469723556);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especialidad`
--

CREATE TABLE `especialidad` (
  `idEspecializacion` int(11) NOT NULL COMMENT 'llave primaria de la tabla especializacion',
  `NombreEspecializacion` varchar(50) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Información de la tabla specializacion';

--
-- Volcado de datos para la tabla `especialidad`
--

INSERT INTO `especialidad` (`idEspecializacion`, `NombreEspecializacion`) VALUES
(501, 'Medico General'),
(502, 'Cirujano'),
(503, 'Urologo'),
(504, 'Terapeuta'),
(505, 'Dermatologo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `formula`
--

CREATE TABLE `formula` (
  `idFormula` int(11) NOT NULL COMMENT 'Llave primaria de la tabla formula',
  `Fecha` date NOT NULL,
  `Hora` time NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `idDoctor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Información de la tabla formula';

--
-- Volcado de datos para la tabla `formula`
--

INSERT INTO `formula` (`idFormula`, `Fecha`, `Hora`, `idPaciente`, `idDoctor`) VALUES
(601, '2022-10-03', '08:50:17', 101, 201),
(602, '2022-09-21', '09:05:05', 102, 202),
(603, '2022-10-15', '10:50:05', 103, 201),
(604, '2022-10-16', '10:55:50', 104, 204),
(605, '2022-10-17', '09:50:50', 105, 205);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicamentos`
--

CREATE TABLE `medicamentos` (
  `idMedicamento` int(11) NOT NULL COMMENT 'Llave primaria de la tabla medicamentos',
  `NombreMedicamento` varchar(50) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Información de la tabla medicamentos';

--
-- Volcado de datos para la tabla `medicamentos`
--

INSERT INTO `medicamentos` (`idMedicamento`, `NombreMedicamento`) VALUES
(401, 'Dolex'),
(402, 'Acetaminofen'),
(403, 'Amoxicilina'),
(404, 'Metrodinazol'),
(405, 'Ibuprofeno');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE `pacientes` (
  `idPaciente` int(11) NOT NULL COMMENT 'Llave primaria de la tabla pacientes',
  `NombrePaciente` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `ApellidoPaciente1` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish2_ci NOT NULL,
  `ApellidoPaciente2` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `Edad` int(3) NOT NULL,
  `Genero` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `Telefono` int(10) NOT NULL,
  `Direccion` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `Correo` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `Eps` varchar(40) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci COMMENT='Información sobre los datos de la tabla paciente';

--
-- Volcado de datos para la tabla `pacientes`
--

INSERT INTO `pacientes` (`idPaciente`, `NombrePaciente`, `ApellidoPaciente1`, `ApellidoPaciente2`, `Edad`, `Genero`, `Telefono`, `Direccion`, `Correo`, `Eps`) VALUES
(101, 'Gabriel', 'Montoya', 'Aristizabal', 35, 'M', 314215462, 'cll 35 cr 45', 'montoya@gmail.com', 'sura'),
(102, 'Maria', 'Vega ', 'Montez', 21, 'F', 314325366, 'cll 46 cl 32B', 'mariaV@gmail.com', 'Coomeva'),
(103, 'Fernando ', 'Diaz', 'Monsalve', 19, 'M', 322166859, 'CR 52 CL 32C', 'FernandoDiaz@gmail.com', 'Susalud'),
(104, 'Liliana', 'Cordoba', 'Galvis', 50, 'F', 421136256, 'CR 53 cl 33B', 'Lcordoba@gmail.com', 'Sura'),
(105, 'Alejandro ', 'Gutierrez', 'Pinzon', 15, 'F', 311530652, 'CR 31 CL 19A', 'AGutierrez@gmail.com', 'Nueva EPS');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citasmedicas`
--
ALTER TABLE `citasmedicas`
  ADD PRIMARY KEY (`idCitasMedicas`),
  ADD KEY `idPaciente` (`idPaciente`),
  ADD KEY `idDoctor` (`idDoctor`),
  ADD KEY `idPaciente_2` (`idPaciente`),
  ADD KEY `CitaMedicaCopago` (`idCopago`);

--
-- Indices de la tabla `copago`
--
ALTER TABLE `copago`
  ADD PRIMARY KEY (`idCopago`);

--
-- Indices de la tabla `detalleformula`
--
ALTER TABLE `detalleformula`
  ADD PRIMARY KEY (`idFormula`,`idMedicamento`),
  ADD KEY `idMedicamento` (`idMedicamento`);

--
-- Indices de la tabla `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`idDoctor`),
  ADD KEY `idEspecializacion` (`idEspecializacion`);

--
-- Indices de la tabla `especialidad`
--
ALTER TABLE `especialidad`
  ADD PRIMARY KEY (`idEspecializacion`);

--
-- Indices de la tabla `formula`
--
ALTER TABLE `formula`
  ADD PRIMARY KEY (`idFormula`),
  ADD KEY `idDoctor` (`idDoctor`),
  ADD KEY `idPaciente` (`idPaciente`);

--
-- Indices de la tabla `medicamentos`
--
ALTER TABLE `medicamentos`
  ADD PRIMARY KEY (`idMedicamento`);

--
-- Indices de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  ADD PRIMARY KEY (`idPaciente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `citasmedicas`
--
ALTER TABLE `citasmedicas`
  MODIFY `idCitasMedicas` int(11) NOT NULL AUTO_INCREMENT COMMENT 'llave primaria de la tabla citas medicas', AUTO_INCREMENT=306;

--
-- AUTO_INCREMENT de la tabla `copago`
--
ALTER TABLE `copago`
  MODIFY `idCopago` int(11) NOT NULL AUTO_INCREMENT COMMENT 'llave primaria de la tabla copago', AUTO_INCREMENT=507;

--
-- AUTO_INCREMENT de la tabla `doctor`
--
ALTER TABLE `doctor`
  MODIFY `idDoctor` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Llave primaria de la tabla Doctor', AUTO_INCREMENT=206;

--
-- AUTO_INCREMENT de la tabla `especialidad`
--
ALTER TABLE `especialidad`
  MODIFY `idEspecializacion` int(11) NOT NULL AUTO_INCREMENT COMMENT 'llave primaria de la tabla especializacion', AUTO_INCREMENT=506;

--
-- AUTO_INCREMENT de la tabla `formula`
--
ALTER TABLE `formula`
  MODIFY `idFormula` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Llave primaria de la tabla formula', AUTO_INCREMENT=606;

--
-- AUTO_INCREMENT de la tabla `medicamentos`
--
ALTER TABLE `medicamentos`
  MODIFY `idMedicamento` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Llave primaria de la tabla medicamentos', AUTO_INCREMENT=406;

--
-- AUTO_INCREMENT de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  MODIFY `idPaciente` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Llave primaria de la tabla pacientes', AUTO_INCREMENT=106;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citasmedicas`
--
ALTER TABLE `citasmedicas`
  ADD CONSTRAINT `CitaMedicaCopago` FOREIGN KEY (`idCopago`) REFERENCES `copago` (`idCopago`),
  ADD CONSTRAINT `CitaMedicaPaciente` FOREIGN KEY (`idPaciente`) REFERENCES `pacientes` (`idPaciente`),
  ADD CONSTRAINT `CitaMedicaidDoctor` FOREIGN KEY (`idDoctor`) REFERENCES `doctor` (`idDoctor`);

--
-- Filtros para la tabla `detalleformula`
--
ALTER TABLE `detalleformula`
  ADD CONSTRAINT `idFormula` FOREIGN KEY (`idFormula`) REFERENCES `formula` (`idFormula`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `idMedicamento` FOREIGN KEY (`idMedicamento`) REFERENCES `medicamentos` (`idMedicamento`);

--
-- Filtros para la tabla `doctor`
--
ALTER TABLE `doctor`
  ADD CONSTRAINT `DoctorEspecializacion` FOREIGN KEY (`idEspecializacion`) REFERENCES `especialidad` (`idEspecializacion`);

--
-- Filtros para la tabla `formula`
--
ALTER TABLE `formula`
  ADD CONSTRAINT `FormulaDoctor` FOREIGN KEY (`idDoctor`) REFERENCES `doctor` (`idDoctor`),
  ADD CONSTRAINT `FormulaPaciente` FOREIGN KEY (`idPaciente`) REFERENCES `pacientes` (`idPaciente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
