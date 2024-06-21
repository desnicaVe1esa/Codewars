function validateUsr(username) {
    const regex = /^([a-z0-9_]{4,16})$/;
    return regex.test(username);
}

module.exports = validateUsr;