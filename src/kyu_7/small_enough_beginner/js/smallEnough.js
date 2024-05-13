function smallEnough(a, limit){
    return Math.max(...a) <= limit;
}
module.exports = smallEnough;