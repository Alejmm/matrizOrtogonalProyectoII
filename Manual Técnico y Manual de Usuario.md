# Manual Técnico
## Proyecto I Parqueo Ortogonal
## Integrantes:  Jenny Sofía Morales 7690 08 7690 y Cristian Alejandro Melgar Ordoñez 7690 21 8342
## Catedrático: Melvin Cali
## Curso: Programación III
## Introducción
Este es un programa que será utilizado sobre estructura de datos eficientes para diseñar algoritmos, utilizando matrices de forma dinámica para poder utilizar los menos recursos posibles, con el objetivo de no estar desperdiciando memoria al momento de definir una matriz estática con algún valor alto, en este programa se podrá observar la administración de memoria eficiente, trabajando como con matrices dinámicas, listas enlazadas, etc..

### Bibliotecas utilizadas
Las bibliotecas e importaciones realizadas son las siguientes:

- import javax.swing.table.DefaultTableModel;
- import java.awt.Color;
- import java.awt.EventQueue;
- import javax.swing.JFrame;
- import javax.swing.JPanel;
- import javax.swing.border.EmptyBorder;
- import javax.swing.JButton;
- import java.awt.event.ActionListener;
- import java.awt.event.ActionEvent;
- import javax.swing.JLabel;
- import javax.swing.JOptionPane;
- import javax.swing.JTable;
- import javax.swing.JScrollPane;
- import javax.swing.JTextField;

### Referencias utilizadas para la creación del programa. 

**Estructuras de datos, matrices dinámicas, listas enlazadas.** 

Las estructuras de datos en programación son formas organizadas y eficientes de almacenar y manipular datos en un programa informático. Estas estructuras proporcionan un marco para representar y organizar los datos de manera que puedan ser accedidos y utilizados de manera eficiente. Algunos ejemplos comunes de estructuras de datos incluyen:
1. Arreglos: Colecciones ordenadas de elementos del mismo tipo, almacenados contiguamente en la memoria.
2.	Listas enlazadas: Una secuencia de nodos donde cada nodo contiene un dato y una referencia al siguiente nodo en la secuencia.
3.	Pilas (stacks): Una estructura de datos en la que los elementos se agregan y eliminan siguiendo el principio de LIFO (Last In, First Out).
4.	Colas (queues): Una estructura de datos en la que los elementos se agregan al final y se eliminan del principio, siguiendo el principio FIFO (First In, First Out).
5.	Árboles: Estructuras de datos jerárquicas compuestas por nodos, donde cada nodo tiene cero o más nodos hijos.
6.	Grafos: Estructuras de datos que consisten en un conjunto de nodos (vértices) y un conjunto de aristas que conectan estos nodos.
7.	Tablas hash: Estructuras de datos que utilizan una función de hash para mapear claves a valores, permitiendo un acceso rápido a los datos.


### Descripción del programa:
El siguiente programa consiste en ser una aplicación funcional para el manejo de un parqueo, en este podrán ingresar vehículos cuando se encuentre disponibilidad en él, consiste en un parqueo dinámico, podrán ingresarse la cantidad de parqueos que deseen utilizarse de forma de una matriz, por ejemplo, al ingresar una cantidad de 2, está sería en forma de matriz de 2x2, teniendo un espacio total de 4 parqueos.




# Manual de Usuario
## Proyecto I Parqueo Ortogonal
## Integrantes:  Jenny Sofía Morales 7690 08 7690 y Cristian Alejandro Melgar Ordoñez 7690 21 8342
## Catedrático: Melvin Cali
## Curso: Programación III
En la siguiente aplicación dispondrás de opciones sobre manejo de un parqueo, en donde se podrá decidir el tamaño del parqueo.
### Funciones específicas:
- Ingreso de datos. 
- Búsqueda de datos.
- Eliminación de datos.
**Ejemplos sobre el funcionamiento:**
Ingreso de tamaño de parqueo (funcionando como matriz, al ingresar 2 este se multiplicaría por el mismo número, dando un resultado como 4 espacios en este parqueo).

![image](https://github.com/sofiaMorales3805/matrizOrtogonalProyectoII/assets/109783605/39102439-50ea-4766-8877-c68d446f0587)

Presionar el botón de guardar para que este tome el número ingresado de cantidad de parqueo:

![image](https://github.com/sofiaMorales3805/matrizOrtogonalProyectoII/assets/109783605/267773e8-4114-496c-aa33-b3c0d94cb71b)

Ingreso de datos para el parqueo, en este se solicitará Propietario, placa, modelo, línea, color, cada dato debe ser ingresado, no puede quedar ninguna casilla sin rellenar:  

![image](https://github.com/sofiaMorales3805/matrizOrtogonalProyectoII/assets/109783605/6056b751-de8a-4144-92a7-aacba64419c2)

Opción de búsqueda en matriz. 

![image](https://github.com/sofiaMorales3805/matrizOrtogonalProyectoII/assets/109783605/541ab866-80e6-4794-98c6-d6fa9a9e9e03)

Al presionar el botón antes mencionado de Buscar en Matriz abrirá una nueva ventana para poder realizar la búsqueda por alguno de los datos ingresados que son Propietario, placa, modelo, línea, color. 

![image](https://github.com/sofiaMorales3805/matrizOrtogonalProyectoII/assets/109783605/da6c26ca-d583-4fbe-919e-6e5dde6fcd3a)

Al momento de presionar “Buscar”, este estaría mostrando la información en la siguiente tabla, si en dado caso el dato buscado es encontrado, de lo contrario no mostrará ninguna información. 

![image](https://github.com/sofiaMorales3805/matrizOrtogonalProyectoII/assets/109783605/764a1d9d-1e06-4e25-99b4-1b9cfa3aa14c)

El botón de “Regresar” te permite regresar a la ventana anterior, es decir al menú principal donde se ingresan los datos del parqueo, al momento de presionar este botón de forma automática cerrará la pestaña actual de búsqueda en parqueo. 

![image](https://github.com/sofiaMorales3805/matrizOrtogonalProyectoII/assets/109783605/9546826c-0007-4616-8ff2-59e44a556ed3)

Botones funcionales dentro del menú principal:
**Limpiar:** Este botón permite borrar la información escrita en la caja de texto, si en dado caso el vehículo no ha sido guardado, al momento de presionar limpiará todas las casillas de texto de forma automática.
**Salir:** Este botón cuenta con la finalización de la aplicación, al presionar cerrará cualquier ventana que se encuentre abierta. 

![image](https://github.com/sofiaMorales3805/matrizOrtogonalProyectoII/assets/109783605/a13b4b4b-7be8-4077-b447-0ccc8d095600)

Un ejemplo realizado sobre la busqueda de datos, el cual se está mostrando en tabla: 

![Imagen de WhatsApp 2024-04-20 a las 07 04 56_4f799a97](https://github.com/sofiaMorales3805/matrizOrtogonalProyectoII/assets/109783605/bdbbfa51-4dac-458d-a80b-493bf984c8c7) 
