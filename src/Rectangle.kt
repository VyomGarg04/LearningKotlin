class Rectangle(
    val l: Double,
    val b: Double
):Shape("Rectangle") {
    init{
        println("$name created with length = $l and breadth = $b")
    }

    override fun area() = l*b
    override fun peri() = 2*(l+b)
    fun isSquare() = l==b

}

