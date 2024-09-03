function remove(s){
    return s.replace(/!/g, '') + "!"
}

module.exports = remove;