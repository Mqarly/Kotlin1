class wanafunzi(val name:String,val gender:String,var phone:Int,val course:String) {

}

fun main(args: Array<String>) {
    val obj=wanafunzi("Cole","male",789007554,"Medicine")
    println("The student name is ${obj.name}")
    println("He is a ${obj.gender}")
    println("The contact of the student is ${obj.phone}")

    val OBJ=wanafunzi("Samson","male",75676748,"Information Technology")
    println("The student name is ${OBJ.name} and he identifies as ${OBJ.gender}.His contact is ${OBJ.phone} and he does ${OBJ.course}")



}