BiciPalma
=============

## Codigo formado principalmente por David Gelpi 

## Clase Estacion
### Atributos
id = identificador de la estación
direccion = dirección de la estación
numeroAnclajes = número de anclajes de la estación
anclajes[numeroAnclajes] = array donde almacenarás las bicicletas que se anclen en la estación

### Métodos
consultarEstacion() muestra un mensaje con id, direccion y numeroAnclajes
anclajesLibres() devuelve la cantidad de anclajes libres
consultarAnclajes() recorre el array anclajes y muestra el id de la bici anclada o si está libre
anclarBicicleta(bicicleta) inserta el objeto bicicleta en el primer registro libre del array anclajes y llama a mostrarAnclaje()
mostrarAnclaje(bicicleta, numeroAnclaje) muestra un mensaje con el id de la bicicleta anclada y en qué anclaje se ha anclado
leerTarjetaUsuario(tarjetaUsuario) comprueba si la tarjeta de usuario está activada
retirarBicicleta(tarjetaUsuario)
si la tarjeta de usuario está activada retira una bici del anclaje y muestra su información en pantalla llamando a mostrarBicicleta(bicicleta, numeroAnclaje)
para simular que un usuario/a del servicio ancla una bici, debes generar una posición al azar entre los anclajes y eliminar esa bici con el método generarAnclaje()
para eliminar una bici del array debes poner esa posicion del array a null.
mostrarBicicleta(bicicleta, numeroAnclaje) muestra un mensaje con el id de la bici y el número de anclaje donde estaba.
generarAnclaje() devuelve una posición al azar entre el número de anclajes. Utiliza ThreadLocalRandom.current()

## Clase Bicicleta
### Atributos
id = identificador de la bicicleta: un número de tres dígitos.

## Clase TarjetaUsuario
### Atributos
id = identificador de la tarjeta: un número de nueve dígitos.
activada = valor lógico que indica si la tarjeta está activada o no.
