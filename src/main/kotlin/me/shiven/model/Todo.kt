package me.shiven.model

import kotlinx.serialization.Serializable

enum class Priority {
    LOW, MEDIUM, HIGH
}

@Serializable
data class Todo(
    val id: Int = 0,
    val title: String = "",
    val description: String = "",
    val priority: Priority = Priority.LOW
)


val todos = listOf<Todo>(
    Todo(
        id = 0,
        title = "Learn Ktor",
        description = "Learning Ktor to create your very own backend for testing android apps with retrofit and okhttp",
        priority = Priority.MEDIUM
    ),
    Todo(
        id = 1,
        title = "Buy Groceries",
        description = "Purchase milk(and run away!), eggs, breads and fruits from the supermarket.",
        priority = Priority.LOW
    ),
    Todo(
        id = 2,
        title = "Workout",
        description = "Go for a long run or cycling session on longer trails",
        priority = Priority.HIGH
    ),
    Todo(
        id = 3,
        title = "Read a Book",
        description = "Read philosophy books by Albert Camus",
        priority = Priority.LOW
    ),
    Todo(
        id = 4,
        title = "Retrofit Android",
        description = "Learn how to use retrofit to fetch datas from api, if you are seeing this looks like you are doing pretty well.",
        priority = Priority.MEDIUM
    ),
    Todo(
        id = 5,
        title = "Post on LinkedIn",
        description = "Post stuff on linkedIn to show what you are thrilled of!",
        priority = Priority.MEDIUM
    ),
    Todo(
        id = 6,
        title = "Buy Gift for her",
        description = "Purchase some cool gift or instead craft yourselves!",
        priority = Priority.MEDIUM
    ),
    Todo(
        id = 7,
        title = "Listen music",
        description = "Listen to trash music and get your delicate eardrums busted.",
        priority = Priority.MEDIUM
    ),
    Todo(
        id = 8,
        title = "Watch Anime",
        description = "Watch anime, only thing that really matters in life!",
        priority = Priority.MEDIUM
    ),
    Todo(
        id = 9,
        title = "Grind Leetcode",
        description = "Check in daily problem on leetcode and copy-paste the solution (shh.. streak matters!!)",
        priority = Priority.MEDIUM
    )
)