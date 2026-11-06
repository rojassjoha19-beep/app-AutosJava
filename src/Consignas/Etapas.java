/*
 * package Consignas;
 * 
 * public class Etapas { Para la proxima semana tiene que estar la etapa 3
 * completa. Les paso los detalles de cada etapa:
 *  
 * Etapa 0: 
 * 
**Checklist de lo que tienen que preparar antes de empezar:**
- Crear un validador para cada tipo de dato principal (String, double e int).
- Definir el nombre de su framework.
- Crear una interfaz Comunicador con su implementación para funcionar por consola.
- Definir un protocolo (con qué formato van a llegar los mensajes
 para determinar qué va a hacer la aplicación).
- Crear un parser capaz de transformar el mensaje (String)
 en un objeto que ordene la intención del mensaje
 (separando recurso, acción y parámetros).
 * 
 * Etapa 1:
 * 
 * - Creación de objeto sesión implementando un Runnable - Manejo de varios
 * controladores de forma abstracta por medio de un ControllerLocator (basado en
 * Service Locator) - Recepción de solicitudes y parseo de las mismas
 * 
 * Etapa 2:
 * 
 * - Toda solicitud dentro de una sesión debe tener una respuesta - El framework
 * debe poder manejar datos de sesión - Se deben poder manejar las excepciones
 * para que el programa no explote - Al iniciar sesión, se debe aguardar como
 * primer mensaje el nombre del cliente (el cual debe ser recordado durante toda
 * la sesión), luego procesar las solicitudes. Implementación recomendada: que
 * los modelos tengan un atributo que sea el nombre de quien los dio de alta. -
 * Se debe agregar la posibilidad de desconectarse, cerrando la sesión e
 * iniciando una nueva
 * 
 * Etapa 3:
 * 
 * - El framework debe contar con un objeto principal (lo voy a llamar
 * NiglioApp), el cual se debe armar por medio de un builder.
 * 
 * - Recomiendo utilizar Fluent API para tener métodos que permitan agregar
 * controladores, decidir qué puerto utilizarán los sockets, si usa sockets o
 * consola, etc.
 * 
 * - Este objeto, una vez buildeado, se debe poder iniciar, crear el socket
 * server, aceptar las solicitudes y desplegar en hilos diferentes los Runnables
 * de sesión. También tendrá que inyectar el comunicador correspondiente.
 * 
 * Les dejo el video de dos clases del cuatrimestre pasado explicando un poco de
 * esto por si quieren revisar:
 * 
 * }
 */