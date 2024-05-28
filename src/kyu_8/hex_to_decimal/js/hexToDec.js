function hexToDec(hexString){
    let digits = "0123456789abcdef";
    let preparedStr = hexString.replaceAll("-", "");
    let result = 0;
    for (let i = 0; i < preparedStr.length; i++) {
        result = result * 16 + digits.indexOf(preparedStr.toLowerCase().charAt(i));
    }
    return hexString.match("-") ? -1 * result : result;
}
module.exports = hexToDec;