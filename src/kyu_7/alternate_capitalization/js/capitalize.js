function capitalize(s){
    let result = [];
    let s1 = '';
    let s2 = '';
    for (let i = 0; i < s.length; i++) {
        if (i % 2 === 0) {
            s1 += s[i].toUpperCase();
            s2 += s[i].toLowerCase();
        } else {
            s1 += s[i].toLowerCase();
            s2 += s[i].toUpperCase();
        }
    }
    result[0] = s1;
    result[1] = s2;
    return result;
}
module.exports = capitalize;