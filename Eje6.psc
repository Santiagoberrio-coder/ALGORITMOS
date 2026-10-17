Algoritmo Eje6
	Definir numero, sumaTotal, promedio Como Real
	Definir cantidadLecturas Como Entero
	sumaTotal <- 0
	cantidadLecturas <- 0
	Escribir "Ingrese un número mayor o igual a cero (o un número negativo para finalizar):"
	Leer numero
	Mientras numero >= 0 Hacer
		sumaTotal <- sumaTotal + numero
		cantidadLecturas <- cantidadLecturas + 1
		Escribir "Ingrese un número mayor o igual a cero (o un número negativo para finalizar):"
		Leer numero
	FinMientras
	Si cantidadLecturas > 0 Entonces
		promedio <- sumaTotal / cantidadLecturas
		Escribir "La suma total es: ", sumaTotal
		Escribir "El promedio es: ", promedio
	SiNo
		Escribir "No se ingresaron números válidos."
	FinSi
FinAlgoritmo
