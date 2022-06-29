fun main(args: Array<String>) {
    var marks=80
    if (marks<50){
        println("Fail")
    }else{
        println("Pass")
    }
    print("Enter marks :")
    var score= Integer.valueOf(readln())
//
    if (score<=30){
        println("Fail")
    }else if (score>30 && score<=50){
        println("Below average")
    }else if (score>50 && score<=70){
        println("Average")
    }else if (score>70 && score<=90){
        println("Pass")
    }else if (score>90 && score<=100){
        println("Good")
    }else{
        println("Invalid")
    }




}