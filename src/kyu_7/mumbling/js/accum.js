function accum(s) {
    let letters = s.toUpperCase().split("");
    for(let i = 0; i < letters.length; ++i){
        letters[i] += letters[i].toLowerCase().repeat(i);
    }
    return letters.join("-");
}
module.exports = accum;