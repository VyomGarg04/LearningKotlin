

fun main(){
    println("Enter no of elements of array")
    var n = readln().toInt()
    var arr = IntArray(n)

    println("Enter elements of array")

    for(i in 0..<n){
        arr[i]=readln().toInt()
    }

    println("Elements of the array are : ")
    for(i in arr){
        print("$i ")
    }
}