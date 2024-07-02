function solve(str){
    const arr = [...str.split(` `).join(``)];
    return str.replace(/\S/g, a => arr.pop());
}
module.exports = solve;