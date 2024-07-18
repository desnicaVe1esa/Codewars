function billboard(name, price = 30){
    let result = 0;
    for (let i = 0; i < price; i++) {
        result += name.length;
    }
    return result;
}
module.exports = billboard;