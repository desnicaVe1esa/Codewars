function countSmileys(arr) {
    const pattern = new RegExp(/[:;][-~]?[)D]/); // Используем новый объект RegExp вместо Pattern
    let result = 0;
    for (const str of arr) {
        if (str.match(pattern)) { // Используем метод match вместо matches(String.valueOf())
            result++;
        }
    }
    return result;
}
module.exports = countSmileys;