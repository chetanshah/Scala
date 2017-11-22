object fizzBuzzRecursive extends App {
	def fizzBuzz(i: Int): Unit = {
		if(i <= 100) {
			(i%3, i%5) match {
				case (0,0) => println("fizzBuzz")
				case (0,_) => println("fizz")
				case (_,0) => println("buzz")
				case _ => println(i)
			}
			fizzBuzz(i+1)
		}
	}
	println(fizzBuzz(1))
}