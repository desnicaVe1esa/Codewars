import dup from "./dup";

describe("Basic tests", function(){
    Test.assertDeepEquals(dup(["ccooddddddewwwaaaaarrrrsssss","piccaninny","hubbubbubboo"]),['codewars','picaniny','hubububo']);
    Test.assertDeepEquals(dup(["abracadabra","allottee","assessee"]),['abracadabra','alote','asese']);
    Test.assertDeepEquals(dup(["kelless","keenness"]), ['keles','kenes']);
    Test.assertDeepEquals(dup(["Woolloomooloo","flooddoorroommoonlighters","chuchchi"]), ['Wolomolo','flodoromonlighters','chuchchi']);
    Test.assertDeepEquals(dup(["adanac","soonness","toolless","ppellee"]), ['adanac','sones','toles','pele']);
    Test.assertDeepEquals(dup(["callalloo","feelless","heelless"]), ['calalo','feles','heles']);
    Test.assertDeepEquals(dup(["putteellinen","keenness"]), ['putelinen','kenes']);
    Test.assertDeepEquals(dup(["kelless","voorraaddoosspullen","achcha"]), ['keles','voradospulen','achcha']);
});