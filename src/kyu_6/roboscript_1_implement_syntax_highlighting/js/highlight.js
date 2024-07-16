function highlight(code) {
    return code.replace(/(F+)/g,'<span style="color: pink">$1</span>').
    replace(/(L+)/g,'<span style="color: red">$1</span>').
    replace(/(R+)/g,'<span style="color: green">$1</span>').
    replace(/(\d+)/g,'<span style="color: orange">$1</span>');
}

module.exports = highlight;