function rot(s) {
    return s.split("").reverse().join("");
}

function selfieAndRot(s) {
    return (s = s.replace(/.+/g, t => t + t.replace(/./g, "."))) + "\n" + rot(s);
}

function oper(fn, s) {
    return fn(s);
}