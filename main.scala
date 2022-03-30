package undirected
object main extends App {

    val vertices= Set("A","B","C", "D", "V", "E", "F","Z");
    val ed1 = Edge[String]("A","C");
    val ed2 = Edge[String]("A","B");
    val ed3 = Edge[String]("B","D");
    val ed4 = Edge[String]("D","V");
    val ed5 = Edge[String]("A","E");
    val ed6 = Edge[String]("E","F");
    val ed8 = Edge[String]("C","F");
    val ed9 = Edge[String]("V","F");
    val ed10 = Edge[String]("E","C");


    var edges=Set(ed1,ed2,ed3,ed4,ed5,ed6,ed8,ed9,ed10);

    val msgr=new SimpleGraphDefaultImpl[String](vertices,edges);
    println(msgr.hasPath("A","V"));

   //println(msgr.hasPath("A","C"));
   // println(msgr.hasPath("A","D"));
   // println(msgr.hasPath("A","E"));

    
}



