function shortcut (string){
	return string.replaceAll(/[aeoui]/g , '');
}
module.exports = shortcut;