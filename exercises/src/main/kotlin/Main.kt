fun main() {
    // ParseIntCharProblem
    println("ParseIntCharProblem")
    val parseIntCharProblem = ParseIntCharProblem()
    println(parseIntCharProblem.getAge("1 year old"))

    // CaptalizeStringProblem
    println("CaptalizeStringProblem")
    val captalizeStringPProblem = CaptalizeStringProblem()
    println(captalizeStringPProblem.capitalize("gabriela"))
    println(captalizeStringPProblem.capitalizeOtherSolution("gabriela"))

    // SmallEnoughProblem
    println("SmallEnoughProblem")
    val smallEnoughProblem = SmallEnoughProblem()
    println(smallEnoughProblem.smallEnough(intArrayOf(1,2,3,4,5,6), 6))

    // GrowthOfAPopulation
    println("GrowthOfAPopulation")
    val growthOfAPopulation = GrowthOfAPopulation()
    println(growthOfAPopulation.nbYear(1000, 2.0, 50, 1200))
    println(growthOfAPopulation.nbYearRecursion(1000, 2.0, 50, 1200))

    // EasyLine
    println("EasyLine")
    val easyLine = EasyLine()
    println(easyLine.easyLine(7))
    println(easyLine.easyLine(13))
}

