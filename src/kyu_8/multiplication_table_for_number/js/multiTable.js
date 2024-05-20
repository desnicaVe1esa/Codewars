function multiTable(number) {
    let result = '';
    let count = 1;
    while (count <= 10) {
        result += count + ' * ' + number + ' = ' + count * number + '\n';
        count++;
    }
    return result.trim();
}
module.exports = multiTable;