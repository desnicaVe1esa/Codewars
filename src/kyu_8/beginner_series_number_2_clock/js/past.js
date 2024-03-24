function past(h, m, s) {
    return (s * 1_000) + (m * 60_000) + (h * 3_600_000 )
}

module.exports = past;