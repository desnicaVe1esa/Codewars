function switcheroo(x){
    let result = '';
    for (let i = 0; i < x.length; i++) {
        result += x[i] === 'a' ? 'b'
            : x[i] === 'b' ? 'a'
            : x[i];
    }
    return result;
}
module.exports = switcheroo;