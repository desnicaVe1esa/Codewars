function sumNoDuplicates(numList) {
    let sum = 0;
    numList.forEach(num => {
        if (numList.indexOf(num) === numList.lastIndexOf(num)) {
            sum += num;
        }
    });
    return sum;
}

module.exports = sumNoDuplicates;