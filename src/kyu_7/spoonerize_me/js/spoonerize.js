function spoonerize(words) {
    let strings = words.split(" ");
    let s1 = strings[1].charAt(0) + strings[0].substring(1);
    let s2 = strings[0].charAt(0) + strings[1].substring(1);
    return s1 + " " + s2;
}
module.exports = spoonerize;