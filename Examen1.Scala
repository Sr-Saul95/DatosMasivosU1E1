// 1 -
println("Numero Par")
def isPar (num: Int): Boolean={  // Crear una funcion para identificar los valores par o inpar
    if(num % 2 == 0){
      return true
    }
  return false
}
print("Ingresa un valor numerico ")
val input = readInt // Pedir al usuario agregar un valor y se almacena aqui en el input
print("Es: ")
println(isPar(input))//False si es impar y True si es par (El input entra a la funcion isPar para comprobar si el valor es par o inpar)
readLine

// 2 -
println("Numero par en una lista")
def pares (numeros: Int): Boolean={
    if (numeros % 2 == 0) {
      return true
    }
  return false
}
val listas = List(3,4,5,2) //Crear la lista de los valores
var a = 0
for(a <- listas){
  if (a <= a) {
    print("El valor " + a + " es: ") //
    println(pares(a))
  }
}
readLine

// 3 -
println("Afortunado numero 7") val fortuna = List(1,7,7) //Crear la lista def
afortunado (siete: List[Int]): Int={ var sumando = 0 for (n <- fortuna){ if(n ==
7){ sumando += n*2! // Si n es igual a 7 entonces debe multiplicar el 7*2 }else {
sumando += n  } } return sumando } println(afortunado(fortuna)) readLineazw

// 4-
println("Equilibrar")
val listaequi = List(1,5,3,3)
def balanceo (balancear: List[Int]): Boolean={
  val (a,b) = balancear.splitAt(balancear.length/2)
  if (a.sum == b.sum){ return true }
  else return false
}
println(balanceo(listaequi))
println("")
readLine

// 5 -
println("Palindromo")

def palindromo(s : String): Boolean = s match {
  case s
  if s.length > 1 => (s.head == s.last) && palindromo(s.slice(1, s.length-1))
  case x => true
}
println()
var palabra1 = readLine
print("Escribir Palabra")
palindromo(palabra1)
println()
