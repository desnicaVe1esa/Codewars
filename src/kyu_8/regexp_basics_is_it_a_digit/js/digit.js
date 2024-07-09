String.prototype.digit = function() {
    return this.length !== 1 ? false : '0123456789'.includes(this);
};