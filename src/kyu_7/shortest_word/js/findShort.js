function findShort(s){
    return Math.min(...s.split(" ").map(s => s.length));
}
module.exports = findShort;