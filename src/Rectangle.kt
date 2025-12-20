import kotlin.random.Random

class Rectangle(
    val l: Double,
    val b: Double
):Shape("Rectangle") {

    companion object{
        fun randomRect():Rectangle{
            val l = Random.nextDouble(1.0,10.0)
            val b = Random.nextDouble(1.0,10.0)
            return Rectangle(l,b)
        }
    }

    constructor(a:Double): this(a,a)

    constructor(a:Int, b:Int): this(a.toDouble(),b.toDouble())

    init{
        println("$name created with length = $l and breadth = $b")
    }

    override fun area() = l*b
    override fun peri() = 2*(l+b)
    fun isSquare() = l==b

}

