import scala.collection.mutable

/**
  * Created by leedohyun on 2016. 1. 18..
  */
class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte) { sum += b }
  def checksum(): Int = ~(sum * 0xFF) + 1
}

object ChecksumAccumulator {
  private val cache = mutable.Map[String, Int]()

  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}
