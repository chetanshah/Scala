package com

trait Sets extends (String => Boolean) {
  final def add(input: String): Sets = element => input == element || this(element)

  final def remove(input: String): Sets = element => input != element
}

object Sets {
  // val empty: String => Boolean = input => false
  // val empty: Sets = input => false

  val empty: Sets = new Sets {
    override final def apply(input: String) = false
  }
}
