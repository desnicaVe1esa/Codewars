function makeAWindow(num) {
    var side = `|${'.'.repeat(num)}|${'.'.repeat(num)}|\n`.repeat(num)
    var centre = `|${'-'.repeat(num)}+${'-'.repeat(num)}|\n`
    return '-'.repeat(num * 2 + 3) + '\n' + side + centre + side + '-'.repeat(num * 2 + 3)
}
module.exports = makeAWindow;