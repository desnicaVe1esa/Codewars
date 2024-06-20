function solution(digits){
    return digits.split('').reduce((pre, _, i) => Math.max(pre, digits.slice(i, i + 5)), 0);
}
module.exports = solution;