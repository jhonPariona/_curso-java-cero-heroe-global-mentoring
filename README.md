<p align="center">
  <img src="assets/portada-curso.png" alt="portada udemy">
</p>

<h3 align="center">☕ Aprende a programar en el lenguaje Java y conviértete en un programador Java Experto.</h3>

> Las expresiones se evalúan de izquierda a derecha

## Instalacion de JDK
  - descargar [jdk](https://www.udemy.com/course/java-masterclass-de-cero-a-heroe-en-tiempo-record/learn/lecture/12821593?start=21#notes)
  - instalar [netbeans](https://www.udemy.com/course/java-masterclass-de-cero-a-heroe-en-tiempo-record/learn/lecture/12825443#notes)
    - [netbeans 12 linux](https://computingforgeeks.com/install-netbeans-ide-on-debian-ubuntu-and-linux-mint/) Instalador .sh. Usamos netbeans 12 con java 13 y netbeans 8 con java 8 (para gestionar las versiones usamos [jenv](https://gist.github.com/jhonPariona/8af389c98b63a06223dfd053dd78ff26#install-jenv) [manual instalacion](https://www.jenv.be/))
    

## VARIABLES

> identificadores en camelCase, se puede usar `_` `$` numeros(excepto al inicio) letras
> Tipos de datos inicia en Mayuscula(clases, interfaces)

### [Strings y caracteres especiales](https://github.com/jhonPariona/_curso-java-cero-heroe-global-mentoring/tree/master/Strings#strings)
### VAR
A partir del jdk 10 se puede usar var `var identificador = valor` var infiere el tipo del identificador de acuerdo al valor. Siempre se debe de inicializar la variable
### [Concatenación](https://github.com/jhonPariona/_curso-java-cero-heroe-global-mentoring/tree/master/concatenacion#concatenaci%C3%B3n-en-java)
### [Pedir informacion al usuario linea comandos](https://github.com/jhonPariona/_curso-java-cero-heroe-global-mentoring/tree/master/pedirInfo#pedir-info)

## Tipos primitivos

### enteros
- byte(8 bits) short(16) int(32) long(64)
  `tipo identificador = valor(literal);`
- clases Byte, Short, Integer, Long
Para saber`Byte.SIZE`(num bits), valor minimo `Byte.MIN_VALUE`, maximo `Byte.MAX_VALUE`

> Las literales en java son de tipo int por defecto por eso cuando usamos long debemos de agregar `L` al final, es recomendable usar mayuscula ya q tbn se puede usar minuscula `l`

#### Sisemas de nuemracion
- `tipo decimal = 10;`
- `tipo octal = 012;`
- `tipo hexadecimal = 0xA;`
- `tipo binario = 0b1010;`

Si imprimimos con `sout` imprimira e valor decimal para cualquiera de ellos

### Decimales
> Las literales en decimales por defecto son de tipo double por eso cuando usams float debemos ponerlo F; tbn podemos agregar D en double es opcional
- float(32), double()
- clase Float, Double

### Char ''
> Siempre usa comilla simple
- char(16)

`char identificadorUnicode = '\u0021'`

`char identificadorDecimal = 33`

`char identificadorSimbolo = '!'`

- clase Character
