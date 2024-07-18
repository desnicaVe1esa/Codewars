function add(num1, num2) {
    let result = "";
    while(num1 + num2) {
        result = num1 % 10 + num2 % 10 + result;
        num1 = num1 / 10 | 0; // | 0 - приведение к целому типую. Если | 1 - приведение к целому типу + 1
        num2 = num2 / 10 | 0;
    }
    return +result; // +<something> - преобразование в число
}

module.exports = add;