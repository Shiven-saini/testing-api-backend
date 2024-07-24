package me.shiven.model

import kotlinx.serialization.Serializable

enum class Theme {
    FICTION, NON_FICTION
}

@Serializable
data class Quote(
    val quoteText: String = "",
    val author: String = "",
    val fiction: Theme = Theme.NON_FICTION
)


val quotes = listOf<Quote>(
    Quote("Learning never exhausts the mind!", "Leonardo da Vinci", fiction = Theme.NON_FICTION),
    Quote("Never gonna give you up!", "Rick astley", fiction = Theme.NON_FICTION),
    Quote("Just do it!", "Nike", fiction = Theme.NON_FICTION),
    Quote("Baga baga baga baga baga bagaaa!", "Bogo", fiction = Theme.NON_FICTION),
    Quote("What gives people the reason to live is also the same reason of them dying", "Albert Camus", fiction = Theme.NON_FICTION),
    Quote("I have no enemies!", "Thorfinn karlsefni", fiction = Theme.FICTION),
    Quote("I hope, I will see you again back some day. See you later!", "Goku(Kakarot)", fiction = Theme.FICTION),
    Quote("I will march forward until all my enemies are destroyed", "Eren yeager", fiction = Theme.FICTION),
    Quote("Be hearty in your approbations and lavish in your praise", "Dale Carnegie", fiction = Theme.NON_FICTION),
    Quote("I can't hear my notes!!", "Arima Kousei", fiction = Theme.FICTION),
    Quote("Tatakae!! x50", "Eren Yeager", fiction = Theme.FICTION),
    Quote("Peanuts!!!!!!!!!!!!", "Anya Forger", fiction = Theme.FICTION),
    Quote("Lab Member : 001, I am mad scientisto!", "Hououin Kyouma", fiction = Theme.FICTION)
)