object new_1 extends App {





  // 1. Immutable Data:
  //Immutable data means that once a data structure is created, it cannot be changed.
  // In Scala, val is used to declare immutable variables, and data structures like List,
  // Set, and Map are immutable by default. Immutable data structures promote safety in
  // concurrent and parallel programming as they cannot be modified by multiple threads
  // simultaneously.
  /////////////////////////////////////     immutable set   ////////////////////////////////////////////////////////////
  val immutableSet: Set[Int] = Set(1, 2, 3, 4, 5)
  // Adding an element to the set (creates a new set, does not modify the original set)
  val updatedSet: Set[Int] = immutableSet + 6
  // Attempting to remove an element (creates a new set, does not modify the original set)
  val removedSet: Set[Int] = updatedSet - 3

  println("Original Set: " + immutableSet)
  println("Updated Set: " + updatedSet)
  println("Removed Set: " + removedSet)

  //As you can see, the original immutableSet remains unchanged, demonstrating the immutability of sets in Scala.
  // Immutable collections are crucial for functional programming paradigms as they prevent unintended side
  // effects by ensuring data remains constant once created.


  ///////////////////////////////////     immutable list   ///////////////////////////////////////////////////////////
//
//  val numbers: List[Int] = List(1, 2, 3, 4, 5)
//
//  // Accessing elements in the list
//  println("First element: " + numbers.head)
//  println("Rest of the elements: " + numbers.tail)
//
//  // Prepending an element to the list (creates a new list, does not modify the original list)
//  val updatedList: List[Int] = 0 :: numbers
//  // Appending an element to the list (creates a new list, does not modify the original list)
//  val appendedList: List[Int] = numbers :+ 6
//  // Printing the original list, updated list, and appended list
//  println("Original List: " + numbers)
//  println("Updated List: " + updatedList)
//  println("Appended List: " + appendedList)

//  /////////////////////////////////////  First-Class Functions  ////////////////////////////////////////////////////////
//  // In Scala, functions are first-class citizens, which means you can treat functions like any other variable or value.
//  // You can pass functions as arguments to other functions, return functions from functions,
//  // and store functions in variables. Here's an example of a first-class function in Scala:
//
//  // Define a function that takes two integers and returns their sum
//  def add(a: Int, b: Int): Int = a + b
//  // Define another function that takes a function as a parameter
//  def operate(func: (Int, Int) => Int, x: Int, y: Int): Int = func(x, y)
//  // Use the operate function with the add function as an argument
//  val result: Int = operate(add, 3, 5)
//  println("Result: " + result)
//
//  //In this example:
//  //The add function takes two integers a and b as parameters and returns their sum.
//  //The operate function takes three parameters: a function of type (Int, Int) => Int, and two integers x and y.
//  // It applies the given function to x and y.
//  //The operate function is then called with the add function as the first argument and the integers 3
//  // and 5 as the second and third arguments. The result of add(3, 5) is 8.
//  //The result variable holds the returned value from the operate function, which is 8.
//  //In this example, add is a first-class function because it's passed as a parameter to another function (operate).
//  // This demonstrates the concept of first-class functions in Scala.
//

//  /////////////////////////////////////  Higher-Order Functions  ///////////////////////////////////////////////////////
//
//  // In Scala , higher - order functions are functions that can take other functions as parameters or return functions.
//  // They are a fundamental concept in functional programming. Here's an example of a higher -order function that
//  // takes a function as an argument:
//
//  //Higher-order function that takes a function and applies it twice to a value
//  def applyTwice(f: Int => Int, x: Int): Int = f(f(x))
//  // Function that squares an integer
//  def square(x: Int): Int = x * x
//  // Function that doubles an integer
//  def double(x: Int): Int = x * 2
//  // Usage of the higher-order function with square and double functions
//  val resultSquare: Int = applyTwice(square, 3)
//  val resultDouble: Int = applyTwice(double, 4)
//  println("Result of applying square twice: " + resultSquare)
//  println("Result of applying double twice: " + resultDouble)
//
//  //In this example: applyTwice is a higher - order function that takes two parameters: a function f of type Int
//  // => Int and an integer x.It applies the function f twice to the value x.
//  // square and double are simple functions that square and double an integer, respectively. The applyTwice function is
//  // used with square and double functions to demonstrate how it can apply these functions twice to the given input
//  // values (3 and 4 in this case). The results are calculated as square (square(3)) and double(double(4)) and
//  // printed to the console.

//  ///////////////////////////////  functional transformations on collections  //////////////////////////////////////////

//  val numbers = List(1, 2, 3, 4, 5)
//  // Functional Transformations on Collections
//  // 1. map: Applies a function to each element of the collection and returns a new collection.
//  val squaredNumbers = numbers.map(x => x * x)
//  //2. filter: Returns a new collection containing only the elements that satisfy a given predicate.
//  val evenNumbers = numbers.filter(x => x % 2 == 0)
//  //3. reduce: Combines the elements of the collection using a specified associative binary operator.
//  val sum = numbers.reduce((x, y) => x + y)
//  //4. flatMap: Similar to map, but flattens the result by concatenating nested collections.
//  val nestedNumbers = List(List(1, 2), List(3, 4), List(5))
//  val flattenedNumbers = nestedNumbers.flatMap(x => x)
//  //5. foldLeft: Combines the elements of the collection using a specified binary operator, starting with an initial
//  // value (accumulator).
//  val product = numbers.foldLeft(1)((x, y) => x * y)
//  //6. foreach: Applies a function to each element of the collection for its side effects
//  // (useful for performing actions like printing).
//  numbers.foreach(x => println(x))
//  //7. groupBy: Groups the elements of the collection by a given key function.
//  val words = List("apple", "banana", "cherry", "date")
//  val groupedByLength = words.groupBy(word => word.length)
//
//  // Results
//  println("Squared Numbers: " + squaredNumbers)
//  println("Even Numbers: " + evenNumbers)
//  println("Sum: " + sum)
//  println("Flattened Numbers: " + flattenedNumbers)
//  println("Product: " + product)
//  groupedByLength.foreach { case (length, wordList) => println(s"Words with length $length: $wordList") }
//














}
