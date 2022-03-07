package undirected

object main extends App {

    println("Hello World !");
    val vertices=Set("A","B","C");
    val ed1=Edge[String]("A","B");
    val ed2=Edge[String]("A","C");
    println(ed2.adjacentTo("C"));
    val edges=Set(ed1,ed2);
    val sG=SimpleGraphDefaultImpl(vertices,edges);
    println(sG.neighborsOf("C"));
    println(sG.neighborsOf("A"));



}
