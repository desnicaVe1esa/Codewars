function solution(str){
    let strings = []
    for (let i = 0, from = 0, to = 2; i < str.length; i++, from += 2, to += 2) {
        if (to > str.length && str.length % 2 !== 0) {
            strings[i] =  str.substring(from, to - 1) + "_"
            break
        } else {
            if (to > str.length) {
                break
            }
            strings[i] = str.substring(from, to)
        }
    }
    return strings
}
module.exports = solution;