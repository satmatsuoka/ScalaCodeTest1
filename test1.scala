import scala.util.Random

object Main {
    def main(args: Array[String]): Unit = {
        var r = new Random
        val n = r.nextInt(10)
        
        for (i <- 1 to n) {
          println("Hello World!")
        }
    }

}