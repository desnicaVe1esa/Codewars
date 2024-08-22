def my_languages(results):
    return sorted((l for l,r in results.items() if r>=60), reverse=True, key=results.get)