package mobile_notifications

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationsSummary(morningNotification)
    printNotificationsSummary(eveningNotification)
}

fun printNotificationsSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("You have $numberOfMessages notifications.")
        return
    }

    println("Your phone is blowing up! You have 99++ notifications.")
}