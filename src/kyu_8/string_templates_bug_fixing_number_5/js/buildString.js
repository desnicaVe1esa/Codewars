function buildString(...template) {
    return `I like ${template.join(', ')}!`;
}

module.exports = buildString;