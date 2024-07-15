function alphanumeric(string){
    return /^[a-zA-Z0-9]+$/.test(string)
}
module.exports = alphanumeric;