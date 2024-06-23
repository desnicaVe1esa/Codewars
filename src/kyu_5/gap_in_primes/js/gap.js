function gap(g, m, n) {
    let result = [];
    let primes = [];
    for (let i = m; i < n; i++) {
        if (isPrime(i)) {
            primes.push(i);
        }
    }
    for (let i = 0; i < primes.length; i++) {
        if (primes[i + 1] - primes[i] === g) {
            result.push(primes[i]);
            result.push(primes[i + 1]);
            break;
        }
    }
    return result.length !== 0 ? result : null;
}

function isPrime(num) {
    if (num <= 1) {
        return false;
    }
    for (let i = 2; i * i <= num; i++) {
        if (num % i === 0) {
            return false;
        }
    }
    return true;
}

module.exports = gap;