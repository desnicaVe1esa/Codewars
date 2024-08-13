var isPP = function(n){
    for (let i = 2; ; i++) {
        let root = Math.round(Math.pow(n, 1.0 / i));
        if (root < 2) return null;
        if (Math.pow(root, i) === n) return [root, i];
    }
}

module.exports = isPP;