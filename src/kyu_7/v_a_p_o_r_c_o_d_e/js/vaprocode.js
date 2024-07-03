function vaporcode(string) {
    return string.toUpperCase().replaceAll(' ', '').split('').join('  ');
}

module.exports = vaporcode;