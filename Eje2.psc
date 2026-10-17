Algoritmo Eje2
	Definir FACTOR_CONVERSION, OFFSET_CONVERSION, celsius, fahrenheit Como Real
	FACTOR_CONVERSION <- 1.8
	OFFSET_CONVERSION <- 32
	Escribir "Ingrese la temperatura en grados Celsius:"
	Leer celsius
	fahrenheit <- (celsius * FACTOR_CONVERSION) + OFFSET_CONVERSION
	Escribir celsius, " °C equivalen a: ", fahrenheit, " °F"
FinAlgoritmo
