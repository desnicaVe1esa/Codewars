import codewars_test as test
from solution import dup

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(dup(["ccooddddddewwwaaaaarrrrsssss","piccaninny","hubbubbubboo"]),['codewars','picaniny','hubububo'])
        test.assert_equals(dup(["abracadabra","allottee","assessee"]),['abracadabra','alote','asese'])
        test.assert_equals(dup(["kelless","keenness"]), ['keles','kenes'])
        test.assert_equals(dup(["Woolloomooloo","flooddoorroommoonlighters","chuchchi"]), ['Wolomolo','flodoromonlighters','chuchchi'])
        test.assert_equals(dup(["adanac","soonness","toolless","ppellee"]), ['adanac','sones','toles','pele'])
        test.assert_equals(dup(["callalloo","feelless","heelless"]), ['calalo','feles','heles'])
        test.assert_equals(dup(["putteellinen","keenness"]), ['putelinen','kenes'])
        test.assert_equals(dup(["kelless","voorraaddoosspullen","achcha"]), ['keles','voradospulen','achcha'])