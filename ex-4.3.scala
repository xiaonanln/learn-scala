import util.Random
import collection.mutable.ArrayBuffer
import scala.util.Sorting
import java.util.Scanner
import java.io.File
import collection.mutable
import collection.immutable
import scala.collection.JavaConversions.mapAsScalaMap

var in = new Scanner(new File("myfile.txt"))
val counter = new java.util.TreeMap[String, Int]()
while (in.hasNext()) {
  val s = in.next()
  counter.put(s, counter.getOrDefault(s, 0) + 1)
}

println(counter)

for ((k, v) <- counter) {
  println(k, v)
}

