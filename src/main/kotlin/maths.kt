class maths {
    //data member
    var num1:Int=69
    var num2:Int=98
    //member function
    fun arithmetic():Int{
        return num1*num2


    }

}

fun main(args: Array<String>) {
    //creating object
    val myobject=maths()
    println(myobject.arithmetic())
}