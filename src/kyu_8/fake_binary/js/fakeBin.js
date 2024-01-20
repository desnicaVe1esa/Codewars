function fakeBin(x) {
    return x.replaceAll(/[0-4]/g, '0').replaceAll(/[5-9]/g, '1');
}

module.exports = fakeBin;