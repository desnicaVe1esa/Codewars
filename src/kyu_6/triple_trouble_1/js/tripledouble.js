function tripledouble(num1, num2) {
    for (let i = 0; i < 10; i++) {
        let regex1 = new RegExp(`${i}{3}`);
        let regex2 = new RegExp(`${i}{2}`);
        if (regex1.test(num1) && regex2.test(num2)) {
            return 1;
        }
    }
    return 0;
}
module.exports = tripledouble;