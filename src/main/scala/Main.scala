@main def hello: Unit = {
  val matchPattern = new MatchPatternWord
  matchPattern { case Person(first: String, last: String) => } 
}
