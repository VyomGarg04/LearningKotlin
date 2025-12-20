abstract class Shape(
    //open for normal superclass
    var name:String
) {

    //for custom shapes
    constructor(name: String,vararg dimensions: Double) : this(name)

    init{
        println("I am the super class!")
    }

    fun changeName(newName: String){
        name = newName
    }

    abstract fun area(): Double
    abstract fun peri(): Double
}