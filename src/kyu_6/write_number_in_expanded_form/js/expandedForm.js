function expandedForm(num) {
    let strNum = num.toString();
    let expandedArr = [];
    for (let i = 0; i < strNum.length; i++) {
        let digit = parseInt(strNum[i]);
        if (digit !== 0) {
            expandedArr.push(digit + "0".repeat(strNum.length - i - 1));
        }
    }
    return expandedArr.join(" + ");
}

module.exports = expandedForm;