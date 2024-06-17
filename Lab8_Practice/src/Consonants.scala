object Consonants {
  //Exercise #6: Filtering consonants
  def main(args: Array[String]): Unit = {
    var vowels = List('a','e','i','o','u')

    ('a' to 'z').filter(!vowels.contains(_)).foreach(println)
  }
}