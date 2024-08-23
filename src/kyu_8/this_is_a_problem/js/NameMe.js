function NameMe(first, last) {
    this.firstName = first;
    this.lastName = last;
    this.name = first + ' ' + last;
}

module.exports = NameMe;

