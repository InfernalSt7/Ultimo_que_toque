-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-12-2020 a las 03:06:34
-- Versión del servidor: 10.4.13-MariaDB
-- Versión de PHP: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ultimoquetoque`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clasificacion`
--

CREATE TABLE `clasificacion` (
  `id` int(11) NOT NULL,
  `gc` int(11) DEFAULT NULL,
  `gf` int(11) DEFAULT NULL,
  `pe` int(11) DEFAULT NULL,
  `pg` int(11) DEFAULT NULL,
  `pj` int(11) DEFAULT NULL,
  `pp` int(11) DEFAULT NULL,
  `puesto` varchar(255) DEFAULT NULL,
  `puntos` int(11) DEFAULT NULL,
  `id_equipo` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clasificacion`
--

INSERT INTO `clasificacion` (`id`, `gc`, `gf`, `pe`, `pg`, `pj`, `pp`, `puesto`, `puntos`, `id_equipo`) VALUES
(1, 0, 0, 0, 0, 0, 0, '1º', 0, 1),
(2, 0, 0, 0, 0, 0, 0, '2º', 0, 2),
(3, 0, 0, 0, 0, 0, 0, '3º', 0, 3),
(4, 0, 0, 0, 0, 0, 0, '4º', 0, 4),
(5, 0, 0, 0, 0, 0, 0, '5º', 0, 5),
(6, 0, 0, 0, 0, 0, 0, '6º', 0, 6),
(7, 0, 0, 0, 0, 0, 0, '7º', 0, 7),
(8, 0, 0, 0, 0, 0, 0, '8º', 0, 8),
(9, 0, 0, 0, 0, 0, 0, '9º', 0, 9),
(10, 0, 0, 0, 0, 0, 0, '10º', 0, 10),
(11, 0, 0, 0, 0, 0, 0, '11º', 0, 11),
(12, 0, 0, 0, 0, 0, 0, '12º', 0, 12),
(13, 0, 0, 0, 0, 0, 0, '13º', 0, 13),
(14, 0, 0, 0, 0, 0, 0, '14º', 0, 14),
(15, 0, 0, 0, 0, 0, 0, '15º', 0, 15),
(16, 0, 0, 0, 0, 0, 0, '16º', 0, 16),
(17, 0, 0, 0, 0, 0, 0, '17º', 0, 17),
(18, 0, 0, 0, 0, 0, 0, '18º', 0, 18),
(19, 0, 0, 0, 0, 0, 0, '19º', 0, 19),
(20, 0, 0, 0, 0, 0, 0, '20º', 0, 20);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrenador`
--

CREATE TABLE `entrenador` (
  `id_entrenador` int(11) NOT NULL,
  `apellidos` varchar(255) NOT NULL,
  `fecha_nacimiento` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) NOT NULL,
  `pais` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `entrenador`
--

INSERT INTO `entrenador` (`id_entrenador`, `apellidos`, `fecha_nacimiento`, `nombre`, `pais`) VALUES
(1, 'Zidane', '1972-06-23', 'Zinedine', 'Francia'),
(2, 'Koeman', '1963-03-21', 'Ronald', 'Países Bajos'),
(3, 'Simeone', '1970-04-28', 'Diego Pablo', 'Argentina'),
(4, 'Lopetegui', '1966-08-28', 'Julen', 'España'),
(5, 'Alguacil', '1971-07-04', 'Imanol', 'España'),
(6, 'Emery', '1971-11-03', 'Unai', 'España'),
(7, 'Martínez', '1980-10-16', 'Diego', 'España'),
(8, 'Bordalás', '1964-03-05', 'José', 'España'),
(9, 'Gracia', '1970-05-01', 'Javier', 'España'),
(10, 'Arrasate', '1978-04-22', 'Jagoba', 'España'),
(11, 'Garitano', '1975-07-09', 'Gaizka', 'España'),
(12, 'López', '1967-09-19', 'Paco', 'España'),
(13, 'González', '1976-11-10', 'Sergio', 'España'),
(14, 'Mendilibar', '1961-03-14', 'José Luis', 'España'),
(15, 'Pellegrini', '1953-09-16', 'Manuel', 'Chile'),
(16, 'Machín', '1975-04-07', 'Pablo ', 'España'),
(17, 'García', '1973-04-26', 'Óscar', 'España'),
(18, 'Cervera', '1965-09-20', 'Álvaro', 'España'),
(19, 'Rodríguez', '1978-06-17', 'Francisco', 'España'),
(20, 'Almirón', '1971-06-19', 'Jorge', 'Argentina');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `id_equipo` int(11) NOT NULL,
  `estadio` varchar(50) NOT NULL,
  `foto` varchar(255) DEFAULT NULL,
  `nombre` varchar(100) NOT NULL,
  `presidente` varchar(255) DEFAULT NULL,
  `presupuesto` float DEFAULT NULL,
  `titulos` int(11) DEFAULT NULL,
  `entrenador` int(11) DEFAULT NULL,
  `id_liga` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`id_equipo`, `estadio`, `foto`, `nombre`, `presidente`, `presupuesto`, `titulos`, `entrenador`, `id_liga`) VALUES
(1, 'Santiago Bernabeu', 'img/real_madrid.png', 'Real Madrid', 'Florentino Pérez', 822, 92, 1, 1),
(2, 'Camp Nou', 'img/barcelona.png\r\n', 'FC Barcelona', 'Josep Maria Bartomeu', 733, 91, 2, 1),
(3, 'Wanda Metropolitano', 'img/atletico_de_madrid.png\r\n\r\n', 'Atlético de Madrid', 'Enrique Cerezo', 515, 31, 3, 1),
(4, 'Ramón Sánchez Pizjuán', 'img/sevilla.png\r\n\r\n', 'Sevilla FC', 'José Castro Carmona', 215, 32, 4, 1),
(5, 'Reale Arena', 'img/real_sociedad.png\r\n\r\n', 'Real Sociedad', 'Jokin Aperribay', 112, 8, 5, 1),
(6, 'Estadio de la Cerámica', 'img/villarreal.png\r\n\r\n', 'Villarreal ', 'Fernando Roig Alfonso', 113.4, 0, 6, 1),
(7, 'Nuevo los Cármenes', 'img/granada.png\r\n\r\n\r\n\r\n', 'Granada CF', 'Jiang Lizhang', 60, 3, 7, 1),
(8, 'Coliseum Alfonso Pérez', 'img/getafe.png\r\n\r\n\r\n\r\n', 'Getafe CF', 'Ángel Torres', 63.8, 0, 8, 1),
(9, 'Mestalla', 'img/valencia.png\r\n\r\n', 'Valencia CF', 'Peter Lim', 177.1, 22, 9, 1),
(10, 'El Sadar', 'img/osasuna.png\r\n\r\n', 'Osasuna', 'Luis Sabalza', 38.8, 0, 10, 1),
(11, 'Nuevo San Mamés', 'img/athletic.png\r\n\r\n', 'Athletic Club de Bilbao', 'Aitor Elizegi', 103.1, 34, 11, 1),
(12, 'Ciutat de Valencia', 'img/levante.png\r\n\r\n', 'Levante UD', 'Francisco Catalán', 54.6, 2, 12, 1),
(13, 'José Zorrilla', 'img/real_valladolid.png\r\n\r\n', 'Real Valladolid', 'Ronaldo Nazario', 34.9, 3, 13, 1),
(14, 'Estadio Municipal de Ipurúa', 'img/eibar.png\r\n\r\n', 'SD Eibar', 'Amaia Gorostiza Telleria', 47.1, 1, 14, 1),
(15, 'Benito Villamarín', 'img/real_betis.png\r\n\r\n', 'Real Betis Balompié', 'Ángel Haro', 102.4, 10, 15, 1),
(16, 'Estadio de Mendizorroza', 'img/alaves.png\r\n\r\n', 'Deportivo Alavés', 'Alfonso Fernández de Trocóniz', 49.4, 5, 16, 1),
(17, 'Estadio de Balaídos', 'img/celta.png\r\n\r\n', 'Real Club Celta de Vigo', 'Carlos Mouriño', 68.3, 3, 17, 1),
(18, 'Estadio Ramón de Carranza', 'img/cadiz.png\r\n\r\n', 'Cádiz Club de Fútbol', 'Manuel Vizcaíno', 50, 1, 18, 1),
(19, 'Estadio el Alcoraz', 'img/huesca.png\r\n\r\n', 'SD Huesca', 'Agustín Lasaosa', 60, 0, 19, 1),
(20, 'Estadio Manuel Martínez Valero', 'img/elche.png\r\n\r\n', 'Elche CF', 'Joaquín Buitrago Marhuenda', 45, 2, 20, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `juega`
--

CREATE TABLE `juega` (
  `id` int(11) NOT NULL,
  `resultado` varchar(255) DEFAULT NULL,
  `equipo_local` int(11) DEFAULT NULL,
  `equipo_visitante` int(11) DEFAULT NULL,
  `id_partido` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jugador`
--

CREATE TABLE `jugador` (
  `id_jugador` int(11) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `dorsal` int(11) DEFAULT NULL,
  `fecha_nacimiento` varchar(255) DEFAULT NULL,
  `foto` varchar(255) DEFAULT NULL,
  `nombre` varchar(100) NOT NULL,
  `pais` varchar(100) NOT NULL,
  `posicion` varchar(255) DEFAULT NULL,
  `id_equipo` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `jugador`
--

INSERT INTO `jugador` (`id_jugador`, `apellidos`, `dorsal`, `fecha_nacimiento`, `foto`, `nombre`, `pais`, `posicion`, `id_equipo`) VALUES
(1, 'Courtois', 1, '1992-05-11', 'img/courtois.png', 'Thibaut', 'Bélgica', 'Portero', 1),
(2, 'Lunin', 13, '1999-02-11', 'img/lunin.png', 'Andriy', 'Ucrania', 'Portero', 1),
(4, 'Carvajal', 2, '1992-01-11', 'img/carvajal.png', 'Daniel', 'España', 'Lateral Derecho', 1),
(5, 'Militao', 3, '1998-01-18', 'img/militao.png', 'Eder', 'Brasil', 'Defensa Central', 1),
(6, 'Ramos', 4, '1986-03-30', 'img/ramos.png', 'Sergio ', 'España', 'Defensa Central', 1),
(7, 'Varane', 5, '1993-04-25', 'img/varane.png', 'Raphael', 'Francia', 'Defensa Central', 1),
(8, 'Fernández', 6, '1990-01-18', 'img/nacho.png', 'Nacho', 'España', 'Defensa Central', 1),
(9, 'Vieira', 12, '1988-05-12', 'img/marcelo.png', 'Marcelo', 'Brasil', 'Lateral Izquierdo', 1),
(10, 'Odriozola', 19, '1995-12-14', 'img/odriozola.png', 'Álvaro ', 'España', 'Lateral Derecho', 1),
(11, 'Mendy', 23, '1995-06-08', 'img/mendy.png', 'Ferland', 'Francia', 'Lateral Izquierdo', 1),
(12, 'Kroos', 8, '1990-01-04', 'img/kroos.png', 'Toni', 'Alemania', 'Centrocampista', 1),
(13, 'Modric', 10, '1985-09-09', 'img/modric.png', 'Luka', 'Croacia', 'Centrocampista', 1),
(14, 'Casemiro', 14, '1992-02-23', 'img/casemiro.png', 'Carlos Henrique', 'Brasil', 'Mediocentro defensivo', 1),
(15, 'Valverde', 15, '1998-07-22', 'img/valverde.png', 'Federico', 'Uruguay', 'Centrocampista', 1),
(16, 'Odegaard', 21, '1998-12-17', 'img/odegaard.png', 'Martin', 'Noruega', 'Centrocampista', 1),
(17, 'Alarcón', 22, '1992-04-21', 'img/isco.png', 'Francisco', 'España', 'Centrocampista ofensivo', 1),
(18, 'Hazard', 7, '1991-01-07', 'img/hazard.png', 'Eden', 'Bélgica', 'Extremo Izquierdo', 1),
(19, 'Benzema', 9, '1987-12-19', 'img/benzema.png', 'Karim', 'Francia', 'Delantero Centro', 1),
(20, 'Asensio', 11, '1996-01-21', 'img/asensio.png', 'Marco ', 'España', 'Extremo', 1),
(21, 'Vázquez', 17, '1991-07-01', 'img/lucas vazquez.png', 'Lucas', 'España', 'Extremo Derecho', 1),
(22, 'Jovic', 18, '1997-12-23', 'img/jovic.png', 'Luka', 'Serbia', 'Delantero Centro', 1),
(23, 'Paixao de Oliveira Junior', 20, '2000-07-12', 'img/vini.png', 'Vinicius', 'Brasil', 'Extremo Izquierdo', 1),
(24, 'Goes ', 25, '2001-01-09', 'img/rodrygo.png', 'Rodrygo', 'Brasil', 'Extremo Derecho', 1),
(25, 'Díaz Mejía', 24, '1993-08-01', 'img/mariano.png', 'Mariano', 'España', 'Delantero Centro', 1),
(26, 'Ter Stegen', 1, '1992-04-30', 'img/terstegen.png', 'Marc-André ', 'Alemania', 'Portero', 2),
(27, 'Murara Neto', 13, '1989-07-19', 'img/neto.png', 'Norberto', 'Brasil', 'Portero', 2),
(28, 'Dest', 2, '2000-11-03', 'img/dest.png', 'Sergiño', 'Estados Unidos', 'Lateral Derecho', 2),
(29, 'Pique', 3, '1987-02-02', 'img/pique.png', 'Gerard', 'España', 'Defensa Central', 2),
(30, 'Lenglet', 15, '1995-06-17', 'img/lenglet.png', 'Clément', 'Francia', 'Defensa Central', 2),
(31, 'Alba', 18, '1989-03-21', 'img/jordi_alba.png', 'Jordi', 'España', 'Lateral Izquierdo', 2),
(32, 'Roberto', 20, '1992-02-07', 'img/sergi_roberto.png', 'Sergi', 'España', 'Lateral Derecho', 2),
(33, 'Umtiti', 23, '1993-11-14', 'img/umtiti.png', 'Samuel', 'Francia', 'Defensa Central', 2),
(34, 'Firpo', 24, '1996-08-22', 'img/junior.png', 'Junior', 'España', 'Lateral Izquierdo', 2),
(35, 'Busquets', 5, '1988-07-16', 'img/busi.png', 'Sergio', 'España', 'Mediocentro defensivo', 2),
(36, 'Aleñá', 6, '1998-01-05', 'img/aleña.png', 'Carles', 'España', 'Centrocampista', 2),
(37, 'Pjanic', 8, '1990-04-02', 'img/pjanic.png', 'Miralem', 'Bosnia Herzegovina', 'Centrocampista', 2),
(38, 'De Jong', 21, '1997-05-12', 'img/f_dejong.png', 'Frenkie', 'Países Bajos', 'Centrocampista', 2),
(39, 'González', 16, '2002-11-25', 'img/pedri.png', 'Pedro', 'España', 'Centrocampista ofensivo', 2),
(40, 'Coutinho', 14, '1992-06-12', 'img/cou.png', 'Philippe', 'Brasil', 'Centrocampista ofensivo', 2),
(41, 'Griezmann', 7, '1991-03-21', 'img/griezmann.png', 'Antoine', 'Francia', 'Extremo', 2),
(42, 'Messi', 10, '1987-06-24', 'img/messi.png', 'Lionel', 'Argentina', 'Delantero', 2),
(43, 'Dembélé', 11, '1997-05-15', 'img/dembele.png', 'Ousmane', 'Francia', 'Extremo', 2),
(44, 'Braithwaite', 9, '1991-06-05', 'img/braithwaite.png', 'Martin', 'Dinamarca', 'Delantero Centro', 2),
(45, 'Trincao', 17, '1999-12-29', 'img/trincao.png', 'Francisco', 'Portugal', 'Delantero', 2),
(46, 'Fati', 22, '2002-10-31', 'img/ansu.png', 'Anssumane', 'España', 'Extremo Izquierdo', 2),
(47, 'Grbic', 1, '1996-01-18', 'img/grbic.png', 'Ivo', 'Croacia', 'Portero', 3),
(48, 'Oblak', 13, '1993-01-07', 'img/oblak.png', 'Jan', 'Eslovenia', 'Portero', 3),
(49, 'Giménez', 2, '1995-01-20', 'img/gimenez.png', 'José María', 'Uruguay', 'Defensa Central', 3),
(50, 'Sánchez', 3, '2000-08-24', 'img/manu sanchez.png', 'Manuel', 'España', 'Lateral Izquierdo', 3),
(52, 'Lodi', 12, '1998-04-08', 'img/lodi.png', 'Renan', 'Brasil', 'Lateral Izquierdo', 3),
(53, 'Savic', 15, '1991-01-08', 'img/savic.png', 'Stefan', 'Montenegro', 'Defensa Central', 3),
(54, 'Augusto de Almeida Monteiro', 18, '1989-05-16', 'img/felipe.png', 'Felipe', 'Brasil', 'Defensa Central', 3),
(55, 'Hermoso', 22, '1995-06-18', 'img/hermoso.png', 'Mario', 'España', 'Defensa Central', 3),
(56, 'Trippier', 23, '1990-09-19', 'img/trippier.png', 'Kieran', 'Inglaterra', 'Lateral Derecho', 3),
(57, 'Vrsalkjo', 24, '1992-01-10', 'img/vrsalkjo.png', 'Sime ', 'Croacia', 'Lateral Derecho', 3),
(58, 'Torreira', 5, '1996-02-11', 'img/torreira.png', 'Lucas', 'Uruguay', 'Centrocampista', 3),
(59, 'Resurrección', 6, '1992-01-08', 'img/koke.png', 'Jorge', 'España', 'Centrocampista', 3),
(60, 'Ñíguez', 8, '1994-11-21', 'img/saul.png', 'Saúl', 'España', 'Centrocampista', 3),
(61, 'Lemar', 11, '1995-11-12', 'img/lemar.png', 'Thomas', 'Francia', 'Extremo Izquierdo', 3),
(62, 'Llorente', 14, '1995-01-30', 'img/llorente.png', 'Marcos', 'España', 'Centrocampista', 3),
(63, 'Machín', 20, '1989-11-02', 'img/vitolo.png', 'Víctor', 'España', 'Extremo Derecho', 3),
(64, 'Ferreira Carrasco', 21, '1993-09-04', 'img/carrasco.png', 'Yannick', 'Bélgica', 'Extremo Izquierdo', 3),
(65, 'Félix', 7, '1999-11-10', 'img/joao felix.png', 'Joao', 'Portugal', 'Delantero', 3),
(66, 'Suárez', 9, '1987-01-24', 'img/suarez.png', 'Luis', 'Uruguay', 'Delantero Centro', 3),
(67, 'Correa', 10, '1995-03-09', 'img/correa.png', 'Ángel ', 'Argentina', 'Extremo Derecho', 3),
(68, 'Saponjic', 17, '1997-08-02', 'img/saponjic.png', 'Iván', 'Serbia', 'Delantero Centro', 3),
(69, 'Costa', 19, '1988-10-07', 'img/dcosta.png', 'Diego', 'España', 'Delantero Centro', 3),
(70, 'Araújo', 4, '1999-03-07', 'img/araujo.png', 'Ronald', 'Uruguay', 'Defensa', 2),
(71, 'Puig', 12, '1999-08-13', 'img/puig.png', 'Riqui', 'España', 'Centrocampista', 2),
(72, 'Fernandes', 19, '1998-06-30', 'img/matheus.png', 'Matheus', 'Brasil', 'Centrocampista', 2),
(73, 'Herrera', 16, '1990-04-19', 'img/herrera.png', 'Héctor', 'México', 'Centrocampista', 3),
(74, 'Vaclík', 1, '1989-03-29', 'img/vaclik.png', 'Tomás', 'República Checa', 'Portero', 4),
(75, 'Bounou', 13, '1991-04-05', 'img/bono.png', 'Yassine', 'Marruecos', 'Portero', 4),
(76, 'Escudero', 18, '1989-09-02', 'img/escudero.png', 'Sergio', 'España', 'Lateral Izquierdo', 4),
(77, 'Navas', 16, '1985-11-21', 'img/navas.png', 'Jesús ', 'España', 'Lateral Derecho', 4),
(78, 'Gómez', 3, '1992-03-28', 'img/sergi_gomez.png', 'Sergi', 'España', 'Defensa Central', 4),
(79, 'Carlos', 20, '1993-03-15', 'img/diego_carlos.png', 'Diego', 'Brasil', 'Defensa Central', 4),
(80, 'Koundé', 12, '1998-11-12', 'img/kounde.png', 'Jules', 'Francia', 'Defensa Central', 4),
(81, 'Acuña', 19, '1991-10-28', 'img/acuña.png', 'Marcos', 'Argentina', 'Lateral Izquierdo', 4),
(82, 'Vázquez', 22, '1989-02-22', 'img/franco.png', 'Franco', 'Argentina', 'Centrocampista', 4),
(83, 'Rakitic', 10, '1988-03-10', 'img/rakitic.png', 'Iván', 'Croacia', 'Centrocampista', 4),
(84, 'Jordán', 8, '1994-07-06', 'img/jordan.png', 'Joan', 'España', 'Centrocampista', 4),
(85, 'Ocampos', 5, '1994-07-11', 'img/ocampos.png', 'Lucas', 'Argentina', 'Extremo', 4),
(86, 'Torres', 21, '1994-11-10', 'img/oliver.png', 'Óliver', 'España', 'Centrocampista Ofensivo', 4),
(87, 'Reges', 25, '1987-07-25', 'img/fernando.png', 'Fernando', 'Brasil', 'Centrocampista Defensivo', 4),
(88, 'Gudelj', 6, '1991-11-16', 'img/gudelj.png', 'Nemanja', 'Serbia', 'Centrocampista ', 4),
(89, 'Fernández', 7, '1993-11-19', 'img/suso.png', 'Jesús', 'España', 'Centrocampista Ofensivo', 4),
(90, 'Rodríguez', 14, '1998-06-28', 'img/oscar.png', 'Óscar ', 'España', 'Centrocampista Ofensivo', 4),
(91, 'Rekik', 4, '1994-12-02', 'img/rekik.png', 'Karim', 'Países Bajos', 'Defensa Central', 4),
(92, 'El Haddadi', 11, '1995-09-01', 'img/munir.png', 'Munir', 'España', 'Delantero', 4),
(93, 'De Jong', 9, '1990-08-27', 'img/l_dejong.png', 'Luuk', 'Países Bajos', 'Delantero', 4),
(94, 'En-Nesyri', 15, '1997-06-01', 'img/en nesyri.png', 'Youssef', 'Marruecos', 'Delantero', 4),
(95, 'Fernández', 24, '1996-05-22', 'img/carlos_fernandez.png', 'Carlos', 'España', 'Delantero', 4),
(96, 'Idrissi', 23, '1996-02-26', 'img/idrissi.png', 'Oussama', 'Marruecos', 'Extremo', 4),
(97, 'Asenjo', 1, '1989-06-28', 'img/asenjo.png', 'Sergio', 'España', 'Portero', 6),
(98, 'Gaspar', 2, '1990-11-24', 'img/gaspar.png', 'Mario', 'España', 'Lateral Derecho', 6),
(99, 'Albiol', 3, '1985-09-04', 'img/albiol.png', 'Raúl', 'España', 'Defensa Central', 6),
(100, 'Torres', 4, '1997-01-16', 'img/pau.png', 'Pau', 'España', 'Defensa Central', 6),
(101, 'Parejo', 5, '1989-04-16', 'img/parejo.png', 'Daniel', 'España', 'Centrocampista', 6),
(102, 'Funes Mori', 6, '1991-03-05', 'img/funes mori.png', 'Ramiro', 'Argentina', 'Defensa Central', 6),
(103, 'Moreno', 7, '1992-04-07', 'img/gerard_moreno.png', 'Gerard', 'España', 'Extremo Derecho', 6),
(104, 'Foyth', 8, '1998-01-12', 'img/foyth.png', 'Juan', 'Argentina', 'Defensa Central', 6),
(105, 'Bacca', 9, '1986-09-08', 'img/bacca.png', 'Carlos', 'Colombia', 'Delantero Centro', 6),
(106, 'Iborra', 10, '1988-01-16', 'img/iborra.png', 'Vicente', 'España', 'Centrocampista', 6),
(107, 'Chukwueze', 11, '1999-05-22', 'img/chukwueze.png', 'Samuel', 'Nigeria', 'Extremo', 6),
(108, 'Raba', 12, '1995-10-29', 'img/raba.png', 'Daniel', 'España', 'Centrocampista', 6),
(109, 'Rulli', 13, '1992-05-20', 'img/rulli.png', 'Gerónimo', 'Argentina', 'Portero', 6),
(110, 'Trigueros', 14, '1991-10-17', 'img/trigueros.png', 'Manuel', 'España', 'Centrocampista', 6),
(111, 'Estupiñán', 15, '1998-01-21', 'img/pervis.png', 'Pervis', 'Ecuador', 'Lateral Izquierdo', 6),
(112, 'Kubo', 16, '2001-06-04', 'img/kubo.png', 'Takefusa', 'Japón', 'Centrocampista', 6),
(113, 'Alcácer', 17, '1993-08-30', 'img/alcacer.png', 'Paco', 'España', 'Delantero Centro', 6),
(114, 'Moreno', 18, '1992-07-05', 'img/alberto_moreno.png', 'Alberto', 'España', 'Lateral Izquierdo', 6),
(115, 'Coquelin', 19, '1991-05-13', 'img/coquelin.png', 'Francis', 'Francia', 'Centrocampista', 6),
(116, 'Peña', 20, '1991-07-18', 'img/ruben peña.png', 'Rubén', 'España', 'Lateral Derecho', 6),
(117, 'Costa', 21, '1988-03-18', 'img/jaume_costa.png', 'Jaume', 'España', 'Lateral Izquierdo', 6),
(118, 'Chakla', 22, '1993-09-02', 'img/chakla.png', 'Sofian', 'Marruecos', 'Defensa Central', 6),
(119, 'Gómez', 23, '1994-06-23', 'img/moi gomez.png', 'Moisés', 'España', 'Centrocampista', 6),
(120, 'Pedraza', 24, '1996-04-09', 'img/pedraza.png', 'Alfonso', 'España', 'Centrocampista', 6),
(123, 'Remiro', 1, '1995-03-24', 'img/remiro.png', 'Alejandro', 'España', 'Portero', 5),
(124, 'Moyá', 13, '1984-04-02', 'img/moya.png', 'Miguel Ángel', 'España', 'Portero', 5),
(125, 'Zaldua', 2, '1992-06-24', 'img/zaldua.png', 'Joseba', 'España', 'Lateral Derecho', 5),
(126, 'Elustondo', 6, '1994-03-28', 'img/aritz.png', 'Aritz', 'España', 'Defensa Central', 5),
(127, 'Muñoz', 12, '1997-08-16', 'img/aihen.png', 'Aihen', 'España', 'Lateral Izquierdo', 5),
(128, 'Saignan', 15, '1999-04-14', 'img/sagnan.png', 'Modibo', 'Francia', 'Defensa Central', 5),
(129, 'Gorosabel', 18, '1996-08-04', 'img/gorosabel.png', 'Andoni', 'España', 'Lateral Derecho', 5),
(130, 'Monreal', 20, '1986-02-26', 'img/monreal.png', 'Ignacio', 'España', 'Lateral Izquierdo', 5),
(131, 'Le Normand', 24, '1996-11-11', 'img/le normand.png', 'Robin', 'Francia', 'Defensa Central', 5),
(132, 'Illarramendi', 4, '1990-03-08', 'img/illarra.png', 'Asier', 'España', 'Centrocampista', 5),
(133, 'Zubeldia', 5, '1997-03-30', 'img/zubeldia.png', 'Igor', 'España', 'Centrocampista', 5),
(134, 'Merino', 8, '1996-06-22', 'img/merino.png', 'Mikel', 'España', 'Centrocampista', 5),
(135, 'Guridi', 14, '1995-02-28', 'img/guridi.png', 'Jon', 'España', 'Centrocampista', 5),
(136, 'Guevara', 16, '1997-07-07', 'img/guevara.png', 'Ander', 'España', 'Centrocampista', 5),
(137, 'Silva', 21, '1986-01-08', 'img/silva.png', 'David', 'España', 'Centrocampista Ofensivo', 5),
(138, 'Sangalli', 23, '1995-02-10', 'img/sangalli.png', 'Luca', 'España', 'Centrocampista', 5),
(139, 'José', 9, '1991-11-23', 'img/willianJose.png', 'Willian', 'Brasil', 'Delantero Centro', 5),
(140, 'Oyarzabal', 10, '1997-04-21', 'img/oyarzabal.png', 'Mikel', 'España', 'Extremo', 5),
(141, 'Januzaj', 11, '1995-02-05', 'img/januzaj.png', 'Adnan', 'Bélgica', 'Extremo', 5),
(142, 'Bautista', 25, '1995-07-03', 'img/bautista.png', 'Jon', 'España', 'Delantero Centro', 5),
(143, 'Portugués', 7, '1992-05-21', 'img/portu.png', 'Cristian', 'España', 'Extremo Derecho', 5),
(144, 'Isak', 19, '1999-09-21', 'img/isak.png', 'Aleksander', 'Suecia', 'Delantero Centro', 5),
(145, 'Merquelanz', 17, '1995-06-12', 'img/merquelanz.png', 'Martin', 'España', 'Extremo Izquierdo', 5),
(146, 'Barrenetxea', 22, '2001-12-27', 'img/barrenetxea.png', 'Ander', 'España', 'Delantero', 5),
(147, 'Silva', 1, '1994-02-07', 'img/ruisilva.png', 'Rui', 'Portugal', 'Portero', 7),
(148, 'Escandell', 13, '1995-09-27', 'img/aaron.png', 'Aarón', 'España', 'Portero', 7),
(149, 'Foulquier', 2, '1993-03-23', 'img/foulquier.png', 'Dimitri', 'Francia', 'Lateral Derecho', 7),
(150, 'Sánchez', 6, '1986-12-12', 'img/german.png', 'Germán', 'España', 'Defensa Central', 7),
(151, 'Neva', 15, '1996-06-12', 'img/neva.png', 'Carlos', 'España', 'Lateral Derecho', 7),
(152, 'Díaz', 16, '1988-06-12', 'img/victordiaz.png', 'Víctor', 'España', 'Lateral Izquierdo', 7),
(153, 'Marín', 17, '1989-09-24', 'img/quini.png', 'José Joaquín', 'España', 'Lateral Derecho', 7),
(154, 'Lozano', 18, '1994-03-04', 'img/neyder.png', 'Neyder', 'Colombia', 'Lateral Izquierdo', 7),
(155, 'Vallejo', 20, '1997-01-05', 'img/vallejo.png', 'Jesús ', 'España', 'Defensa Central', 7),
(156, 'Duarte', 22, '1995-03-19', 'img/duarte.png', 'Domingos ', 'Portugal', 'Defensa Central', 7),
(157, 'Gonalons', 4, '1989-03-10', 'img/gonalons.png', 'Maxime', 'Francia', 'Centrocampista', 7),
(158, 'Milla', 5, '1994-10-07', 'img/milla.png', 'Luis', 'España', 'Centrocampista', 7),
(159, 'Eteki', 8, '1997-08-26', 'img/eteki.png', 'Yan Brice', 'Camerún', 'Centrocampista', 7),
(160, 'Azeez', 12, '1992-12-12', 'img/azeez.png', 'Ramón', 'Nigeria', 'Centrocampista', 7),
(161, 'Montoro', 19, '1988-06-25', 'img/montoro.png', 'Ángel ', 'España', 'Centrocampista Ofensiva', 7),
(162, 'Herrera', 21, '1998-01-07', 'img/yangel.png', 'Yángel', 'Venezuela', 'Centrocampista', 7),
(163, 'Suárez', 7, '1997-12-02', 'img/luissuarez.png', 'Luis', 'Colombia', 'Delantero Centro', 7),
(164, 'Soldado', 9, '1985-05-27', 'img/soldado.png', 'Roberto', 'España', 'Delantero Centro', 7),
(165, 'Puertas', 10, '1992-02-21', 'img/puertas.png', 'Antonio', 'España', 'Centrocampista', 7),
(166, 'Machís', 11, '1993-02-07', 'img/darwin.png', 'Darwin', 'Venezuela', 'Extremo Izquierdo', 7),
(167, 'Vico', 14, '1994-07-04', 'img/fede_vico.png', 'Federico', 'España', 'Centrocampista Ofensivo', 7),
(168, 'Molina', 23, '1982-04-22', 'img/jorge_molina.png', 'Jorge', 'España', 'Delantero Centro', 7),
(169, 'Kenedy', 24, '1996-02-08', 'img/kenedy.png', 'Robert', 'Brasil', 'Extremo Izquierdo', 7),
(170, 'Chichizola', 25, '1990-03-27', 'img/chichizola.png', 'Leandro', 'Argentina', 'Portero', 8),
(171, 'Soria', 13, '1993-04-04', 'img/soria.png', 'David', 'España', 'Portero', 8),
(172, 'Yáñez', 1, '1993-10-12', 'img/yañez.png', 'Rubén', 'España', 'Portero', 8),
(173, 'Olivera', 17, '1997-10-31', 'img/olivera.png', 'Mathías ', 'Uruguay', 'Lateral Izquierdo', 8),
(174, 'Cucurella', 15, '1998-07-22', 'img/cucurella.png', 'Marc', 'España', 'Centrocampista', 8),
(175, 'Nyom', 12, '1988-05-10', 'img/nyom.png', 'Allan', 'Camerún', 'Lateral Derecho', 8),
(176, 'Etxeita', 4, '1987-10-31', 'img/etxeita.png', 'Xabier', 'España', 'Defensa Central', 8),
(177, 'Rodríguez', 6, '1992-03-03', 'img/chema.png', 'Jose Manuel', 'España', 'Defensa Central', 8),
(178, 'Cabaco', 3, '1995-04-19', 'img/cabaco.png', 'Erick', 'Uruguay', 'Defensa Central', 8),
(179, 'Dakonam', 2, '1991-12-31', 'img/djene.png', 'Djené', 'Togo', 'Defensa Central', 8),
(180, 'Suárez', 22, '1988-04-27', 'img/damian.png', 'Damián', 'Uruguay', 'Lateral Derecho', 8),
(181, 'Arambarri', 18, '1995-09-30', 'img/arambarri.png', 'Mauro', 'Uruguay', 'Centrocampista', 8),
(182, 'Maksimovic', 20, '1995-01-26', 'img/maksi.png', 'Nemanja', 'Serbia', 'Centrocampista', 8),
(183, 'Portillo', 8, '1990-06-13', 'img/portillo.png', 'Francisco', 'España', 'Centrocampista', 8),
(184, 'Timor', 24, '1989-10-17', 'img/timor.png', 'David', 'España', 'Centrocampista', 8),
(185, 'Diaby', 21, '1991-05-21', 'img/diaby.png', 'Abodoulay', 'Francia', 'Centrocampista', 8),
(186, 'Palaversa', 14, '2000-04-06', 'img/palaversa.png', 'Ante', 'Croacia', 'Centrocampista', 8),
(187, 'Poveda', 19, '1997-02-14', 'img/poveda.png', 'Darío', 'España', 'Delantero', 8),
(188, 'Unal', 10, '1997-05-10', 'img/unal.png', 'Enes', 'Turquía', 'Delantero Centro', 8),
(189, 'Hernández', 23, '1999-04-20', 'img/cucho.png', 'Juan Camilo', 'Colombia', 'Delantero Centro', 8),
(190, 'Mata', 7, '1988-10-24', 'img/mata.png', 'Jaime', 'España', 'Delantero Centro', 8),
(191, 'Rodríguez', 9, '1987-04-26', 'img/angel.png', 'Ángel', 'España', 'Delantero Centro', 8),
(192, 'Domenech', 1, '1990-11-05', 'img/jaume.png', 'Jaume', 'España', 'Portero', 9),
(193, 'Cillessen', 13, '1989-04-22', 'img/cillessen.png', 'Jasper', 'Países Bajos', 'Portero', 9),
(194, 'Rivero', 25, '1998-03-21', 'img/rivero.png', 'Cristian ', 'España', 'Portero', 9),
(195, 'Correia', 2, '1999-03-09', 'img/thierry.png', 'Thierry', 'Portugal', 'Lateral Derecho', 9),
(196, 'Lato', 3, '1997-11-21', 'img/lato.png', 'Antonio', 'España', 'Lateral Izquierdo', 9),
(197, 'Mangala', 4, '1991-02-13', 'img/mangala.png', 'Eliaquim', 'Francia', 'Defensa Central', 9),
(198, 'Paulista', 5, '1990-11-26', 'img/paulista.png', 'Gabriel', 'Brasil', 'Defensa Central', 9),
(199, 'Diakhaby', 12, '1996-12-19', 'img/diakhaby.png', 'Mouctar', 'Francia', 'Defensa Central', 9),
(200, 'Gayà', 14, '1995-05-25', 'img/gaya.png', 'Jose Luis', 'España', 'Lateral Izquierdo', 9),
(201, 'Guillamón', 15, '2000-01-31', 'img/guillamon.png', 'Hugo', 'España', 'Defensa Central', 9),
(202, 'Kondogbia', 4, '1993-02-15', 'img/kondogbia.png', 'Geoffrey', 'República Centroafricana', 'Centrocampista', 3),
(203, 'Guedes', 7, '1996-11-29', 'img/guedes.png', 'Gonçalo', 'Portugal', 'Extremo Izquierdo', 9),
(204, 'Soler', 8, '1997-01-02', 'img/soler.png', 'Carlos', 'España', 'Centrocampista', 9),
(205, 'Wass', 18, '1989-05-31', 'img/wass.png', 'Daniel', 'Dinamarca', 'Lateral Derecho', 9),
(206, 'Racic', 19, '1998-03-17', 'img/racic.png', 'Uros', 'Serbia', 'Centrocampista', 9),
(207, 'Kang-In', 20, '2001-02-19', 'img/kangin.png', 'Lee', 'Corea del Sur', 'Centrocampista', 9),
(208, 'Gameiro', 9, '1987-05-09', 'img/gameiro.png', 'Kevin', 'Francia', 'Delantero Centro', 9),
(209, 'Sobrino', 11, '1992-06-01', 'img/sobrino.png', 'Rubén', 'España', 'Delantero Centro', 9),
(210, 'Cheryshev', 17, '1990-12-26', 'img/cheryshev.png', 'Denis', 'Rusia', 'Extremo', 9),
(211, 'Vallejo', 21, '1997-02-14', 'img/manuvallejo.png', 'Manu', 'España', 'Delantero Centro', 9),
(212, 'Gómez', 22, '1996-08-14', 'img/maxigomez.png', 'Maximiliano', 'Uruguay', 'Delantero Centro', 9),
(213, 'Remeseiro', 23, '1994-07-06', 'img/jason.png', 'David', 'España', 'Delantero Centro', 9),
(214, 'Simón', 1, '1997-06-11', 'img/unaisimon.png', 'Unai', 'España', 'Portero', 11),
(215, 'Ezkieta', 13, '1996-08-17', 'img/ezkieta.png', 'Jokin', 'España', 'Portero', 11),
(216, 'Herrerín', 25, '1988-01-25', 'img/herrerin.png', 'Iago', 'España', 'Portero', 11),
(217, 'Núñez', 3, '1997-01-30', 'img/unai_nuñez.png', 'Unai', 'España', 'Defensa Central', 11),
(218, 'Martínez', 4, '1991-05-17', 'img/iñigomartinez.png', 'Iñigo', 'España', 'Defensa Central', 11),
(219, 'Álvarez', 5, '1995-01-24', 'img/yeray.png', 'Yeray', 'España', 'Defensa Central', 11),
(220, 'Lekue', 15, '1993-05-04', 'img/lekue.png', 'Iñigo', 'España', 'Lateral Derecho', 11),
(221, 'Berchiche', 17, '1990-02-10', 'img/yuri.png', 'Yuri', 'España', 'Lateral Izquierdo', 11),
(222, 'De Marcos', 18, '1989-04-14', 'img/demarcos.png', 'Óscar', 'España', 'Lateral Derecho', 11),
(223, 'Capa', 21, '1992-02-08', 'img/capa.png', 'Ander', 'España', 'Lateral Derecho', 11),
(224, 'Nolaskoain', 23, '1998-10-25', 'img/nolaskoain.png', 'Peru', 'España', 'Defensa Central', 11),
(225, 'Balenziaga', 24, '1988-02-29', 'img/balenziaga.png', 'Mikel', 'España', 'Lateral Izquierdo', 11),
(226, 'Vesga', 6, '1993-04-08', 'img/vesga.png', 'Mikel', 'España', 'Centrocampista', 11),
(227, 'Gómez', 7, '1989-11-11', 'img/ibai.png', 'Ibai', 'España', 'Extremo', 11),
(228, 'López', 8, '1995-10-30', 'img/unailopez.png', 'Unai', 'España', 'Centrocampista', 11),
(229, 'Muniain', 10, '1992-12-19', 'img/muniain.png', 'Iker', 'España', 'Centrocampista Ofensivo', 11),
(230, 'Córdoba', 11, '1997-03-13', 'img/cordoba.png', 'Iñigo', 'España', 'Centrocampista Ofensivo', 11),
(231, 'García', 14, '1990-05-24', 'img/dani_garcia.png', 'Daniel', 'España', 'Centrocampista', 11),
(232, 'Sancet', 16, '2000-04-25', 'img/sancet.png', 'Oihan', 'España', 'Centrocampista Ofensivo', 11),
(233, 'Morcillo', 2, '1998-09-15', 'img/morcillo.png', 'Jon', 'España', 'Delantero', 11),
(234, 'Williams', 9, '1994-06-15', 'img/williams.png', 'Iñaki', 'España', 'Delantero Centro', 11),
(235, 'Berenguer', 12, '1995-07-04', 'img/berenguer.png', 'Alejandro', 'España', 'Delantero', 11),
(236, 'Kodro', 19, '1993-08-19', 'img/kodro.png', 'Kenan', 'España', 'Delantero', 11),
(237, 'Villalibre', 20, '1997-09-30', 'img/villalibre.png', 'Asier', 'España', 'Delantero', 11),
(238, 'García', 22, '1986-07-11', 'img/raulgarcia.png', 'Raúl', 'España', 'Delantero', 11),
(239, 'Herrera', 1, '1993-06-05', 'img/sergio_herrera.png', 'Sergio', 'España', 'Portero', 10),
(240, 'Martínez', 13, '1984-06-22', 'img/ruben.png', 'Rubén', 'España', 'Portero', 10),
(241, 'Pérez', 25, '1996-07-15', 'img/juan_perez.png', 'Juan', 'España', 'Portero', 10),
(242, 'Vidal', 2, '1995-01-24', 'img/nacho_vidal.png', 'Nacho', 'España', 'Lateral Derecho', 10),
(243, 'García', 4, '1992-02-03', 'img/unai_garcia.png', 'Unai', 'España', 'Defensa Central', 10),
(244, 'García', 5, '1994-02-14', 'img/david_garcia.png', 'David', 'España', 'Defensa Central', 10),
(245, 'Roncaglia', 12, '1987-02-10', 'img/roncaglia.png', 'Facundo', 'Argentina', 'Defensa Central', 10),
(246, 'Navas', 22, '1988-05-11', 'img/raul_navas.png', 'Raúl', 'España', 'Defensa Central', 10),
(247, 'Hernández', 23, '1989-03-23', 'img/aridane.png', 'Aridane', 'España', 'Defensa Central', 10),
(248, 'Sanjurjo', 6, '1986-05-25', 'img/oier.png', 'Oier', 'España', 'Centrocampista', 10),
(249, 'Rodríguez', 7, '1991-07-09', 'img/jony.png', 'Jonathan', 'España', 'Centrocampista Ofensivo', 10),
(250, 'Brasanac', 8, '1992-02-12', 'img/brasanac.png', 'Darko', 'Serbia', 'Centrocampista', 10),
(251, 'Torres', 10, '1989-03-07', 'img/rtorres.png', 'Roberto', 'España', 'Centrocampista Ofensivo', 10),
(252, 'Barja', 11, '1997-04-01', 'img/barja.png', 'Enrique', 'España', 'Centrocampista Ofensivo', 10),
(253, 'García', 14, '1993-07-14', 'img/ruben_garcia.png', 'Rubén', 'España', 'Centrocampista Ofensivo', 10),
(254, 'Pérez', 21, '1988-01-18', 'img/iñigo_perez.png', 'Íñigo', 'España', 'Centrocampista Ofensivo', 10),
(255, 'Ávila', 9, '1994-02-06', 'img/chimy.png', 'Luis Ezequiel', 'Argentina', 'Delantero Centro', 10),
(256, 'López', 20, '1988-01-08', 'img/adrian.png', 'Adrián', 'España', 'Delantero Centro', 10),
(257, 'Gallego', 19, '1986-09-12', 'img/enric.png', 'Enric', 'España', 'Delantero Centro', 10),
(258, 'Torró', 24, '1994-07-19', 'img/torro.png', 'Lucas', 'España', 'Centrocampista', 10),
(259, 'Calleri', 16, '1993-09-23', 'img/calleri.png', 'Jonathan', 'Argentina', 'Delantero Centro', 10),
(260, 'Budimir', 17, '1991-07-22', 'img/budimir.png', 'Ante', 'Croacia', 'Delantero Centro', 10),
(261, 'Cruz', 3, '1992-07-28', 'img/juancruz.png', 'Juan', 'España', 'Lateral Izquierdo', 10),
(262, 'Fernández', 13, '1991-05-03', 'img/aitor.png', 'Aitor', 'España', 'Portero', 12),
(263, 'Ruiz', 1, '1995-09-27', 'img/vegas.png', 'Jorge', 'España', 'Portero', 12),
(264, 'Hidalgo', 2, '1994-03-30', 'img/son.png', 'Francisco Javier', 'España', 'Centrocampista', 12),
(265, 'García', 3, '1989-11-07', 'img/toño.png', 'Antonio', 'España', 'Lateral Izquierdo', 12),
(287, 'Suárez Pier', 4, '1995-02-16', 'img/pier.png', 'Róber', 'España', 'Defensa Central', 12),
(288, 'Radoja', 5, '1993-02-06', 'img/radoja.png', 'Nemanja', 'Serbia', 'Centrocampista', 12),
(289, 'Duarte', 6, '1989-06-03', 'img/oscar_duarte.png', 'Óscar ', 'Costa Rica', 'Defensa Central', 12),
(290, 'León', 7, '1989-01-06', 'img/sergioleon.png', 'Sergio', 'España', 'Delantero Centro', 12),
(291, 'Martí', 9, '1991-01-03', 'img/roger.png', 'Roger ', 'España', 'Delantero Centro', 12),
(292, 'Bardhi', 10, '1995-07-02', 'img/bardhi.png', 'Enis', 'Macedonia', 'Centrocampista Ofensivo', 12),
(293, 'Morales', 11, '1987-07-23', 'img/morales.png', 'José Luis', 'España', 'Delantero Centro', 12),
(294, 'Malsa', 12, '1995-10-12', 'img/malsa.png', 'Mickaël ', 'Francia', 'Centrocampista', 12),
(295, 'Vezo', 14, '1994-04-25', 'img/vezo.png', 'Rubén', 'Portugal', 'Defensa Central', 12),
(296, 'Postigo', 15, '1988-11-04', 'img/postigo.png', 'Sergio', 'España', 'Defensa Central', 12),
(297, 'Rochina', 16, '1991-03-23', 'img/rochina.png', 'Rubén', 'España', 'Centrocampista Ofensivo', 12),
(298, 'Vukcevic', 17, '1991-12-13', 'img/vukcevic.png', 'Nikola', 'Montenegro', 'Centrocampista', 12),
(299, 'De Frutos', 18, '1997-02-20', 'img/defrutos.png', 'Jorge', 'España', 'Delantero Centro', 12),
(300, 'Clerc', 19, '1992-02-21', 'img/clerc.png', 'Carlos', 'España', 'Lateral Izquierdo', 12),
(301, 'Miramón', 20, '1989-06-02', 'img/miramon.png', 'Jorge', 'España', 'Lateral Derecho', 12),
(302, 'Gómez', 21, '1998-07-30', 'img/danigomez.png', 'Daniel', 'España', 'Delantero', 12),
(303, 'Melero', 22, '1994-01-02', 'img/melero.png', 'Gonzalo', 'España', 'Centrocampista Ofensivo', 12),
(304, 'Andújar', 23, '1987-04-26', 'img/coke.png', 'Jorge', 'España', 'Lateral Derecho', 12),
(305, 'Campaña', 24, '1993-05-31', 'img/campaña.png', 'Jose Ángel', 'España', 'Centrocampista', 12),
(306, 'Doukoure', 25, '1992-09-11', 'img/doukoure.png', 'Cheick', 'Francia', 'Centrocampista', 12),
(307, 'Masip', 1, '1989-01-03', 'img/masip.png', 'Jordi', 'España', 'Portero', 13),
(310, 'Jiménez', 13, '1986-02-10', 'img/roberto.png', 'Roberto', 'España', 'Portero', 13),
(311, 'Pérez', 2, '1995-02-04', 'img/luisperez.png', 'Luis', 'España', 'Lateral Derecho', 13),
(312, 'Carnero', 3, '1989-04-30', 'img/carnero.png', 'Raúl', 'España', 'Lateral Izquierdo', 13),
(313, 'Olivas', 4, '1988-08-21', 'img/kikoolivas.png', 'Francisco', 'España', 'Defensa Central', 13),
(314, 'Sánchez', 5, '1997-03-14', 'img/javisanchez.png', 'Javier', 'España', 'Defensa Central', 13),
(315, 'González', 6, '1990-05-24', 'img/bruno.png', 'Bruno', 'España', 'Defensa Central', 13),
(316, 'El Yamiq', 15, '1992-02-29', 'img/elyamiq.png', 'Jawad', 'Marruecos', 'Defensa Central', 13),
(317, 'Martínez', 22, '1989-03-07', 'img/nachomartinez.png', 'Nacho', 'España', 'Lateral Izquierdo', 13),
(318, 'Fernández', 24, '1996-05-31', 'img/joaquin.png', 'Joaquín', 'España', 'Defensa Central', 13),
(319, 'Janko', 18, '1995-10-22', 'img/janko.png', 'Saidy', 'Suiza', 'Lateral Derecho', 13),
(320, 'Pérez', 8, '1997-02-14', 'img/kikeperez.png', 'Enrique', 'España', 'Centrocampista', 13),
(321, 'Plano', 10, '1991-02-11', 'img/oscarplano.png', 'Óscar ', 'España', 'Centrocampista Ofensivo', 13),
(322, 'Hervías', 11, '1993-03-08', 'img/hervias.png', 'Pablo', 'España', 'Centrocampista', 13),
(323, 'Orellana', 12, '1986-01-27', 'img/orellana.png', 'Fabián', 'Chile', 'Extremo Izquierdo', 13),
(324, 'Alcaraz', 14, '1991-05-01', 'img/alcaraz.png', 'Rubén', 'España', 'Centrocampista', 13),
(325, 'Villa', 19, '1995-01-07', 'img/tonivilla.png', 'Antonio', 'España', 'Centrocampista Ofensivo', 13),
(326, 'San Emeterio', 20, '1997-03-16', 'img/fede.png', 'Federico', 'España', 'Centrocampista', 13),
(327, 'Herrero', 21, '1988-07-29', 'img/michel.png', 'Míchel', 'España', 'Centrocampista', 13),
(328, 'Rubio', 23, '1995-08-17', 'img/waldo.png', 'Waldo', 'España', 'Extremo Izquierdo', 13),
(329, 'Neves Filipe', 40, '1999-03-30', 'img/jota.png', 'Joao Pedro', 'Portugal', 'Extremo Izquierdo', 13),
(330, 'Mesa', 17, '1989-06-07', 'img/roquemesa.png', 'Roque', 'España', 'Centrocampista', 13),
(331, 'Guardiola', 7, '1991-05-29', 'img/sergiguardiola.png', 'Sergio', 'España', 'Delantero Centro', 13),
(332, 'Weissman', 9, '1996-02-14', 'img/weissman.png', 'Shon', 'Israel', 'Delantero Centro', 13),
(333, 'André', 16, '1996-10-20', 'img/marcosandre.png', 'Marcos', 'Brasil', 'Delantero Centro', 13),
(334, 'Dmitrovic', 1, '1992-01-24', 'img/dmitrovic.png', 'Marko', 'Serbia', 'Portero', 14),
(335, 'Rodríguez', 13, '1988-08-28', 'img/yoel.png', 'Yoel', 'España', 'Portero', 14),
(336, 'Oliveira', 4, '1992-01-08', 'img/paulooliveira.png', 'Paulo', 'Portugal', 'Defensa Central', 14),
(337, 'Bigas', 3, '1990-05-15', 'img/bigas.png', 'Pedro', 'España', 'Defensa Central', 14),
(338, 'Arbilla', 23, '1987-05-15', 'img/arbilla.png', 'Anaitz', 'España', 'Defensa Central', 14),
(339, 'Martínez', 5, '1993-02-12', 'img/martinez.png', 'José Antonio', 'España', 'Defensa Central', 14),
(340, 'Burgos', 2, '1992-01-09', 'img/burgos.png', 'Esteban ', 'España', 'Defensa Central', 14),
(341, 'Rodrigues', 24, '1994-03-05', 'img/rodrigues.png', 'Kévin', 'Portugal', 'Lateral Izquierdo', 14),
(342, 'Ángel', 15, '1989-09-05', 'img/cote.png', 'José', 'España', 'Lateral Izquierdo', 14),
(343, 'Soares', 11, '1995-05-09', 'img/soares.png', 'Rafa', 'Portugal', 'Lateral Izquierdo', 14),
(344, 'Pozo', 22, '1999-02-22', 'img/pozo.png', 'Alejandro', 'España', 'Lateral Derecho', 14),
(345, 'Correa', 20, '1992-09-20', 'img/robercorrea.png', 'Roberto ', 'España', 'Lateral Derecho', 14),
(346, 'Diop', 8, '1986-03-19', 'img/diop.png', 'Pape', 'Senegal', 'Mediocentro Defensivo', 14),
(347, 'Expósito', 10, '1996-08-01', 'img/exposito.png', 'Eduardo', 'España', 'Centrocampista', 14),
(348, 'Recio', 18, '1991-01-11', 'img/recio.png', 'José Luis', 'España', 'Centrocampista', 14),
(349, 'Álvarez', 6, '1992-01-23', 'img/alvarez.png', 'Sergio', 'España', 'Centrocampista', 14),
(350, 'Olabe', 16, '1996-05-05', 'img/olabe.png', 'Roberto', 'España', 'Centrocampista', 14),
(351, 'Gil', 25, '2001-02-11', 'img/bryan.png', 'Bryan', 'España', 'Extremo Izquierdo', 14),
(352, 'Inui', 14, '1988-06-02', 'img/inui.png', 'Takashi', 'Japón', 'Extremo Izquierdo', 14),
(353, 'Kadzior', 19, '1992-06-16', 'img/kadzior.png', 'Damian', 'Polonia', 'Extremo Derecho', 14),
(354, 'León', 21, '1986-11-24', 'img/pedroleon.png', 'Pedro', 'España', 'Extremo Derecho', 14),
(355, 'Muto', 12, '1992-07-15', 'img/muto.png', 'Yoshinori', 'Japón', 'Delantero Centro', 14),
(356, 'Enrich', 9, '1990-02-26', 'img/enrich.png', 'Sergi', 'España', 'Delantero Centro', 14),
(357, 'García', 17, '1989-11-25', 'img/kikegarcia.png', 'Enrique', 'España', 'Delantero Centro', 14),
(358, 'González', 7, '1990-05-16', 'img/kike.png', 'Enrique', 'España', 'Delantero Centro', 14),
(359, 'Robles', 1, '1990-06-17', 'img/joel.png', 'Joel', 'España', 'Portero', 15),
(360, 'Martín', 13, '1998-07-08', 'img/dani.png', 'Daniel', 'España', 'Portero', 15),
(361, 'Bravo', 25, '1983-04-13', 'img/bravo.png', 'Claudio', 'Chile', 'Portero', 15),
(362, 'Bartra', 5, '1991-01-15', 'img/bartra.png', 'Marc', 'España', 'Defensa Central', 15),
(363, 'Mandi', 23, '1991-10-22', 'img/mandi.png', 'Aissa', 'Argelia', 'Defensa Central', 15),
(364, 'Da Silva', 12, '1989-08-23', 'img/sidnei.png', 'Sidnei', 'Brasil', 'Defensa Central', 15),
(365, 'Ruíz', 6, '1989-01-25', 'img/victorruiz.png', 'Víctor', 'España', 'Defensa Central', 15),
(366, 'Moreno', 15, '1993-06-08', 'img/alexmoreno.png', 'Álex', 'España', 'Lateral Izquierdo', 15),
(367, 'De Souza', 22, '1999-01-14', 'img/emerson.png', 'Emerson', 'Brasil', 'Lateral Derecho', 15),
(368, 'Montoya', 2, '1991-04-14', 'img/montoya.png', 'Martín', 'España', 'Lateral Derecho', 15),
(369, 'Carvalho', 14, '1992-04-07', 'img/william.png', 'William', 'Portugal', 'Mediocentro Defensivo', 15),
(370, 'Rodríguez', 21, '1994-04-12', 'img/guido.png', 'Guido', 'Argentina', 'Mediocentro Defensivo', 15),
(371, 'Camarasa', 3, '1994-05-28', 'img/camarasa.png', 'Víctor', 'España', 'Centrocampista', 15),
(372, 'Guardado', 18, '1986-09-28', 'img/guardado.png', 'Andrés', 'México', 'Centrocampista', 15),
(373, 'Akouokou', 4, '1997-12-20', 'img/akoukou.png', 'Paul', 'Costa de Marfil', 'Centrocampista', 15),
(374, 'Fekir', 8, '1993-07-18', 'img/fekir.png', 'Nabil', 'Francia', 'Centrocampista Ofensivo', 15),
(375, 'Canales', 10, '1991-02-16', 'img/canales.png', 'Sergio', 'España', 'Centrocampista Ofensivo', 15),
(376, 'Tello', 11, '1991-08-11', 'img/tello.png', 'Cristian', 'España', 'Extremo Izquierdo', 15),
(377, 'Lainez', 20, '2000-06-09', 'img/lainez.png', 'Diego', 'México', 'Extremo Izquierdo', 15),
(378, 'Jiménez', 7, '1993-05-20', 'img/juanmi.png', 'Juan Miguel', 'España', 'Extremo Derecho', 15),
(379, 'Sánchez', 17, '1981-07-21', 'img/joaquinsanchez.png', 'Joaquín', 'España', 'Extremo Derecho', 15),
(380, 'Ruibal', 24, '1996-03-22', 'img/ruibal.png', 'Aitor', 'España', 'Extremo Derecho', 15),
(381, 'Morón', 16, '1993-12-30', 'img/loren.png', 'Loren', 'España', 'Delantero Centro', 15),
(382, 'Iglesias', 9, '1993-01-17', 'img/borjaiglesias.png', 'Borja', 'España', 'Delantero Centro', 15),
(383, 'Sanabria', 19, '1996-03-04', 'img/sanabria.png', 'Antonio', 'Paraguay', 'Delantero Centro', 15),
(384, 'Pacheco', 1, '1992-05-18', 'img/pacheco.png', 'Fernando', 'España', 'Portero', 16),
(385, 'Sivera', 13, '1996-08-11', 'img/sivera.png', 'Antonio', 'España', 'Portero', 16),
(386, 'Castro', 31, '1998-05-20', 'img/aritzcastro.png', 'Aritz', 'España', 'Portero', 16),
(387, 'Rodríguez', 2, '1997-09-10', 'img/tachi.png', 'Alberto', 'España', 'Defensa Central', 16),
(388, 'Duarte', 3, '1995-10-18', 'img/rubenduarte.png', 'Rubén', 'España', 'Lateral Izquierdo', 16),
(389, 'Ely', 4, '1993-11-03', 'img/ely.png', 'Rodrigo', 'Brasil', 'Defensa Central', 16),
(390, 'Laguardia', 5, '1989-11-05', 'img/laguardia.png', 'Víctor', 'España', 'Defensa Central', 16),
(391, 'Marín', 17, '1997-01-09', 'img/adrianmarin.png', 'Adrián', 'España', 'Lateral Izquierdo', 16),
(392, 'Aguirregabiria', 21, '1996-05-10', 'img/martin.png', 'Martín', 'España', 'Lateral Derecho', 16),
(393, 'Navarro', 23, '1990-01-23', 'img/ximo.png', 'Joaquín', 'España', 'Lateral Derecho', 16),
(394, 'Battaglia', 6, '1991-07-12', 'img/battaglia.png', 'Rodrigo', 'Argentina', 'Centrocampista', 16),
(395, 'Pina', 8, '1987-10-14', 'img/pina.png', 'Tomás', 'España', 'Centrocampista', 16),
(396, 'Rioja', 11, '1993-10-16', 'img/rioja.png', 'Luis', 'España', 'Centrocampista', 16),
(397, 'Méndez', 16, '1990-01-02', 'img/edgar.png', 'Edgar', 'España', 'Centrocampista Ofensivo', 16),
(398, 'Sánchez', 19, '1986-04-26', 'img/manusanchez.png', 'Manuel', 'España', 'Centrocampista', 16),
(399, 'Pons', 20, '1993-02-20', 'img/pons.png', 'Pere', 'España', 'Centrocampista', 16),
(400, 'Sainz', 29, '2001-02-21', 'img/borjasainz.png', 'Borja', 'España', 'Centrocampista', 16),
(401, 'Pérez', 7, '1988-09-10', 'img/lucasperez.png', 'Lucas', 'España', 'Delantero Centro', 16),
(402, 'Mato', 9, '1990-03-27', 'img/joselu.png', 'Jose Luis', 'España', 'Delantero Centro', 16),
(403, 'Silva ', 14, '1991-05-08', 'img/deyverson.png', 'Deyverson', 'Brasil', 'Delantero Centro', 16),
(404, 'Guidetti', 10, '1992-04-15', 'img/guidetti.png', 'John', 'Suecia', 'Delantero Centro', 16),
(405, 'Blanco', 13, '1995-07-25', 'img/rubenblanco.png', 'Rubén', 'España', 'Portero', 17),
(406, 'Villar', 1, '1997-07-09', 'img/ivanvillar.png', 'Iván', 'España', 'Portero', 17),
(407, 'Álvarez', 25, '1986-08-03', 'img/sergioalvarez.png', 'Sergio', 'España', 'Portero', 17),
(408, 'Araújo', 4, '1991-08-29', 'img/nestor.png', 'Néstor', 'México', 'Defensa Central', 17),
(409, 'Aidoo', 18, '1995-09-29', 'img/aidoo.png', 'Joseph', 'Ghana', 'Defensa Central', 17),
(410, 'Murillo', 24, '1992-05-27', 'img/murillo.png', 'Jeison', 'Colombia', 'Defensa Central', 17),
(411, 'Costas', 3, '1995-03-26', 'img/costas.png', 'David ', 'España', 'Defensa Central', 17),
(412, 'Sáenz', 16, '1996-11-17', 'img/saenz.png', 'Jorge', 'España', 'Defensa Central', 17),
(413, 'Olaza', 15, '1994-07-21', 'img/olaza.png', 'Lucas', 'Uruguay', 'Lateral Izquierdo', 17),
(414, 'Juncà', 17, '1993-11-16', 'img/junca.png', 'David', 'España', 'Lateral Izquierdo', 17),
(415, 'Mallo', 2, '1991-06-22', 'img/mallo.png', 'Hugo', 'España', 'Lateral Derecho', 17),
(416, 'Vázquez', 20, '1993-03-23', 'img/kevin.png', 'Kevin', 'España', 'Lateral Derecho', 17),
(417, 'Yokuslu', 5, '1994-03-09', 'img/yokuslu.png', 'Okay', 'Turquía', 'Mediocentro Defensivo', 17),
(418, 'Tapia', 14, '1995-07-28', 'img/tapia.png', 'Renato ', 'Perú', 'Mediocentro Defensivo', 17),
(419, 'Beltrán', 8, '1999-02-03', 'img/franbeltran.png', 'Fran ', 'España', 'Centrocampista', 17),
(420, 'Suárez', 6, '1994-01-06', 'img/denis.png', 'Denis', 'España', 'Centrocampista Ofensivo', 17),
(421, 'Agudo Durán', 9, '1986-10-15', 'img/nolito.png', 'Manuel', 'España', 'Extremo Izquierdo', 17),
(422, 'Méndez', 23, '1997-01-07', 'img/brais.png', 'Brais', 'España', 'Extremo Derecho', 17),
(423, 'Mor', 11, '1997-07-24', 'img/emremor.png', 'Emre', 'Turquía', 'Extremo Derecho', 17),
(424, 'Mina', 22, '1995-12-07', 'img/santimina.png', 'Santiago', 'España', 'Delantero Centro', 17),
(425, 'Aspas', 10, '1987-08-01', 'img/iagoaspas.png', 'Iago', 'España', 'Delantero Centro', 17),
(426, 'Ledesma', 1, '1993-02-13', 'img/ledesma.png', 'Jeremías', 'Argentina', 'Portero', 18),
(427, 'Gil', 13, '1994-01-11', 'img/davidgil.png', 'David', 'España', 'Portero', 18),
(428, 'Giménez', 3, '1993-08-12', 'img/fali.png', 'Rafael', 'España', 'Defensa Central', 18),
(429, 'Mauro', 4, '1991-01-09', 'img/marcosmauro.png', 'Marcos', 'Argentina', 'Defensa Central', 18),
(430, 'Akapo', 15, '1993-03-12', 'img/akapo.png', 'Carlos', 'España', 'Lateral Derecho', 18),
(431, 'Torres', 16, '1989-11-26', 'img/juancala.png', 'Juan', 'España', 'Defensa Central', 18),
(432, 'Alcalá', 19, '1989-03-19', 'img/alcala.png', 'Pedro', 'España', 'Defensa Central', 18),
(433, 'Carcelén', 20, '1993-04-23', 'img/iza.png', 'Isaac', 'España', 'Lateral Derecho', 18),
(434, 'Espino García', 22, '1992-01-05', 'img/espino.png', 'Luis Alfonso', 'Uruguay', 'Lateral Izquierdo', 18),
(435, 'Jonsson', 2, '1993-01-10', 'img/jonsson.png', 'Jens', 'Dinamarca', 'Centrocampista', 18),
(436, 'Garrido', 5, '1989-10-09', 'img/garrido.png', 'Jon Ander', 'España', 'Mediocentro Defensivo', 18),
(437, 'Martín-Bejarano', 6, '1987-12-06', 'img/josemari.png', 'José María', 'España', 'Centrocampista', 18),
(438, 'Fernández Iglesias', 8, '1992-10-15', 'img/alexfernandez.png', 'Alejandro', 'España', 'Centrocampista', 18),
(439, 'Perea', 10, '1990-12-19', 'img/albertoperea.png', 'Alberto', 'España', 'Centrocampista Ofensivo', 18),
(440, 'Pombo', 11, '1994-02-22', 'img/pombo.png', 'Jorge Marcos', 'España', 'Centrocampista Ofensivo', 18),
(441, 'Bodiger', 12, '1995-02-09', 'img/bodiger.png', 'Yann', 'Francia', 'Centrocampista', 18),
(442, 'Fernández', 17, '1986-04-10', 'img/augustofernandez.png', 'Augusto', 'Argentina', 'Centrocampista', 18),
(443, 'Sánchez', 7, '1991-03-30', 'img/salvi.png', 'Salvador', 'España', 'Extremo Derecho', 18),
(444, 'Lozano', 9, '1993-04-23', 'img/choco.png', 'Anthony', 'Honduras', 'Delantero Centro', 18),
(445, 'Alejo', 14, '1995-02-10', 'img/alejo.png', 'Iván', 'España', 'Extremo Derecho', 18),
(446, 'Negredo', 18, '1985-08-20', 'img/negredo.png', 'Álvaro', 'España', 'Delantero Centro', 18),
(447, 'Giménez', 21, '1991-05-19', 'img/alvarogimenez.png', 'Álvaro', 'España', 'Delantero Centro', 18),
(448, 'Mesa Travieso', 23, '1995-02-05', 'img/nano.png', 'Alexander', 'España', 'Delantero Centro', 18),
(449, 'Malbasic', 24, '1992-11-18', 'img/malbasic.png', 'Filip', 'Serbia', 'Delantero Centro', 18),
(450, 'Izquierdo', 25, '1993-10-22', 'img/jairo.png', 'Jairo', 'España', 'Extremo Izquierdo', 18),
(451, 'Adekanye', 32, '1999-02-14', 'img/adekanye.png', 'Habeeb Omobolaji ', 'Nigeria', 'Delantero Centro', 18),
(452, 'Fernández', 1, '1998-04-13', 'img/alvarofernandez.png', 'Álvaro', 'España', 'Portero', 19),
(453, 'Fernández', 25, '1986-12-17', 'img/andresfernandez.png', 'Andrés', 'España', 'Portero', 19),
(454, 'Siovas', 18, '1988-09-16', 'img/siovas.png', 'Dimitros', 'Grecia', 'Defensa Central', 19),
(455, 'Pulido', 14, '1991-04-08', 'img/pulido.png', 'Jorge', 'España', 'Defensa Central', 19),
(456, 'Insua', 4, '1993-09-09', 'img/insua.png', 'Pablo', 'España', 'Defensa Central', 19),
(457, 'Galán', 11, '1994-11-19', 'img/galan.png', 'Javier', 'España', 'Lateral Izquierdo', 19),
(458, 'Silva', 22, '1994-03-05', 'img/gastonsilva.png', 'Gastón', 'Uruguay', 'Lateral Izquierdo', 19),
(459, 'Correia', 16, '1985-05-05', 'img/luisinho.png', 'Luis Carlos', 'Portugal', 'Lateral Izquierdo', 19),
(460, 'Maffeo', 3, '1997-07-12', 'img/maffeo.png', 'Pablo', 'España', 'Lateral Derecho', 19),
(461, 'López', 19, '1983-11-01', 'img/pedrolopez.png', 'Pedro', 'España', 'Lateral Derecho', 19),
(462, 'Doumbia', 2, '1998-04-14', 'img/doumbia.png', 'Idrissa', 'Costa de Marfil', 'Mediocentro Defensivo', 19),
(463, 'Mosquera', 5, '1988-04-21', 'img/mosquera.png', 'Pedro', 'España', 'Centrocampista', 19),
(464, 'Seoane', 20, '1997-01-22', 'img/seoane.png', 'Jaime', 'España', 'Centrocampista', 19),
(465, 'Rico', 17, '1984-11-04', 'img/mikelrico.png', 'Mikel', 'España', 'Centrocampista', 19),
(466, 'Gómez', 10, '2000-09-04', 'img/sergiogomez.png', 'Sergio', 'España', 'Centrocampista Ofensivo', 19),
(467, 'García', 24, '1990-11-02', 'img/borjagarcia.png', 'Borja', 'España', 'Centrocampista Ofensivo', 19),
(468, 'Valderrama', 8, '1994-07-19', 'img/eugeni.png', 'Eugeni', 'España', 'Centrocampista Ofensivo', 19),
(469, 'Real', 21, '1991-03-15', 'img/juancarlos.png', 'Juan Carlos', 'España', 'Centrocampista Ofensivo', 19),
(470, 'Ontiveros', 15, '1997-09-09', 'img/ontiveros.png', 'Javier', 'España', 'Extremo Izquierdo', 19),
(471, 'Ferreiro', 7, '1988-04-01', 'img/ferreiro.png', 'David', 'España', 'Extremo Derecho', 19),
(472, 'Mir', 9, '1997-06-18', 'img/rafamir.png', 'Rafael', 'España', 'Delantero Centro', 19),
(473, 'Ramírez', 6, '1995-07-09', 'img/sandro.png', 'Sandro', 'España', 'Delantero Centro', 19),
(474, 'Okazaki', 12, '1986-04-16', 'img/okazaki.png', 'Shinji', 'Japón', 'Delantero Centro', 19),
(475, 'Escriche', 23, '1998-03-24', 'img/escriche.png', 'Daniel', 'España', 'Delantero Centro', 19),
(476, 'Badía', 13, '1992-02-12', 'img/edgarbadia.png', 'Edgar', 'España', 'Portero', 20),
(477, 'Rodríguez', 1, '1989-06-25', 'img/diegorodriguez.png', 'Diego', 'Argentina', 'Portero', 20),
(478, 'Calvo', 12, '1994-04-01', 'img/danicalvo.png', 'Daniel', 'España', 'Defensa Central', 20),
(479, 'González', 2, '1995-01-28', 'img/diegogonzalez.png', 'Diego', 'España', 'Defensa Central', 20),
(480, 'Verdú', 5, '1988-10-21', 'img/verdu.png', 'Gonzalo', 'España', 'Defensa Central', 20),
(481, 'Sánchez', 24, '1996-06-06', 'img/josema.png', 'José Manuel', 'España', 'Defensa Central', 20),
(482, 'Koné', 18, '1995-07-05', 'img/kone.png', 'Youssouf', 'Mali', 'Lateral Izquierdo', 20),
(483, 'Miño', 3, '1990-01-01', 'img/sanchezmiño.png', 'Juan Sánchez', 'Argentina', 'Lateral Izquierdo', 20),
(484, 'Barragán', 19, '1987-06-12', 'img/barragan.png', 'Antonio', 'España', 'Lateral Derecho', 20),
(485, 'Cifuentes', 23, '1990-10-05', 'img/cifuentes.png', 'Miguel', 'España', 'Lateral Derecho', 20),
(486, 'Marcone', 4, '1990-06-03', 'img/marcone.png', 'Iván', 'Argentina', 'Mediocentro Defensivo', 20),
(487, 'Mfulu', 6, '1994-03-20', 'img/mfulu.png', 'Omenuke', 'República Democrática del Congo', 'Mediocentro Defensivo', 20),
(488, 'Sánchez', 15, '1992-05-05', 'img/luismi.png', 'Luis Miguel', 'España', 'Mediocentro Defensivo', 20),
(489, 'Guti', 14, '1996-12-30', 'img/guti.png', 'Raúl', 'España', 'Centrocampista', 20),
(490, 'Rodríguez', 8, '1989-07-23', 'img/victorrodriguez.png', 'Víctor', 'España', 'Extremo Izquierdo', 20),
(491, 'de la Torre', 16, '1989-10-27', 'img/fidel.png', 'Fidel', 'España', 'Extremo Izquierdo', 20),
(492, 'Milla', 10, '1992-09-23', 'img/peremilla.png', 'Pere ', 'España', 'Extremo Izquierdo', 20),
(493, 'Morente', 11, '1996-12-04', 'img/morente.png', 'José Antonio', 'España', 'Extremo Izquierdo', 20),
(494, 'Rigoni', 22, '1993-02-04', 'img/rigoni.png', 'Emiliano', 'Argentina', 'Extremo Derecho', 20),
(495, 'Lucumí', 20, '1995-04-08', 'img/lucu.png', 'Jeison', 'Colombia', 'Extremo Derecho', 20),
(496, 'Ferrández', 17, '1989-12-03', 'img/josan.png', 'José Antonio', 'España', 'Extremo Derecho', 20),
(497, 'Carrillo', 21, '1991-05-25', 'img/carrillo.png', 'Guido', 'Argentina', 'Delantero Centro', 20),
(498, 'Boyé', 9, '1996-02-28', 'img/boye.png', 'Lucas', 'Argentina', 'Delantero Centro', 20),
(499, 'Martínez Modesto', 7, '1980-06-10', 'img/nino.png', 'Juan Francisco', 'España', 'Delantero Centro', 20);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `liga`
--

CREATE TABLE `liga` (
  `id_liga` int(11) NOT NULL,
  `fecha_creacion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `pais` varchar(255) DEFAULT NULL,
  `presidente` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `liga`
--

INSERT INTO `liga` (`id_liga`, `fecha_creacion`, `nombre`, `pais`, `presidente`) VALUES
(1, '1929-02-10', 'Liga Santander', 'España', 'Javier Tebas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partidos`
--

CREATE TABLE `partidos` (
  `id_partido` int(11) NOT NULL,
  `fecha` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `apellidos` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `enabled` bit(1) DEFAULT NULL,
  `nombre` varchar(255) NOT NULL,
  `password` varchar(60) NOT NULL,
  `username` varchar(45) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`id`, `apellidos`, `email`, `enabled`, `nombre`, `password`, `username`) VALUES
(1, 'admin', 'admin@admin.com', b'1', 'admin', '$2y$12$IyYNhKp49aZg8omwUYvNAuVhdys43kmQASa397mL9.o3Afasx2lXS', 'admin'),
(2, 'invitado', 'invitado@invitado.com', b'1', 'invitado', '$2y$12$iSEtbwkhGMxVz508.kykZeEjbCt876XVH4CVWoE0WfPn4x6EoUAgS', 'invitado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user_role`
--

CREATE TABLE `user_role` (
  `user_role_id` int(11) NOT NULL,
  `role` varchar(45) NOT NULL,
  `username` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `user_role`
--

INSERT INTO `user_role` (`user_role_id`, `role`, `username`) VALUES
(1, 'ROLE_ADMIN', 1),
(2, 'ROLE_USUARIO', 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clasificacion`
--
ALTER TABLE `clasificacion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKpxrijubrpysds479514r8w1os` (`id_equipo`);

--
-- Indices de la tabla `entrenador`
--
ALTER TABLE `entrenador`
  ADD PRIMARY KEY (`id_entrenador`);

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`id_equipo`),
  ADD KEY `FKsf2humuyredvljwsglvw0vxku` (`entrenador`),
  ADD KEY `FK1qfj1vy669etdj21m9a0ma0uo` (`id_liga`);

--
-- Indices de la tabla `juega`
--
ALTER TABLE `juega`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK36denvuwxl2pn7y89wyrn7ad7` (`equipo_local`),
  ADD KEY `FKqbrj5pvj63366i2oopcr9qovq` (`equipo_visitante`),
  ADD KEY `FKfvl9st9110svfcyqfwf6tivj` (`id_partido`);

--
-- Indices de la tabla `jugador`
--
ALTER TABLE `jugador`
  ADD PRIMARY KEY (`id_jugador`),
  ADD KEY `FKi60lqb7emposedyui33q42u1i` (`id_equipo`);

--
-- Indices de la tabla `liga`
--
ALTER TABLE `liga`
  ADD PRIMARY KEY (`id_liga`);

--
-- Indices de la tabla `partidos`
--
ALTER TABLE `partidos`
  ADD PRIMARY KEY (`id_partido`);

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_r43af9ap4edm43mmtq01oddj6` (`username`);

--
-- Indices de la tabla `user_role`
--
ALTER TABLE `user_role`
  ADD PRIMARY KEY (`user_role_id`),
  ADD UNIQUE KEY `UKadnyt6agwl65jnnokuvnskhn2` (`role`,`username`),
  ADD KEY `FK2svos04wv92op6gs17m9omli1` (`username`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clasificacion`
--
ALTER TABLE `clasificacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `entrenador`
--
ALTER TABLE `entrenador`
  MODIFY `id_entrenador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `id_equipo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `juega`
--
ALTER TABLE `juega`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `jugador`
--
ALTER TABLE `jugador`
  MODIFY `id_jugador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=500;

--
-- AUTO_INCREMENT de la tabla `liga`
--
ALTER TABLE `liga`
  MODIFY `id_liga` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `partidos`
--
ALTER TABLE `partidos`
  MODIFY `id_partido` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `user_role`
--
ALTER TABLE `user_role`
  MODIFY `user_role_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
