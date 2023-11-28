fun main(args: Array<String>) {
  sum()
  sup()
  multi()
  div()
  mul()
}


fun sum(){
    var a = 20
    var b = 8
    var sum = a+b
    println("Total Sum: ${sum}")
}
fun sup(){
    var a = 20
    var b = 8
    var sup = a-b
    println("Total Sup: ${sup}")
}
fun multi(){
    var a = 20
    var b = 8
    var multi = a*b
    println("Total multi: ${multi}")
}
fun div(){
    var a = 20
    var b = 5
    var div = a/b
    println("Total div: ${div}")
}fun mul(){
    var a = 20
    var b = 6
    var mul = a%b
    println("Total mul: ${mul}")
}