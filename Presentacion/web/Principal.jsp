<%-- 
    Document   : Principal
    Created on : 4/02/2025, 10:09:02 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Jose Raul Rojo Ontiveros</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            color: #333;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: #4CAF50;
            color: white;
            padding: 20px;
            text-align: center;
        }
        .container {
            max-width: 800px;
            margin: 20px auto;
            padding: 20px;
            background-color: white;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center; /* Centrar el contenido */
        }
        h1 {
            font-size: 2.5em;
            margin-bottom: 10px;
        }
        p {
            font-size: 1.2em;
            line-height: 1.6;
        }
        .profile-img {
            width: 150px; /* Tamaño de la imagen */
            height: 150px;
            border-radius: 50%; /* Hace la imagen redonda */
            object-fit: cover; /* Asegura que la imagen se ajuste correctamente */
            margin-bottom: 20px; /* Espacio debajo de la imagen */
            border: 4px solid #4CAF50; /* Borde verde */
        }
        .hobbies {
            margin-top: 20px;
        }
        .hobbies h2 {
            font-size: 2em;
            color: #4CAF50;
        }
        .hobbies ul {
            list-style-type: none;
            padding: 0;
        }
        .hobbies ul li {
            font-size: 1.2em;
            margin-bottom: 10px;
        }
        footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            width: 100%;
            bottom: 0;
        }
        footer a {
            color: #4CAF50;
            text-decoration: none;
        }
        footer a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <header>
        <h1>Jose Raul Rojo Ontiveros</h1>
    </header>
    <div class="container">
      <a href="../Presentacion/">
            <img src="WEB-INF/Peso.jpg" alt=" " class="profile-img">
        </a>
       
        <section>
            <p>Hola, soy Jose Raul Rojo Ontiveros. Soy una persona muy tranquila, me gusta disfrutar de mis ratos a solas. No suelo meterme en problemas y siempre prefiero el diálogo para resolver cualquier situación.</p>
        </section>
        <section class="hobbies">
            <h2>Hobbies e Intereses</h2>
            <ul>
                <li>Ver películas como <em>Sonic 3</em></li>
                <li>Ver series como <em>Arcane</em></li>
                <li>Jugar juegos como <em>Mario Party</em> con amigos</li>
            </ul>
        </section>
    </div>
    <footer>
        <p>Visita mi <a href="https://github.com/Jose-Rojo/AppWeb.git" target="_blank">GitHub</a></p>
    </footer>
</body>
</html>
