class God{
    static create(){
        const Adam = new Man();
        const Eve = new Woman();
        return [Adam, Eve];
    }
}

class Human {
    constructor() {
    }
}

class Man extends Human{
    constructor() {
        super();
    }
}

class Woman extends Human{
    constructor() {
        super();
    }
}

module.exports = God;
module.exports = Man;
module.exports = Woman;