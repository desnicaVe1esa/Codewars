function loop_size(node) {
    let turtle = node;
    let rabbit = node;
    do {
        turtle = turtle.getNext();
        rabbit = rabbit.getNext().getNext();
    } while (turtle !== rabbit)
    let counter = 0;
    do {
        rabbit = rabbit.getNext();
        counter++;
    } while (turtle !== rabbit)

    return counter;
}


module.exports = loop_size;