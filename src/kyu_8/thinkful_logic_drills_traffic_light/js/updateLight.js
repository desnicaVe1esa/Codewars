function updateLight(current) {
    switch (current) {
        case 'red':
            return 'green';
        case 'green':
            return 'yellow';
        case 'yellow':
            return 'red';
    }
}

module.exports = updateLight;