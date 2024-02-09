package edu.oregonstate.cs492.githubsearch.data

data class Cat (
    val name: String,
    val type: String,
    val age: Int,
    val favoriteFood: String
)

data class MoreComplexCat (
    val name: String,
    val bestFriend: Friend,
    val otherFriends: List<Friend>
)

data class Friend (
    val name: String,
    val age: Int
)