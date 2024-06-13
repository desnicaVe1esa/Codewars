package kyu_6.encrypt_this.groovy;

class Kata {
    static def encryptThis(text) {
        text.split(' ').collect {
            if (it) {
                def prefix = it.codePointAt(0)
                if (it.length() > 2) {
                    "$prefix${it.charAt(it.length() - 1)}${it.substring(2, it.length() - 1)}${it.charAt(1)}"
                } else {
                    "${prefix}${it.substring(1)}"
                }
            }
        }.join(' ')
    }
}