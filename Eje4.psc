Algoritmo Eje4
	Definir num1, num2, resultado Como Real
	Definir opcion Como Entero
	Escribir "Ingrese el primer número:"
	Leer num1
	Escribir "Ingrese el segundo número:"
	Leer num2
	Escribir "Seleccione una operación:"
	Escribir "1. Suma"
	Escribir "2. Resta"
	Escribir "3. Multiplicación"
	Escribir "4. División"
	Leer opcion
	Segun opcion Hacer
		1:
			resultado <- num1 + num2
			Escribir "El resultado de la suma es: ", resultado
		2:
			resultado <- num1 - num2
			Escribir "El resultado de la resta es: ", resultado
		3:
			resultado <- num1 * num2
			Escribir "El resultado de la multiplicación es: ", resultado
		4:
			Si num2 <> 0 Entonces
				resultado <- num1 / num2
				Escribir "El resultado de la división es: ", resultado
			SiNo
				Escribir "Error: No se puede dividir por cero."
			FinSi
		De Otro Modo:
			Escribir "Opción no válida."
	FinSegun
FinAlgoritmo
