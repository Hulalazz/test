//object Hi { def main(args: Array[String])=println("hello world!") }
/*object HelloWorld {
    def main(args: Array[String]): Unit = {
        println("Hello, world!")
        //return 1
    }
}*/
//println("Hello world")
/*class Outer{
    class Inner{
        private def f(){println("f")}
    class INnnerMost{
        f()//Right
    }
    }
    //(new Inner).f()//wrong
}
*/
/*package bobsrockets{
    package navigation{
        private[bobsrockets] class Navigator{
            protected[navigation] def useStarChart(){}
            class LegOfJourney{
                private[Navigator] val distance = 100
            }
            private[this] var speed = 200
        }
    }
    package lauch{
    import navigation._
    object Vehicle{
    private[lauch] val guide = new Navigator
    }
    }
}*/
/*
object Old{
  private var count=0;
  def create():Int ={
    count += 1;
    count
  }
  def getCount()=count;
}
class NewClass {
  private var count = 0;
  def create():Int = {
    count +=1;
    count
  }
  def getCount=count;
}

var a = Old;
var b = Old;
var c = new NewClass()
var d = new NewClass()
a.create()
//a.create();
b.create()
println(a.getCount())
println(b.getCount());
var e = c

c.create()
//c.create()
d.create()
println(c.getCount)
println(d.getCount)
println(e.getCount)

println(e==c)
println(d==c)
*/

/*val list: List[Any] = List(
  "a string",
  732, // an integer
  'c', // a character
  true, // a boolean value
  () => "an anonymous function returning a string"
)

list.foreach(element => println(element))
var f =list(4)
println(f)*
*/
// val x: Long = 987654321
// val y: Float = x
// //val z: Long = Long().y
//
// val face: Char = '?'
// val number: Int = face
//
// println(number)
// var a: Any = 123
// a = "Hee"
// val b: List[Any] = null
// println(b)

// class User
// val user1= new User
//
// class Point(var x: Int, var y: Int){
//
//   def move(dx: Int, dy: Int) = {
//     x = x + dx
//     y = y + dy
//     (x,y)
//   }
//   override def toString: String =
//     s"($x, $y)"
// }
//
// val point1 = new Point(2, 3)
// println(point1.x)
// println("P:x",point1.move(1, 1))

// class Point(var x: Int = 0, var y: Int = 0)
//
// val origin = new Point
// val point1 = new Point(1)
// val point2 = new Point(y=6)
// println(point1.x)
// println(point2.y)

// class Point{
//   private var _x = 0
//   private var _y = 0
//   private val bound = 100
//
//   def x = _x
//   def x_= (newValue: Int): Unit = {
//     if (newValue < bound) _x = newValue else printWarning
//   }
//
//   def y = _y
//   def y_= (newValue: Int): Unit = {
//     if (newValue < bound) _y = newValue  else printWarning
//   }
//
//   private def printWarning = println("Warning: Out of bounds")
// }
//
// val point1 = new Point
// point1.x = 99
// point1.y = 101
// println(point1.y)

// trait Iterator[A]{
//   def hashNext: Boolean
//   def next(): A
// }
//
// class IntIterator(to: Int) extends Iterator[Int]{
//   private var current = 0
//   override def hashNext = current < to
//   override def next(): Int = {
//     if (hashNext) {
//       val t = current
//       current += 1
//       t
//     } else 0
//   }
// }
//
//  val iterator = new IntIterator(10)
//  iterator.next()

 // import scala.collection.mutable.ArrayBuffer
 //
 // trait  Pet{
 //   val name: String
 // }
 // class Cat(val name: String) extends Pet
 // class Dog(val name: String) extends Pet
 //
 // val dog = new Dog("Harry")
 // val cat = new Cat("Sally")
 //
 // val animals = ArrayBuffer.empty[Pet]
 // animals.append(dog)
 // animals.append(cat)
 // animals.foreach(pet => println(pet.name))

// val ingradient = ("Sugar", 26): Tuple2[String, Int]
// println(ingradient)
// println(ingradient._1)
// println(ingradient._2)
// val (name, quan) = ingradient
//
// println(name)
// println(quan)

/*val planetDistanceFromSun = List(("Mercury", 57.9),
    ("Venus", 108.2), ("Earth", 227.9), ("Jupiter", 778.3))

planetDistanceFromSun.foreach{ tuple =>{
    tuple match {
        case ("Mercury", distance) => println(s"Mercury is $distance millions km far from Sun")

        case p if(p._1 == "Venus") => println(s"Venus is ${p._2} millions km far from Sun ")

        case p if (p._1 == "Earth") => println(s"Bllue planet is ${p._2} millons km far from Sun")

        case _ => println("Too far ...")

    }
 }
}


val numPairs = List((2, 5), (2, -7), (20, 56))

for ((a, b)<- numPairs){
    println(a*b)
}
*/

/*abstract class A {
    val message: String
}
class B extends A {
    val message = "I'm an instance of class B"
}

trait  C extends A {
    def loudMessage = message.toUpperCase()
}
class D extends B with C

val d = new D
println(d.message)
println(d.loudMessage)
*/
/*
abstract class AbsIterator{
    type T
    def hasNext: Boolean
    def next(): T
}

class StringIterator(s: String) extends AbsIterator {
    type T = Char
    private var i = 0
    def hasNext = i < s.length
    def next() = {
        val ch =  s charAt i
        i += 1
        ch
    }
}

trait RichIterator extends AbsIterator{
    def foreach(f: T => Unit): Unit = while (hasNext) f(next())
}

object StringIteratorTest extends App{
    class RichStringIter extends StringIterator("Scala") with RichIteror
    val richStringIter = new RichStringIter
    richStringIter foreach println
}// Somethong wrong or mmisunderstood
*/
/*
// Higher-order functions

val salaries = Seq(20000, 70000, 40000)
val doubleSalary = (x: Int) => x * 2
val newSalaries = salaries.map(doubleSalary)
println(newSalaries)

val nS = salaries.map(_ * 2)
println(nS)

case class WeeklyWeatherForecast(temperatures: Seq[Double]){

    private def convertCtoF(temp: Double) = temp *1.8 +32

    def forecastInFahrenherit: Seq[Double] = temperatures.map(convertCtoF)
}

object SalaryRaiser{

    private def promotion(salaries: List[Double], promotionFunction: Double => Double): List[Double]=
       salaries.map(promotionFunction)
    def samllPromotion(salaries: List[Double]): List[Double] =
        promotion(salaries, salary => salary * 1.1)

    def bigPromotion(salaries: List[Double]): List[Double] =
            promotion(salaries, salary => salary * math.log(salary))

    def hugePromotion(salaries: List[Double]): List[Double] =
                promotion(salaries, salary => salary * salary)
}
 // functions  that return functions
 def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
     val scheme = if (ssl) "https://" else "http://"
     (endpoint: String, query: String) => s"$scheme$domainName/$endpoint?$query"
 }
 val domainName = "www.example.com"
 def getURL = urlBuilder(ssl=true, domainName)
 val endpoint = "users"
 val query = "id=1"
 val url = getURL(endpoint, query)
println(url)
*/

/*
// Nested methods
def factorial(x: Int): Int ={
    def fact(x: Int, accumulator: Int): Int = {
        if (x <= 1) accumulator
        else fact(x - 1, x * accumulator)
    }
    fact(x, 1)
}

println("Factorial of 2: " + factorial(2))
println("Factorial of 3: " + factorial(3))
*/
// Multuiple parameters lists(curry)

/*
val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val res = numbers.foldLeft(0)((m,n) => {
    println("m:"+m);
    println("n:"+n);
    m+n
  }
)
print(res)

val r=numbers.foldLeft(0)(_);
println(r)
println( r({(m: Int, n: Int) => m + n} ) );
numbers.foldLeft(0, {(m: Int, n: Int) => m + n})
*/
/*
// Case class
case class Book(isborn: String)
val frankstein = Book("978-04861324")

case class Message(sender: String, recipient: String, body: String)
val message1 = Message("guill@quebec.ca", "jorge@cat.es", "Ca va ?")

println(message1.sender)
//message1.sendeer = "travis@ws.us"
val message2 = Message("jorge@cat.es", "guill@qu.ca", "Com va? ")
val message3 = Message("jorge@cat.es", "guill@qu.ca", "Com va? ")
val messSame1 = message2 == message3
val messSame2 = message1 == message2
println(messSame2)
println(message2)
println(message3)

val message4 = Message("julien@bretagne.fr", "travis@washington.us", "Me zo o komz gant ma amezeg")
val message5 = message4.copy()
println(message5.sender)  // travis@washington.us
println(message5.recipient) // claire@bourgogne.fr
println(message5.body)  // "Me zo o komz gant ma amezeg"
println(message4 == message5)
*/
/*
//pattern matching
import scala.util.Random

val x: Int = Random.nextInt(10)

 x match{
     case 0 => "zero"
     case 1 => "one"
     case _ => "many"
 }

 def matchTest(x: Int): String = x match{
     case 0 => "zero"
     case 1 => "one"
     case _ => "many"
 }
println(matchTest(3))
println(matchTest(1))

abstract class Notification
case class Email(sender: String, title: String, body: String) extends Notification
case class SMS(caller: String, message: String) extends Notification
case class VoiceRecording(contactName: String, link: String) extends Notification

def showNotification(notification: Notification): String = {
    notification match {
        case Email(email, title, _) =>
        s"You got email from $email with title: $title"
        case SMS(number, message) =>
        s"You got an SMS from $number! Message: $message"
        case VoiceRecording(name, link) =>
        s"you received a Voice Recording from $name! Click the link to hear it: $link"
    }
}
val someSms = SMS("12345", "Are you OK?")
val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/12345")

println(showNotification(someSms))
println(showNotification(someVoiceRecording))

def showImportantNotification(notification: Notification, importantPeopleInfo: Seq[String]): String = {
    notification match{
        case Email(email, _,_) if importantPeopleInfo.contains(email) =>
        "You got an email from special someone!"
        case SMS(number, _) if importantPeopleInfo.contains(number) =>
        "You got an SMS from special someone!"
        case other =>
        showNotification(other)
    }
}

val importantPeopleInfo = Seq("867-5309", "zjx@gmail.com")

val importantEmail = Email("zjx@gmail.com", "Drinks tonght?", "I am free after 5 am. ")
val importantSms = SMS("867-5309", "I'm here! WHere are you?")

println(showImportantNotification(someSms, importantPeopleInfo))
println(showImportantNotification(someVoiceRecording, importantPeopleInfo))
println(showImportantNotification(importantEmail, importantPeopleInfo))
println(showImportantNotification(importantSms, importantPeopleInfo))


abstract class Device
case class Phone(model: String) extends Device{
  def screenOff = "Turning screen off"
}
case class Computer(model: String) extends Device {
  def screenSaverOn = "Turning screen saver on..."
}

def goIdle(device: Device) = device match {
  case p: Phone => p.screenOff
  case c: Computer => c.screenSaverOn
}
*/
//object Box
/*package hello.logging {
    object Logger {
        def info(message: String): Unit = println(s"INFO: $message")
    }
}
*/
/*
// regular expression
import  scala.util.matching.Regex
val numberPattern: Regex = "[0-9]".r

numberPattern.findFirstMatchIn("awesomepassword") match {
    case Some(_) => println("Password OK")
    case None => println("Password must contain a number")
}
*/
/*
//extractor object
import scala.util.Random

object CustomerID{

  def apply(name: String) = {
    println(s"apply name: $name")
    s"$name--${Random.nextLong}"
  }
  def unapply(customerID: String): Option[String] = {
    //println("Something happen！！！！")
    println("******")
    //println("Something happen！！！！")
    val stringArray: Array[String] = customerID.split("--")
    if (stringArray.tail.nonEmpty) Some(stringArray.head) else None
  }
}

val customer1ID = CustomerID("Sukyoung")
customer1ID match {
  case CustomerID(name) => println(name)
  case _=> println("Could not extract a CustomerID")
}

val customer2ID = CustomerID("Nico")

println(s"customer2ID: $customer2ID")
//Something wrong or mmisunderstood
println("*******************************")
val nickname = "zjxdd--12345"
val CustomerID(name1) = nickname //match
println(name1 == "zjxdd")
println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
println(s"CustomerID(name):${CustomerID("zjxdd")}")
//println(s"after nickname:$name")
*/
/*
// comprehensions
case class User(name: String, age: Int)

val userBase = List(User("Travis", 28),
  User("Kelly", 33),
  User("Jennifer", 44),
  User("Dennis", 23))

val twentySomethings = for (user <- userBase if (user.age >= 20 && user.age < 30))
  yield user.name

twentySomethings.foreach(name => println(name))

def foo(n: Int, v: Int) =
  for (i <- 0 until n;
       j <- i until n if i+j == v )
  yield (i, j)

foo(10, 10) foreach {
  case (i, j) =>
  println(s"($i, $j)")
}
*/
/*
//generic classes
class Stack[A] {
  private var elements: List[A] = Nil
  def push(x: A){ elements = x :: elements}
  def peek: A = elements.head
  def pop(): A = {
    val currentTop = peek
    elements = elements.tail
    currentTop
  }
}

val stack = new Stack[Int]
stack.push(1)
stack.push(2)
println(stack.pop)
println(stack.pop)

class Fruit
class Apple extends Fruit
class Banana extends Fruit

val stack2 = new Stack[Fruit]
val apple = new Apple
val banana = new Banana

stack2.push(apple)
stack2.push(banana)
*/

/*
//variances: covariant, contravariant, or invariant

abstract class Animal {
  def name: String
}
case class Cat(name: String) extends Animal
case class Dog(name: String) extends Animal


object CovarianceTest extends App {
  def printAnimalNames(animals : List[Animal]): Unit = {
    animals.foreach {animal =>
    println(animal.name)
   }
  }


val cats: List[Cat] = List(Cat("Whiskers"), Cat("Tom"))
val dogs: List[Dog] = List(Dog("Fido" ), Dog("Rex"))

printAnimalNames(cats)
printAnimalNames(dogs)
}


abstract class Printer[-A] {
  def print(value: A): Unit
}

class AnimalPrinter extends Printer[Animal] {
  def print(animal: Animal): Unit =
    println("The animal's name is: " + animal.name)
}

class CatPrinter extends Printer[Cat] {
  def print(cat: Cat): Unit =
    println("The cat's name is: " + cat.name)
}


object ContravarianceTest extends App {
  val myCat: Cat = Cat("Boots")
  def printMyCat(printer: Printer[Cat]): Unit = {
    printer.print(myCat)
  }

  val catPrinter: Printer[Cat] = new CatPrinter
  val animalPrinter: Printer[Animal] = new AnimalPrinter

  printMyCat(catPrinter)
  printMyCat(animalPrinter)
}

// invariance
class Container[A](value: A) {
  private var _value: A = value
  def getValue: A = _value
  def setValue(valule: A): Unit = {
    _value = value
  }
}

// val catContainer: Container[Cat] = new Container(Cat("Felix"))
// val animalContainer: Container[Animal] = catContainer
// animalContainer.setValue(Dog("Spot"))
// val cat: Cat = catContainer.getValue

abstract class SmallAnimal extends Animal
case class Mouse(name: String) extends SmallAnimal
*/
/*
// upper type bounds <:
abstract class Animal {
  def name: String
}

abstract class Pet extends Animal {}

class Cat extends Pet {
  override def name: String = "Cat"
}

class Dog extends Pet {
  override def name: String = "Dog"
}

class PetContainer[P <: Pet](p: P){
  def pet: P = p
}

val dogContainer = new PetContainer[Dog](new Dog)
val catContainer = new PetContainer[Cat](new Cat)

//this would not compile
//val lionContainer = new PetContainer[Lion](new Lion)
*/
/*
// lower  type bounds >:
trait Node[+B] {
  def prepend[U >: B](elem: U): Node[U]
}

case class ListNode[+B](h: B, t: Node[B]) extends Node[B] {
  def prepend[U >: B](elem: U): ListNode[U] = ListNode(elem, this)
  def head: B = h
  def tail: Node[B] = t
}

case class Nil[+B]() extends Node[B] {
  def prepend[U >: B](elem: U): ListNode[U] = ListNode(elem, this)
}

trait Bird
case class AfricanSwallow() extends Bird
case class EuropeanSwallow() extends Bird

val africanSwallowList = ListNode[AfricanSwallow](AfricanSwallow(), Nil())
val birdList: Node[Bird] = africanSwallowList
birdList.prepend(new EuropeanSwallow )
*/
/*
// inner class
class Graph {
  class Node {
    var connectedNodes: List[Graph#Node] = Nil
    def connectTo(node: Graph#Node) {
      if (connectedNodes.find(node.equals).isEmpty) {
        connectedNodes = node :: connectedNodes
      }
    }
  }
  var nodes: List[Node] = Nil
  def newNode: Node = {
    val res = new Node
    nodes = res :: nodes
    res
  }
}

val graph1: Graph = new Graph
val node1: graph1.Node = graph1.newNode
val node2: graph1.Node = graph1.newNode

node1.connectTo(node2)
val graph2: Graph = new Graph
val node3: graph2.Node = graph2.newNode
node1.connectTo(node3)
*/
/*
// abstract types
trait Buffer {
  type T
  val element: T
}

abstract class SeqBuffer extends Buffer {
  type U
  type T <: Seq[U]
  def length = element.length
}

abstract class IntSeqBuffer extends SeqBuffer {
  type U = Int
}

def newIntSeqBuf(elem1: Int, elem2: Int): IntSeqBuffer =
  new IntSeqBuffer {
       type T = List[U]
       val element = List(elem1, elem2)
     }
val buf = newIntSeqBuf(7, 8)
println("length = " + buf.length)
println("content = " + buf.element)
*/
/*
// self type =>
trait User {
  def username: String
}

trait Tweeter {
  this: User =>
  def tweet(tweetText: String) = println(s"$username: $tweetText")
}

class VerifiedTweet(val username_ : String) extends Tweeter with User {
        def username = s"real $username_"
}

val realBeyonce = new VerifiedTweet("Beyonce")
realBeyonce.tweet("Just spilled my glass of lemonade")
*/
/*
// implicit parameters
abstract class Monoid[A] {
  def add(x: A, y: A): A
  def unit: A
}

object ImplicitTest {
  implicit val stringMonoid: Monoid[String] = new Monoid[String] {
    def add(x: String, y: String): String = x concat y
    def unit: String = ""
  }

  implicit val intMonoid: Monoid[Int] = new Monoid[Int] {
    def add(x: Int, y: Int): Int = x + y
    def unit: Int = 0
  }

  def sum[A](xs: List[A])(implicit m: Monoid[A]): A =
    if (xs.isEmpty) m.unit
    else m.add(xs.head, sum(xs.tail))

  def main(args: Array[String]): Unit = {
    println(sum(List(1, 2, 3)))       // uses IntMonoid implicitly
    println(sum(List("a", "b", "c"))) // uses StringMonoid implicitly
  }
}
*/
/*
//implicit conversions
import scala.language.implicitConversions

implicit def list2ordered[A](x: List[A])
    (implicit  elem2ordered: A => Ordered[A]): Ordered[List[A]] =
        new Ordered[List[A]] {
            def compare(that: List[A]): Int = 1
        }

import scala.language.implicitConversions

implicit def int2Integer(x: Int) = java.lang.Integer.valueOf(x)
*/
/*
//Polymorphic methods

def listofDuplicates[A](x: A, length: Int): List[A] = {
    if (length < 1)
    Nil
    else
    x :: listofDuplicates(x, length -1)
}
println(listofDuplicates[Int](3, 4))
println(listofDuplicates("La", 8))
*/

// Operator

case  class Vec(val x: Double, val y: Double) {
  def +(that: Vec) = new Vec(this.x + that.x, this.y + that.y)
}

val vector1 = Vec(1.0, 2.0)
val vector2 = Vec(2.0, 2.0)

val vector3 = vector1 + vector2
vector3.x
vector3.y
