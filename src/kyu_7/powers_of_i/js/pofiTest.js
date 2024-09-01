import pofi from "./pofi";

describe('Basic Tests', function(){
    it('powers 0 through 10', function(){
        Test.assertEquals(pofi(0),'1');
        Test.assertEquals(pofi(1),'i');
        Test.assertEquals(pofi(2),'-1');
        Test.assertEquals(pofi(3),'-i');
        Test.assertEquals(pofi(4),'1');
        Test.assertEquals(pofi(5),'i');
        Test.assertEquals(pofi(6),'-1');
        Test.assertEquals(pofi(7),'-i');
        Test.assertEquals(pofi(8),'1');
        Test.assertEquals(pofi(9),'i');
        Test.assertEquals(pofi(10),'-1');
    });
});