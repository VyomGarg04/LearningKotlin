

fun main(){

    var list = (1..20).toList()
    println(list)

    list = list.filter { it % 2 == 0 }
    println(list)

    list = list.filter { it > 6 }
    println(list)


    val circle1 = Circle(5.0)
    val circle2 = Circle(3.5)
    val triangle1 = Triangle(4.0,4.0,4.0)
    val triangle2 = Triangle(3.0,3.0,3.0)
    val rectangle1 = Rectangle(6.0)
    val rectangle2 = Rectangle(4.0,3.0)

    var shapes = listOf(circle1,circle2,triangle1,triangle2,rectangle1,rectangle2)
//    shapes = shapes.filter { it.area() > 20.0}.sortedBy { it.area() }
    shapes = shapes.customFilter { it.area() > 20.0}.sortedBy { it.area() }
    for(shape in shapes){
        println("Area of ${shape.name} : ${shape.area()}")
    }


}

fun List<Shape>. customFilter(filterFunction: (Shape) -> (Boolean)): List<Shape> {
    val resultList = mutableListOf<Shape>()
    for (shape in this) {
        if (filterFunction(shape)) {
            resultList.add(shape)

        }
    }
        return resultList
}