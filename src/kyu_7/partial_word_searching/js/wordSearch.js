function wordSearch(query, seq){
    const strings = [];
    for (const s of seq) {
        if (s.toLowerCase().includes(query.toLowerCase())) {
            strings.push(s);
        }
    }
    return strings.length !== 0 ? strings : ["Empty"];
}
module.exports = wordSearch;