function josephus(items, k){
    var result = [], index = 0;
    while (items.length > 0){
        index = (index + k - 1) % items.length;
        result = result.concat(items.splice(index, 1));
    }
    return result;
}
module.exports = josephus;