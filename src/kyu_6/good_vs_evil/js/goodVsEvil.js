function goodVsEvil(good, evil) {
    let goodsProps = {0: 1, 1: 2, 2: 3, 3: 3, 4: 4, 5: 10};
    let evilsProps = {0: 1, 1: 2, 2: 2, 3: 2, 4: 3, 5: 5, 6: 10};
    let goods = good.split(' ').map((v, i, arr) => v * goodsProps[i]).reduce((a, b) => a + b, 0);
    let evils = evil.split(' ').map((v, i, arr) => v * evilsProps[i]).reduce((a, b) => a + b, 0);
    return goods > evils ? 'Battle Result: Good triumphs over Evil' : goods === evils ? 'Battle Result: No victor on this battle field' : 'Battle Result: Evil eradicates all trace of Good';
}

module.exports = goodVsEvil;