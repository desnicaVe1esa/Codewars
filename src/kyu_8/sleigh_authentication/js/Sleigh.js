function Sleigh() {
}

Sleigh.prototype.authenticate = function (name, password) {
    return name === "Santa Claus" && password === "Ho Ho Ho!";
};

module.exports = Sleigh;