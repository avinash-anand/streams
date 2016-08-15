val zz = List(List(5,10),List(15,20),List(25,30))
val bb = zz.map(_.zipWithIndex).zipWithIndex.flatMap(a => a._1.map(b => (a._2,b._2)))
