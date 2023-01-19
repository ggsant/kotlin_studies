//Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below. Index 0 will be considered even.
//
//For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.
//
//The input will be a lowercase string with no spaces.

class CaptalizeStringProblem {
    fun capitalize(text: String): List<String> {
        var captalizeOddLetters = ""
        var captalizeOEvenLetters = ""
        for (i in text.indices step 1) {
            println(i)
            if (i % 2 == 0)  captalizeOddLetters += text[i].uppercase() else  captalizeOddLetters += text[i]
            if (i % 2 != 0)  captalizeOEvenLetters += text[i].uppercase() else  captalizeOEvenLetters += text[i]

        }
        return listOf(captalizeOddLetters, captalizeOEvenLetters)
    }

    fun capitalizeOtherSolution(text: String): List<String> =
        listOf(
            text.mapIndexed { index, letter -> if (index % 2 == 0) letter.uppercase() else letter }.joinToString(""),
            text.mapIndexed { index, letter -> if (index % 2 == 1) letter.uppercase() else letter }.joinToString("")
        )
}



