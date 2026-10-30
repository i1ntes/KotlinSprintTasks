fun main() {
    val data = "D2-D4;0"
    val splitData = data.split("-", ";")
    println("""|Откуда: ${splitData[0]}
        |Куда: ${splitData[1]}
        |Номер хода: ${splitData[2]}
    """.trimMargin())
}