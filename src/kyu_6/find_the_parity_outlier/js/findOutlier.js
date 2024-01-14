function findOutlier(integers){
    let evenArr = integers.filter(f => f % 2 === 0);
    let result;
    evenArr.length === 1 ? result = evenArr : result = integers.filter(f => f % 2 !== 0);
    return result[0];
}

module.exports = findOutlier;