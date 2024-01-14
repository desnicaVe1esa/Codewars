function countSheeps(sheep) {
    return sheep.filter(Boolean).length;
}
module.exports = countSheeps;