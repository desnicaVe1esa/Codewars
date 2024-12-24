function domainName(url){
    return url.replace(/.+\/\/|www.|\..+/g, "");
}

module.exports = domainName;