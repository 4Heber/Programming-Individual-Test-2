# Programming-Individual-Test-2

## Requisitos

> ### ***Clase Avión:***
>
> - **Atributos:**
>   - String ID
>   - Integer pasajeros
>   
> - **Constructores:**
>   - Constructor vacío
>   - Constructor con todos los parametros
>   
> - **Getters and Setters**
> - **Metodos:**
>   - **toString()**
>   - static **solicitarDatos()**. Return obj Avión.

> ### ***Clase Vuelo:***
>
> - **Atributos:**
>   - Integer ID (autoincrement)
>   - Integer contador
>   - Avion avion
>   - String origen
>   - String destino
>
> - **Constructores:**
>   - Constructor vacío
>   - Constructor con todos los parametros
>
> - **Getters and Setters**
> - **Metodos:**
>   - **toString()**
>   - static **solicitarDatos()**. Return obj Vuelo.
>   - static **añadirVuelo()**. ArrayList de vuelos por parámetro, crea y añade un vuelo. Return void.
>   - static **buscarVuelo()**. ArrayList de vuelos por parámetro, pide al usuario el ID de un vuelo a buscar, si lo encuentra devuelve la posición sino devuelve -1.
>   - static **eliminarVuelo()**. ArrayList de vuelos por parámetro, pide al usuario el ID de un vuelo a eliminar, si lo encuentra lo elimina y devuelve true sino devuelve false.
>   - static **buscarVuelo()**. ArrayList de vuelos por parámetro, pide al usuario el destino e imprime por pantalla todos los vuelos con ese destino. Return void.

> ### ***Clase Aeropuerto:***
>
> - **Atributos:**
>   - String nombre
>   - ArrayList vuelos
>   - Integer capacidad
>   
> - **Constructores:**
>   - Constructor vacio
>   - Constructor con todos los parametros
>
> - **Getters and Setters**
> - **Metodos:**
>   - **toString()**
>   - **comprobarCapacidad()**. Comprueba que la suma de todos los pasajeros de todos los aviones de su ArrayList de vuelos no supera el atributo capacidad del aeropuerto. Retorna false si no supera la capacidad y true si se supera la capacidad.
>
> - **Main:**
>   - Crea un objeto aeropuerto
>   - Menú:
>     - 1- Añadir Vuelo
>     - 2- Ver lista de Vuelos segun destino
>     - 3- Eliminar Vuelo
>     - 4- Comprobar Capacidad







