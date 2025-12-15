

fun main(){
    searchFor(searchEngine = "Bing",search ="Test")
    searchFor("Google","Bing")

    val search = readln()
    searchFor(search)
}

fun searchFor(search:String, searchEngine:String = "Google"){
    println("Searching for '$search' on $searchEngine")
}