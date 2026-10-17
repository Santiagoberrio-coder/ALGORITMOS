Algoritmo Eje3
	Definir numero Como Entero
	Escribir "Ingrese un número entero:"
	Leer numero
	Si numero > 0 Entonces
		Si numero MOD 2 = 0 Entonces
			Escribir "El número es positivo y par."
		SiNo
			Escribir "El número es positivo e impar."
		FinSi
	SiNo
		Si numero < 0 Entonces
			Si numero MOD 2 = 0 Entonces
				Escribir "El número es negativo y par."
			SiNo
				Escribir "El número es negativo e impar."
			FinSi
		SiNo
			Escribir "El número es cero (par)."
		FinSi
	FinSi
FinAlgoritmo
