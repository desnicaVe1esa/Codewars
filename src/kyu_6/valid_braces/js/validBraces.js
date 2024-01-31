function validBraces(braces) {
    const stack = [];
    const openingBraces = ['(', '[', '{'];
    const closingBraces = [')', ']', '}'];

    for (let i = 0; i < braces.length; i++) {
        const brace = braces[i];

        if (openingBraces.includes(brace)) {
            stack.push(brace);
        } else if (closingBraces.includes(brace)) {
            const matchingOpeningBrace = openingBraces[closingBraces.indexOf(brace)];

            if (stack.length === 0 || stack.pop() !== matchingOpeningBrace) {
                return false;
            }
        }
    }

    return stack.length === 0;
}

module.exports = validBraces;