package lt.akl.pushups

import java.util.*

data class User(
        val email: String,
        val name: String
)

data class Exercise(
        val user: User,
        val time: Date,
        val count: Int
)
