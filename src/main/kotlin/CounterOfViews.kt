fun main() {
    val arrayOfViews = IntArray(7)
    val viewsOnMonday = 20
    val viewsOnTuesday = 23
    val viewsOnWednesday = 17
    val viewsOnThursday = 29
    val viewsOnFriday = 48
    val viewsOnSaturday = 64
    val viewsOnSunday = 56
    arrayOfViews[0] = viewsOnMonday
    arrayOfViews[1] = viewsOnTuesday
    arrayOfViews[2] = viewsOnWednesday
    arrayOfViews[3] = viewsOnThursday
    arrayOfViews[4] = viewsOnFriday
    arrayOfViews[5] = viewsOnSaturday
    arrayOfViews[6] = viewsOnSunday
    println(arrayOfViews.sum())
}