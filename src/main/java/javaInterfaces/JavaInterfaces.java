package javaInterfaces;

// Interface describing the behaviour
interface Helloer {
  String sayHello();
}

// Abstract class defining some implementation
abstract class HelloerWithLanguage implements Helloer {
  public final String sayHello() {
    return "hello from " + getLanguage();
  }
  abstract String getLanguage();
}

// Concrete class implementation
final class JavaHelloer extends HelloerWithLanguage {
  String getLanguage() {
    return "Java";
  }
}

// run it
class JavaInterfaces {
  public static void main(String ... args) {
    Helloer h = new JavaHelloer();
    System.out.println(h.sayHello());
  }
}
