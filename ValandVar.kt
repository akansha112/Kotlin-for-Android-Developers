class MyClass{

companion object{

@JvmStatic 
fun main(args:Array<String>)
{


var a=11
//a="Hello"//give error due to smart casting

var b="Hello"

a=90
b="World"


val c=89
//c=87//give error as val cannot be reassigned

//The main difference between val and var is var can be reassigned but val canno//t.
}
}
}
