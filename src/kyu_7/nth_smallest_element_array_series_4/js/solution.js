function nthSmallest(arr, pos){
    let sorted = arr.sort((a,b) => a-b);

    return sorted[pos-1];
}

module.exports = nthSmallest;