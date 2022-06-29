
fun main(args: Array<String>) {
    print("Input number :")
    var nam1= Integer.valueOf(readln())

     print("Choose an operation(+,-,/,*) :")
    var op= readln()

    print("Input second number :")
    var nam2= Integer.valueOf(readln())

    if (op =="+"){
        var ans=nam1 + nam2
        println("The answer is :"+ans)
    }else if (op =="-"){
        var ans=nam1 - nam2
        println("The answer is :"+ans)
    }else if (op =="/"){
        var ans=nam1 / nam2
        println("The answer is :"+ans)
    }else if (op =="*"){
        var ans=nam1 * nam2
        println("The answer is :"+ans)
    }else{
        println("Invalid")
    }










}