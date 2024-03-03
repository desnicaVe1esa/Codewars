var isAnagram = function (test, original) {
    return test.toLowerCase().split("").sort().toString() === original.toLowerCase().split("").sort().toString();
};


module.exports = isAnagram;