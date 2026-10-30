fun main() {
    var moveCounter = 1
    var whereWas = "E2"
    var whereMoved = "E4"
    println("$whereWas-$whereMoved;$moveCounter")

    moveCounter++
    whereWas = "D2"
    whereMoved = "D3"
    println("$whereWas-$whereMoved;$moveCounter")
}