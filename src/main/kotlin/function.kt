import java.time.Year
import kotlin.math.sqrt

fun calculate(){
    var num1=23
    var num2=46
    println("The sum of $num1 and $num2 is :"+(num1+num2))
    println("The product of $num1 and $num2 is :"+(num1*num2))
    println("The difference between $num2 and $num1 is :"+(num2-num1))
    println("The quotient of $num2 and $num1 is :"+(num2/num1))


}
fun main(args: Array<String>) {
    calculate()
    name()
    println(sqrt(6.25))
    vehicle("Toyota","Blue",2005)
    vehicle("Nissan","Jet red",1999)
    vehicle("BMW","skyblue",2011)
}
fun name(){
    var name1="Micheal"
    var name2="Cole"
    println("My name is "+name1)
}

fun vehicle(name:String,color: String,year: Int){
    println("The car is a "+name +" which is "+color+", made in the year "+year)
}
















