var filterString = function (value) {
    return parseInt(value.replace(/[a-zA-Z]*/g, ""));
}
module.exports = filterString;