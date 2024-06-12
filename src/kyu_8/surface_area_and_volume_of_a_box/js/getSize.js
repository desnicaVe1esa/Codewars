function getSize(width, height, depth) {
    return [2 * (depth * width + depth * height + width * height), width * height * depth];
}
module.exports = getSize;