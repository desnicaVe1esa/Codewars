const comparePowers = (n1, n2) => {
    const val1 = n1[1] * Math.log(n1[0]);
    const val2 = n2[1] * Math.log(n2[0]);
    return (val1 > val2) ? -1 : (val1 === val2 ? 0  : 1);
}