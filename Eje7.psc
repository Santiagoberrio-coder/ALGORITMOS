SubProceso depositar(saldo Por Referencia, monto)
	saldo <- saldo + monto
FinSubProceso

Funcion exito <- retirar(saldo Por Referencia, monto)
	Definir exito Como Logico
	Si monto <= saldo Entonces
		saldo <- saldo - monto
		exito <- Verdadero
	SiNo
		exito <- Falso
	FinSi
FinFuncion

Funcion s <- consultarSaldo(saldo)
	Definir s Como Real
	s <- saldo
FinFuncion

Algoritmo Eje7
	Definir titular Como Caracter
	Definir saldo, deposito, retiro Como Real
	Definir opcion Como Entero
	Escribir "Ingrese el nombre del titular de la cuenta:"
	Leer titular
	Escribir "Ingrese el saldo inicial de la cuenta:"
	Leer saldo
	Repetir
		Escribir "Seleccione una operación:"
		Escribir "1. Consultar saldo"
		Escribir "2. Depositar dinero"
		Escribir "3. Retirar dinero"
		Escribir "4. Salir"
		Leer opcion
		Segun opcion Hacer
			1:
				Escribir "El saldo actual es: ", consultarSaldo(saldo)
			2:
				Escribir "Ingrese el monto a depositar:"
				Leer deposito
				depositar(saldo, deposito)
				Escribir "Depósito realizado. Nuevo saldo: ", consultarSaldo(saldo)
			3:
				Escribir "Ingrese el monto a retirar:"
				Leer retiro
				Si retirar(saldo, retiro) Entonces
					Escribir "Retiro realizado. Nuevo saldo: ", consultarSaldo(saldo)
				SiNo
					Escribir "Fondos insuficientes para realizar el retiro."
				FinSi
			4:
				Escribir "Gracias por usar el sistema bancario."
			De Otro Modo:
				Escribir "Opción no válida."
		FinSegun
	Hasta Que opcion = 4
FinAlgoritmo
