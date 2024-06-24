function solve(s) {
    let longest = s.split(/[^aeiou]/).sort(
        function (a, b) {
            return b.length - a.length;
        }
    )[0];
    return longest.length;
}

module.exports = solve;