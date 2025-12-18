import kotlin.math.sqrt

class Triangle(
    val s1: Double,
    val s2: Double,
    val s3: Double
):Shape("Triangle") {

    init {
        println("$name created with sides $s1, $s2, $s3")
        if (isValid()) {
            println("Area of the $name = ${area()}")
            println("Perimeter of the $name = ${peri()}")
        } else {
            println("Invalid triangle: sides do not satisfy triangle inequality")
        }
    }

    fun peri() = s1 + s2 + s3

    fun area(): Double {
        val p = peri() / 2
        return sqrt(p * (p - s1) * (p - s2) * (p - s3))
    }

    fun isValid(): Boolean {
        return (s1 + s2 > s3) && (s2 + s3 > s1) && (s1 + s3 > s2)
    }
}