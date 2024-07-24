function revrot(str, sz) {
    if (sz <= 0 || !str || sz > str.length) return '';

    const sumCubes = chunk => chunk.split('').reduce((sum, digit) => sum += digit**3, 0);
    const reverse = chunk => chunk.split('').reverse().join('');
    const rotate = chunk => chunk.slice(1) + chunk.slice(0, 1);

    const chunks = [];

    for (let i = 0; i < str.length; i += sz) {
        let chunk = str.slice(i, i + sz);

        if (chunk.length < sz) continue;

        chunk = sumCubes(chunk) % 2
            ? rotate(chunk)
            : reverse(chunk);

        chunks.push(chunk)
    }

    return chunks.join('')
}

module.exports = revrot;