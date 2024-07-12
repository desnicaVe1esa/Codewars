function remove(s,n){
  let result = "";
  for (let i = 0; i < s.length; i++) {
    if(n > 0 && s[i] === '!') {
      n--;
    } else {
      result += s[i];
    }
  }
  return result;
}
module.exports = remove;