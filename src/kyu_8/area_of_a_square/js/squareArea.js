function squareArea(A){
    let area = Math.pow(A, 2) / Math.PI;
    let radius = Math.sqrt(area / Math.PI);
    return Math.round(Math.pow(radius, 2) * 4 * 100) / 100;
}
module.exports = squareArea;