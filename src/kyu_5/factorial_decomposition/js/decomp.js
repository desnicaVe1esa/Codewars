function decomp(n) {

    let coll = {};

    for (let i = 2; i <= n; i++) coll[i] = 1;

    for (let i = n; i > 1; i--) {
        for (let k = 2; k <= Math.sqrt(i); k++) {
            if (i % k === 0) {
                coll[k] += coll[i];
                coll[i / k] += coll[i];
                delete coll[i];
                break;
            }
        }
    }

    let answer = "";

    for (let i in coll) {
        answer += i;
        if (coll[i] > 1) answer += "^" + coll[i];
        answer += " * ";
    }

    return answer.slice(0, answer.length - 3);
}