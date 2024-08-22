function myLanguages(results) {
    return Object.keys(results).filter(r => results[r] >= 60).sort((a,b) => results[b] - results[a]);
}
module.exports = myLanguages;