🪙 Conversor de Monedas - Challenge Alura / Oracle Next Education
 Este es un proyecto de consola desarrollado en Java que permite realizar conversiones de tipos de monedas en tiempo real utilizando la API de ExchangeRate-API. 
 El programa ofrece una interfaz amigable, manejo de errores y un historial personalizado por usuario.

📋 Funcionalidades
- 8 Tipos de conversiones: Incluye monedas como Dólar (USD), Peso Argentino (ARS), Real Brasileño (BRL), Peso Colombiano (COP) y Peso Chileno (CLP).
- Conexión a API: Consulta de tasas de cambio actualizadas en tiempo real.
- Historial Personalizado: Registro de cada conversión con el nombre del usuario y marca de tiempo (fecha/hora).
- Manejo de Errores: Validación de entradas para evitar cierres inesperados si el usuario ingresa datos inválidos.

🛠️ Tecnologías Utilizadas
- Lenguaje: Java 17+
- Biblioteca JSON: Gson (para el procesamiento de datos de la API).
- API de Tasas: ExchangeRate-API.
- Herramientas de Red: HttpClient, HttpRequest y HttpResponse.

📂 Estructura del Proyecto
- Principal.java: Contiene el menú interactivo y la lógica de control del programa.
- ConsultaMoneda.java: Se encarga de la conexión HTTP y el filtrado del JSON mediante JsonParser.
- RegistroHistorial.java: Clase encargada de modelar los datos del historial (Encapsulamiento y java.time).
- Moneda.java (Record): Modelo de datos compacto para la respuesta de la API.

🚀 Cómo ejecutarlo
Clona el repositorio:

       https://github.com/MicaLancie/conversor-de-monedas.git
       
Importa el proyecto en tu IDE (IntelliJ IDEA recomendado).
Asegúrate de agregar la biblioteca Gson a las dependencias del proyecto.
Ejecuta la clase Principal.java.

Demostracion:


<img width="1364" height="721" alt="demo1" src="https://github.com/user-attachments/assets/370f7660-2892-4040-9725-152d652ee4b0" />
<img width="1320" height="718" alt="demo2" src="https://github.com/user-attachments/assets/7e43a6c7-0978-42c0-b5e0-aa433e6b1d44" />
<img width="1365" height="722" alt="demo3" src="https://github.com/user-attachments/assets/888fdded-429d-404e-b315-f43e6cc96632" />


Autora:
Micaela Lancieri- Estudiante de BackEnd-Alura
