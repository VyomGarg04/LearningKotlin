class Rectangle(
    val l: Double,
    val b: Double
):Shape("Rectangle") {

    constructor(a:Double): this(a,a)

    constructor(a:Int, b:Int): this(a.toDouble(),b.toDouble())

    init{
        println("$name created with length = $l and breadth = $b")
    }

    override fun area() = l*b
    override fun peri() = 2*(l+b)
    fun isSquare() = l==b

}

