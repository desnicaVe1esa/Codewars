char *switcheroo(char *seq) {
    char *ptr = seq;
    while (*ptr != '\0') {
        switch (*ptr) {
            case 'a': *ptr = 'b'; break;
            case 'b': *ptr = 'a'; break;
        }
        ptr++;
    }
    return seq;
}