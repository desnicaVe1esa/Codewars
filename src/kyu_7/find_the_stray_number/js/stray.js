function stray(numbers) {
    let compare = numbers[0];
    for(let i = 1; i < numbers.length; i++)
    compare = compare ^ numbers[i];
    return compare;
}

module.expot = stray;