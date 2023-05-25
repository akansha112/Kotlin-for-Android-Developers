class MyClass{

companion object {

@JvmStatic
fun main(args:Array<String>)
{

println("The sum of and b is ${add(2,3,4)}")


}

fun add(a:Int): Int{   //can return anything
return a
}
fun add (a:Int, b:Int):Int{
return a+b
}
fun add(a:Int, b:Int, c:Int):Int{
return a+b+c
}
}
}

