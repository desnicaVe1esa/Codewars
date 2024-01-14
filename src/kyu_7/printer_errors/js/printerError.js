function printerError(s) {
    return s.replaceAll(/[a-m]/g, '').length + '/' + s.length;
}

module.exports = printerError;