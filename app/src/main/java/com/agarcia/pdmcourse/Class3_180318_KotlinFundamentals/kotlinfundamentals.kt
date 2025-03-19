package com.agarcia.pdmcourse.Class3_180318_KotlinFundamentals

fun main() {
  println("Hello, Kotlin!")

  // Data Types and Variables
  val name:String = "Alvaro"
  var age = 18
  age = "20".toInt()
  age = 19
  println("Hello, $name! You are $age years old.")


  // Null Safety
  var lastname:String? = "Garcia"
  lastname!!.length
  var lastnameLength = lastname?.length ?: 0

  if (lastname !== null) {
    println("The length of the lastname is ${lastname.length}")
  }

  lastname.let {
    println("The length of the lastname is ${it.length}")
  }

  // Control Structures
  var hola = when (age) {
    in 0..17 -> "You are a minor"
    in 18..64 -> "You are an adult"
    else -> "You are a senior"
  }

  when (lastname ) {
    "Garcia" -> println("You are a Garcia")
    else -> println("You are not a Garcia")
  }

  // Functions
  greeting("Alvaro", 18)
  greeting(name = "Andrea")

  callbackIfTrue(condition = true) {
    println("The condition is true")
  }

  callbackIfTrue(true) {
    println("The condition is true")
  }

  var printName  = { name: String -> println(name) }
  var printName2: (String) -> Unit = { println(it) }
  printName("Alvaro")

  // loops()
  filteringAndSearching()
}

fun greeting (name: String, age: Int = 0) {
  println("Hello, $name! You are $age years old.")
}

fun callbackIfTrue (condition: Boolean, callback: () -> Unit) {
  if (condition) {
    callback()
  }
}

fun loops () {
  for (i in 0..10) {
    println(i)
  }

  for (i in 0 until 10) {
    println(i)
  }

  for (i in 10 downTo 0) {
    println(i)
  }

  for (i in 0..10 step 2) {
    println(i)
  }

  var i = 0

  do {
    println(i)
    i++
  } while (i < 10)
}

fun filteringAndSearching () {
  val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  val evenNumbers = numbers.filter { it % 2 == 0 }
  val firstEvenNumber = numbers.first { it % 2 == 0 }
  val lastEvenNumber = numbers.last { it % 2 == 0 }
  val firstOrNullEvenNumber = numbers.firstOrNull { it % 2 == 0 }
  val lastOrNullEvenNumber = numbers.lastOrNull { it % 2 == 0 }
  val anyEvenNumber = numbers.any { it % 2 == 0 }
  val allEvenNumbers = numbers.all { it % 2 == 0 }
  val noneEvenNumber = numbers.none { it % 2 == 0 }
  val countEvenNumbers = numbers.count { it % 2 == 0 }

  println("Even numbers: $evenNumbers")
  println("First even number: $firstEvenNumber")
  println("Last even number: $lastEvenNumber")
  println("First or null even number: $firstOrNullEvenNumber")
  println("Last or null even number: $lastOrNullEvenNumber")
  println("Any even number: $anyEvenNumber")
  println("All even numbers: $allEvenNumbers")
  println("None even number: $noneEvenNumber")
  println("Count even numbers: $countEvenNumbers")
}