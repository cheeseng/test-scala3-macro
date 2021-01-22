final class MatchPatternWord {

  inline def apply(right: PartialFunction[Any, _]) =
    ${ MatchPatternMacro.matchPatternMatcher('{right}) }

}
