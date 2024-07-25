function dashatize(num) {
    let strNum = "" + num;
    strNum = strNum.replace(/([13579])/g, '-$1-');
    strNum = strNum.replace(/--/g, '-');
    strNum = strNum.replace(/^-|-$/g, '');
    return strNum;
}

module.exports = dashatize;