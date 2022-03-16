package undirected

object main extends App {

    val vertices= Set("A","B","C","D","E");
    val ed1 = Edge[String]("A","B");
    val ed2 = Edge[String]("B","C");
    val ed3 = Edge[String]("E","D");
    

    val edges=Set(ed1,ed2,ed3);
    val msgr=new SimpleGraphDefaultImpl[String](vertices,edges);

    println(msgr.hasPath("A","C"));
    println(msgr.hasPath("A","D"));
    println(msgr.hasPath("A","E"));


    
}



