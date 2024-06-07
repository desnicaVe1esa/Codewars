function parse(data){
    let result = [];
    let digit = 0;
    let it = 0;
    for (let i = 0; i < data.length; i++) {
        switch (data.charAt(i)) {
            case 'i':
                digit++;
                break;
            case 'd' :
                digit--;
                break;
            case 's':
                digit *= digit;
                break
            case 'o':
                result[it] = digit;
                it++;
                break;
        }
    }
    return result;
}

module.exports = parse;