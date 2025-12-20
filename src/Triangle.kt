import kotlin.math.sqrt

class Triangle(
    private val s1: Double,
    private val s2: Double,
    private val s3: Double
    //cannot access the values of sides outside this class
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

    override fun peri() = s1 + s2 + s3

    override fun area(): Double {
        val p = peri() / 2
        return sqrt(p * (p - s1) * (p - s2) * (p - s3))
    }

    fun isValid(): Boolean {
        return (s1 + s2 > s3) && (s2 + s3 > s1) && (s1 + s3 > s2)
    }
}