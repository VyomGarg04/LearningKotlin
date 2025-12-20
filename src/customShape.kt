

fun main(){
    val l = 3.0
    val b = 5.0
    val height = 2.0
    //anonymous class
    val parallelogram = object : Shape("Parallelogram"){

        init{
            println("Parallelogram created with l = $l , b = $b and height = $height")
            println("Area = ${area()}")
            println("Perimeter = ${peri()}")
            if(isRectangle()) {
                changeName("Rectangle")
                println(name)
            }
        }
        override fun area(): Double {
            return l*height
        }

        override fun peri(): Double {
            return 2*(l+b)
        }

        fun isRectangle(): Boolean = height==b
    }
}