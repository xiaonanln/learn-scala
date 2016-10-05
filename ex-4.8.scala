import util.Random
import collection.mutable.ArrayBuffer
import scala.util.Sorting
import java.util.Scanner
import java.io.File
import collection.mutable
import collection.immutable
import scala.collection.JavaConversions.mapAsScalaMap

def minmax(values: Array[Int]) : (Int, Int) = {
  (values.min, values.max)
}

println(minmax(Array[Int]()))

println(minmax(Array[Int](1)))

println(minmax(Array[Int](1, 2, 3)))
