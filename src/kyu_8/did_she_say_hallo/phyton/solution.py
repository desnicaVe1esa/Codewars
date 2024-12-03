def validate_hello(greetings):
    hellos = ['hello', 'ciao', 'salut', 'hallo', 'hola', 'ahoj', 'czesc']
    return any(greet in greetings.lower() for greet in hellos)