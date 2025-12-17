class Rectangle(
    val l: Double,
    val b: Double
) {
    init{
        println("Rectangle created with length = $l and breadth = $b")
    }

    fun area() = l*b

    fun peri() = 2*(l+b)

    fun isSquare() = l==b

}

