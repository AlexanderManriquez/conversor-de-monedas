# Proyecto Conversor de Monedas

En este emocionante desafío de programación, tengo la misión de construir mi propio Conversor de Monedas. 

Debo realizar solicitudes a una API de tasas de cambio,manipular datos JSON y, finalmente, filtrar y mostrar las monedas de interés. 

Para cumplir con este desafío utilizaré 🧰:

- ☕ Java
- <a href="https://code.visualstudio.com/">VS Code</a>
- <a href="https://www.exchangerate-api.com/">ExchangeRate API</a>


## Primera versión completada 🏴‍☠️

### Funcionalidades de la aplicación 💰:

  1. Permite al usuario realizar conversión de monedas entre un grupo de monedas seleccionadas para la aplicación (La lista puede ser ampliada según sea necesario).
  2. Al iniciar la aplicación se muestra al usuario un listado de "monedas soportadas".
  3. En caso de que se dígite mal un código o no se encuentre dentro de las "monedas soportadas" se entrega un mensaje al usuario.
  4. Se realiza la conversión y se retorna el resultado.
  5. Se pregunta al usuario si desea continuar realizando conversiones o si prefiere salir.
  6. Cuando el usuario termina la sesión de conversión se entrega un resumen de las conversiones realizadas y se agradece al usuario.

### Video demostrativo 📹:

<video src="https://github.com/AlexanderManriquez/conversor-de-monedas/blob/main/mm-github/presentacion-conversor-de-monedas.mp4" width="320" height="240" controls></video>

### Avances

🌀 Se creó una clase Moneda que es la encargada de inicializar los datos que extraemos de la API, que en este caso corresponde a los índices de conversión *(conversion_rates)*.

🌀 Se creó una clase ConversorMoneda que es la encargada de obtener los datos de la API y contiene los métodos que extrae las tasas de conversión y otro método que las aplica y realiza la conversión de una moneda a otra.

🌀 Se creó una clase Principal que es la encargada de interactuar con el usuario, le solicita datos y entrega una respuesta.

🌀 Se agregó un bucle *while* que permite al usuario seguir convirtiendo monedas hasta que el decida salir.

🌀 Se agregó un listado de códigos de moneda que se pueden utilizar en el conversor.

🌀 Se agregó un historial de conversiones a modo de resumen que permite al usuario revisar las conversiones realizadas durante la sesión.

### Pendientes

💡Agregar un historial de conversiones.

💡Crear una parte visual que permita al usuario interactuar con la aplicación y seleccionar las monedas de un listado.

