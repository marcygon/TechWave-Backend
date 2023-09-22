:uk:
## Project description: TechWave

The **TechWave** project is a digital platform for organizing and publishing events that aims to facilitate the organization and promotion of technology-related events. The platform allows users to register and access detailed information about available events, such as the location, description, date, and time, so they can efficiently plan their attendance.

## :rocket:Key features of the platform:

**1. User Registration:** Users can register on the platform, granting them access to all available functionalities, such as joining events, receiving notifications, and managing their list of registered events.

**2. Event Search and Registration:** Users can search and explore available technology events on the platform, and register for those that interest them. Once registered for an event, they will automatically receive a confirmation email.

**3. User and Administrator Profiles:** The platform has two main profiles, user and administrator. Users can register and join events, while administrators have access to a special section where they can create, edit, and delete events.

**4. Event Management:** Administrators have the ability to create new events on the platform, with the option to edit event information at any time. They can also delete events that are no longer relevant.

**5. Registered Event List:** Registered users have access to a list of all events they have registered for, allowing them to keep track of the events they will be attending.

In summary, the TechWave project is a comprehensive and user-friendly platform that offers an efficient solution for organizing and promoting technology events. Both organizers and attendees can benefit from the functionalities offered by the platform, making the dissemination and management of technology events easy and effective.

<h4 align="center">
:construction: Project under construction :construction:
</h4>

## :hammer:Prerequisites

- Java 8 or higher installed on your system.
- Gradle 6.0  or higher.
 
## :white_check_mark:Dependencies
- Spring Boot 2.5.0
- JPA Buddy 2.5.0
- Lombok 1.18.20
- Gradle 6.0

## :gear:Project structure.
The project is structured as follows:
- `Controllers`: This directory contains the error, category, admin, and event controllers, which handle the various HTTP requests and responses related to these functionalities.
- `Domain`: This directory contains the Data Transfer Objects (DTOs), as well as the different models and services related to the project's functionality.
- `Repositories`: This directory contains the repositories for admin, category, and event, which handle the data persistence and retrieval operations for these entities.
- `Security`: This directory contains the repositories for admin, category, and sneaker, which are related to security and authentication within the project.

The controllers execute previously declared functions in the services. This way, we make the controllers section cleaner and easier to read and modify.

## 🛠️ Open and run the project

Once the prerequisites are installed, you can clone the repository from the terminal:
```
git clone https://github.com/marcygon/TechWave-Backend.git
```
Open the project in IntelliJ IDEA and wait for it to finish loading. Once it's done, you need to run the following command to compile and run the project:
```
gradle bootRun
```
Once it has finished, to access it, you have to go to Google Chrome and in the top bar, go to:
```
http://localhost:8080/events
```
You can also access the H2 console by entering this in the top bar. Use the username 'sa' and the password 'password'.
```
http://localhost:8080/h2-console
```

I recommend running it together with the Front-End. Here is the [link to the repository](https://github.com/marcygon/TechWave) with the different instructions on how to run it.


<br><br>


:es:
## Descripción del proyecto: TechWave

El proyecto **TechWave** es una plataforma digital de organización y publicación de eventos que tiene como objetivo facilitar la organización y promoción de eventos relacionados con la tecnología. La plataforma permite a los usuarios registrarse y acceder a información detallada sobre los eventos disponibles, como la dirección, descripción, fecha y hora, para que puedan planificar su asistencia de manera eficiente.

## :rocket:Características principales de la plataforma:

**1. Registro de usuarios:** Los usuarios pueden registrarse en la plataforma, lo que les permite acceder a todas las funcionalidades disponibles, como unirse a eventos, recibir notificaciones y gestionar su lista de eventos registrados.

**2. Búsqueda y registro de eventos:** Los usuarios pueden buscar y explorar eventos tecnológicos disponibles en la plataforma, y registrarse en aquellos que les interesen. Una vez registrado en un evento, recibirán automáticamente un correo electrónico de confirmación.

**3. Perfiles de usuario y administrador:** La plataforma cuenta con dos perfiles principales, el perfil de usuario y el perfil de administrador. Los usuarios pueden registrarse y unirse a eventos, mientras que los administradores tienen acceso a una sección especial donde pueden crear, editar y eliminar eventos.

**4. Gestión de eventos:** Los administradores tienen la capacidad de crear nuevos eventos en la plataforma, con la posibilidad de editar la información del evento en cualquier momento. También pueden eliminar eventos que ya no sean relevantes.

**5. Lista de eventos registrados:** Los usuarios registrados tienen acceso a una lista de todos los eventos a los que se han registrado, lo que les permite llevar un seguimiento de los eventos a los que asistirán.

En resumen, el proyecto TechWave es una plataforma completa y fácil de usar que ofrece una solución eficiente para la organización y promoción de eventos tecnológicos. Tanto los organizadores como los asistentes pueden beneficiarse de las funcionalidades ofrecidas por la plataforma, lo que facilita la difusión y gestión de eventos tecnológicos de manera eficaz.

<h4 align="center">
:construction: Proyecto en construcción :construction:
</h4>

## :hammer:Requisitos previos

- Java 8 o superior instalado en tu sistema.
- Gradle 6.0 o superior.
 
## :white_check_mark:Dependencias
- Spring Boot 2.5.0
- JPA Buddy 2.5.0
- Lombok 1.18.20
- Gradle 6.0

## :gear:Estructura del proyecto
El proyecto esta estructurado de la siguiente manera:
- `Controllers`: Contiene los controladores de errores, category, admin y event.
- `Domain`: Contiene los DTOs, y los distintos modelos y servicios.
- `Repositories`: Contiene los distintos repositorios para admin, category, event.
- `Security`: Contiene los distintos repositorios para admin, category y sneaker.

Los controladores ejecutan funciones previamente declaradas en los servicios, de esta manera hacemos que el apartado de controladores quede más limpio y sea más facil de leer y modificar.

## 🛠️ Abre y ejecuta el proyecto

Una vez que estén los requisitos instalados, ya se puede clonar desde la terminal:
```
git clone git clone https://github.com/marcygon/TechWave-Backend.git
```
Abre el proyecto en IntelliJ IDEA y espera a que termine de cargar. Una vez que haya terminado, debes ejecutar el siguiente comando para compilar y ejecutar el proyecto:
```
gradle bootRun
```
Una vez haya terminado, para acceder, debes abrir Google Chrome y en la barra superior, dirigirte a:
```
http://localhost:8080/events
```
También puedes acceder a la consola H2 ingresando esto en la barra superior. Utiliza el nombre de usuario 'sa' y la contraseña 'password'.
```
http://localhost:8080/h2-console
```

Recomiendo hacerlo en compañía del Front-End, este es el [link al repositorio](https://github.com/marcygon/TechWave) con las distintas instruciones de como ejecutarlo.
