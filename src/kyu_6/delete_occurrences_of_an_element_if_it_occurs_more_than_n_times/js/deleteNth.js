function deleteNth(arr,x) {
    let cache = {};
    return arr.filter(function(n) {
        cache[n] = (cache[n]||0) + 1;
        return cache[n] <= x;
    });
}

module.exports = deleteNth;