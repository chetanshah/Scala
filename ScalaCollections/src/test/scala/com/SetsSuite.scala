package com

import org.scalatest._

class SetsSuite extends FunSuite with Matchers {

  test("apply on an empty Set should yield false") {
    // Set.empty
    Sets.empty(randomString) shouldBe false
    1 to 1000 foreach { _ =>
      Sets.empty(randomString) shouldBe false
    }

  }

  test("add on an empty Set should yield a new Set with one element") {
    val first = randomString
    val second = randomString

    first should not be second

    val set = Sets.empty.add(first)
    set(first) shouldBe true
    set(second) shouldBe false
  }

  test("add on non empty Set should yield a new Set with two elements") {
    val first = randomString
    val second = randomString

    val set = Sets.empty.add(first).add(second)
    set(first) shouldBe true
    set(second) shouldBe true
  }

  test("remove on a non empty Set should yield a new Set without the element") {
    val element = randomString
    val setWithElement = Sets.empty.add(element)

    setWithElement(element) shouldBe true

    val setWithoutElement = setWithElement.remove(element)
    //  setWithElement(element) shouldBe true
    setWithoutElement(element) shouldBe false
  }

  private def randomString: String = scala.util.Random.alphanumeric.take(5).mkString
}
