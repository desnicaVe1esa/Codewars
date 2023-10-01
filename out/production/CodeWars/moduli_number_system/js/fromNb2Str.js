function fromNb2Str(n, sys) {
    function gcd(a, b) {
        while (b !== 0) {
            const temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    function arePairwiseCoPrime(numbers) {
        for (let i = 0; i < numbers.length; i++) {
            for (let j = i + 1; j < numbers.length; j++) {
                if (gcd(numbers[i], numbers[j]) !== 1) {
                    return false;
                }
            }
        }
        return true;
    }

    const product = sys.reduce((a, b) => a * b, 1);

    if (!arePairwiseCoPrime(sys) || product <= n) {
        return "Not applicable";
    }

    let result = "";
    for (let i = 0; i < sys.length; i++) {
        const residue = n % sys[i];
        result += `-${residue}-`;
    }

    return result;
}

module.exports = fromNb2Str;