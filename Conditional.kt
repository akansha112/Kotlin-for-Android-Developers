class MyClass{

companion object{

@JvmStatic 
fun main(args:Array<String>){

var age=20
if(age<13){
println("You are a child and cannot drive");
}
else if(age>13&&age<60){
println("You can drive")
}
else{
println("You are aged and you cannot drive");

}
}
}
