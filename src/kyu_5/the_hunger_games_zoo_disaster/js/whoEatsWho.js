var whoEatsWho = function (zoo) {
    let answer = [zoo];
    let animals = {
        antelope: ['grass'],
        'big-fish': ['little-fish'],
        'little-fish': [],
        bug: ['leaves'],
        bear: ['big-fish', 'bug', 'chicken', 'cow', 'leaves', 'sheep'],
        chicken: ['bug'],
        cow: ['grass'],
        fox: ['chicken', 'sheep'],
        giraffe: ['leaves'],
        lion: ['antelope', 'cow'],
        panda: ['leaves'],
        sheep: ['grass'],
        grass: [],
        leaves: [],
    };
    zoo = zoo.split(',');
    for (var i = 0; i < zoo.length - 1; i++) {
        let firstAnimal = zoo[i];
        let secondAnimal = zoo[i + 1];
        if (Object.keys(animals).indexOf(firstAnimal) !== -1 && Object.keys(animals).indexOf(secondAnimal) !== -1) {
            if (animals[firstAnimal].indexOf(secondAnimal) !== -1) {
                answer.push(`${zoo[i]} eats ${zoo[i + 1]}`);
                zoo.splice(i + 1, 1);
                i = -1;
            } else if (animals[secondAnimal].indexOf(firstAnimal) !== -1) {
                answer.push(`${zoo[i + 1]} eats ${zoo[i]}`);
                zoo.splice(i, 1);
                i = -1;
            }
        }
    }
    answer.push(zoo.toString());
    return answer;
}

module.exports = whoEatsWho;