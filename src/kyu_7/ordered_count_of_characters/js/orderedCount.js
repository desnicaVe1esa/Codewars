const orderedCount = function (text) {
    let prepared = [];
    let chars = text.split('');
    let compare = '';
    let count = 0;
    for (let i = 0; i < chars.length; i++) {
        compare = chars[i];
        for (let j = 0; j < chars.length; j++) {
            if (compare === chars[j]) {
                count++;
            }
        }
        prepared.push([compare, count])
        count = 0;
    }

    return result(prepared);
}

function result(arr) {
    const counts = {};
    const result = [];
    arr.forEach((element) => {
        if (!counts[element]) {
            result.push(element);
            counts[element] = true;
        }
    });
    return result;
}

module.exports = orderedCount;