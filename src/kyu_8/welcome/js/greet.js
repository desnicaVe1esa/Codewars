function greet(language) {
    let welcomes = new Map([
        ["english", "Welcome"],
        ["czech", "Vitejte"],
        ["danish", "Velkomst"],
        ["dutch", "Welkom"],
        ["estonian", "Tere tulemast"],
        ["finnish", "Tervetuloa"],
        ["flemish", "Welgekomen"],
        ["french", "Bienvenue"],
        ["german", "Willkommen"],
        ["irish", "Failte"],
        ["italian", "Benvenuto"],
        ["latvian", "Gaidits"],
        ["lithuanian", "Laukiamas"],
        ["polish", "Witamy"],
        ["spanish", "Bienvenido"],
        ["swedish", "Valkommen"],
        ["welsh", "Croeso"]
    ]);
    return language === "IP_ADDRESS_INVALID"
            || language === "IP_ADDRESS_NOT_FOUND"
            || language === "IP_ADDRESS_REQUIRED" ? "Welcome" : welcomes.get(language);
}

module.exports = greet;