fun main() {
    var password = ""
    val intRange = 0..9
    val charRange = 'a'..'z'
    for (i in 1..3) {
        password += intRange.random()
        password += charRange.random()
    }
    println(password)
}