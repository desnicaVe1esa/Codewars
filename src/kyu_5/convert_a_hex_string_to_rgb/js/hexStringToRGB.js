function hexStringToRGB(hexString) {
    let replaceString = hexString.replaceAll("#", "");
    let hexColors = [];
    let start = 0;
    let end = 2;
    for (let i = 0; i < 3; i++) {
        hexColors[i] = replaceString.substring(start, end);
        start += 2;
        end += 2;
    }
    return getColors(hexColors);
}

function getColors(hexColors) {
    let result = {};
    let digits = "0123456789ABCDEF";
    let rgb = ["r", "g", "b"];
    let val = 0;
    for (let i = 0; i < hexColors.length; i++) {
        for (let j = 0; j < hexColors[i].length; j++) {
            let c = hexColors[i].toUpperCase().charAt(j);
            let d = digits.indexOf(c);
            val = 16 * val + d;
        }
        result[rgb[i]] = val;
        val = 0;
    }
    return result;
}

module.exports = hexStringToRGB;