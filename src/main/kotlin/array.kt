fun main(args: Array<String>) {
    var myarr= arrayOf("Kenya","Russia","Swaziland","Switzerland",69,24,999,true)
    var intarr= arrayOf<Int>(9,90,69,999,0,19)

    myarr[0]="MALI"
    myarr[2]="Malcolm"

    println("My country is "+myarr[0])
    println("I am "+myarr[2])
    println("The length of my array is "+myarr.size)
    println("The length of my integer array is "+intarr.size)


}