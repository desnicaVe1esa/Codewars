String.prototype.camelCase = function () {
    const capitalize = word => {
        return word.charAt(0).toUpperCase() + word.slice(1);
    }

    return this.split(' ').map(capitalize).join('');
}

module.exports = String.prototype.camelCase();