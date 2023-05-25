class MyClass{

companion object {

@JvmStatic
fun main(args:Array<String>)
{

println("The sum of and b is ${add(2,3)}")


}

fun add(a:Int, b:Int): Any{   //can return anything
return a+b
}

}

