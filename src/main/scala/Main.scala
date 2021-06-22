@main def hello: Unit = 
  println("Hello world 2!")
  println(msg)
  basic_calculus

def msg = "I was compiled by Scala 3. :)"

def basic_calculus: Unit = 
  println("basic calculus")
  val nums = List(1,2,3)
  println(nums)
  //val p = Person("Martin", "Odersky")
  // println(p)
  val numsby2 = nums.map(i => i * 2)   // long form
  println(numsby2)
  val numsby2simple = nums.map(_ * 2)        // short form
  println(numsby2simple)


  val numsfiltered = nums.filter(i => i > 1)
  println(numsfiltered)
  val numsfilteredsimple = nums.filter(_ > 1)
  println(numsfilteredsimple)
