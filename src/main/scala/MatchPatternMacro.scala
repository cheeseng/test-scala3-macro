import scala.quoted._

object MatchPatternMacro {

  def matchPatternMatcher(right: Expr[PartialFunction[Any, _]])(using Quotes): Expr[String] = {
    import quotes.reflect._
    println("###right.show: " + right.asTerm.show) 
    right.asTerm match {
      case Inlined(call, bindings, Ident(test)) =>
        println("###call: " + call)
        println("###bindings: " + bindings)
        println("###test: " + test)
        println("###test class: " + test.getClass.getName)
         
      case _ => 
        println("###Got other type of tree.")  
    }
    '{ "test" }  
  }

}
