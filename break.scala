
object BreakApp extends App {
  import scala.util.control.Breaks.{breakable, break}

  breakable {
    var i = 0
    while (true) {
      i += 1
      Console.println(i)
      if (i >= 10) break
    }
  }
}
