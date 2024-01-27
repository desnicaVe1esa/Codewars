function longestConsec(strarr, k) {
    if (k <= 0 || k > strarr.length) {
        return "";
    }

    return strarr
        .map((value, index) => (
            strarr.slice(index, index + k).join('')
        ))
        .reduce((longest, current) => current.length > longest.length ? current : longest)
}

module.exports = longestConsec;