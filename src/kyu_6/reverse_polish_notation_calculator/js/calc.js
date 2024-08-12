function calc(expr) {
    var result = [];
    var atoms = expr.split(/\s+/);
    for (var i=0; i<atoms.length; i++) {
        switch(atoms[i]) {
            case '+': result.push(result.pop() + result.pop()); break;
            case '-': result.push(-result.pop() + result.pop()); break;
            case '*': result.push(result.pop() * result.pop()); break;
            case '/': result.push(1 /(result.pop() / result.pop())); break;
            default: result.push(parseFloat(atoms[i]));
        }
    }
    return result.pop() || 0;
}

module.exports = calc;