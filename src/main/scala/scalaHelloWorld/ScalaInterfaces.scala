package scalaHelloWorld

// describe the behaviour
trait Helloer {
  def sayHello: String
}

// some behaviour defined
trait HelloerWithLanguage extends Helloer {
  final def sayHello = s"hello from $getLanguage"
  def getLanguage: String
}

// concrete implementation
class ScalaHelloer extends HelloerWithLanguage {
  def getLanguage = "Scala"
}

object ScalaInterfaces extends App {
  println(new ScalaHelloer().sayHello)
}