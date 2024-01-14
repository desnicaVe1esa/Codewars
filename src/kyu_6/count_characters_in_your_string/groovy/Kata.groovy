package kyu_6.count_characters_in_your_string.groovy

class Kata {
    static def count(string) {
        def resultMap = [:]
        string.each {
            resultMap[it] = resultMap.getOrDefault(it, 0) + 1
        }
        resultMap
    }
}
