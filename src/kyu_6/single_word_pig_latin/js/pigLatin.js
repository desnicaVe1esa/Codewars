function pigLatin(s){
    s=s.toLowerCase();
    return /[^a-z]/.test(s) ? null : /^[aeiou]/.test(s) ? s+"way" : s.replace(/^[^aeiou]+/,"")+s.match(/^[^aeiou]+/)+"ay";
}

module.exports = pigLatin;