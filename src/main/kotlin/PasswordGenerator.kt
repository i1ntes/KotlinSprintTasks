fun main() {
    println("Укажите желаемую длину пароля")
    val passwordLength = readln().toInt()
    println("Вот Ваш пароль: ${passwordGenerator(passwordLength)}")
}

fun passwordGenerator(passwordLength: Int): String {
    var password = ""
    val intCharRange = '0'..'9'
    val symbolsCharRange = "!,#,$,%,&,',(,),*,+,,,-,.,/, ,\","
    val listOfSymbolRange = symbolsCharRange.split(",")
    while (passwordLength > password.length) {
        password += intCharRange.random()
        password += listOfSymbolRange.random()
    }
    return password
}