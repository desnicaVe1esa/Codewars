import isPP from "./solution";

describe("perfect powers", function(){
    it("should work for some examples",function(){
        Test.assertSimilar(isPP(4), [2,2], "4 = 2^2");
        Test.assertSimilar(isPP(9), [3,2], "9 = 3^2");
        Test.assertEquals(isPP(5), null, "5 isn't a perfect number");
    });
    it("should work for the first perfect powers", function(){
        var pp = [4, 8, 9, 16, 25, 27, 32, 36, 49, 64, 81, 100, 121, 125, 128, 144, 169, 196, 216, 225, 243, 256, 289, 324, 343, 361, 400, 441, 484], i;
        for(i = 0; i < pp.length; ++i){
            Test.expect(isPP(pp[i]) !== null, "the perfect power "+pp[i]+" wasn't recognized as one");
        }
    });
    it("should work for random perfect powers", function(){
        var k, m, i, r, l;
        for(i = 0; i < 100; ++i){
            m = 2 + (Math.random() * 0xff)|0,
                k = 2 + (Math.random() * Math.log(0x0fffffff) / Math.log(m))|0;
            l = Math.pow(m,k);
            r = isPP(l);
            if(r === null) {
                Test.expect(r !== null, l + " is a perfect power");
                break;
            } else if(Math.pow(r[0],r[1]) !== l){
                Test.assertEquals(
                    Math.pow(r[0],r[1]), l, "your pair (" + r[0] + ", "+ r[1]+ ") doesn't work for "+ l);
                break;
            }
        }
    });
    it("should return valid pairs for random inputs", function(){
        var i, r, l;

        for(i = 0; i < 100; ++i){
            l = (Math.random() * 0x0000ffff)|0;
            r = isPP(l);
            if(r !== null && Math.pow(r[0],r[1]) !== l){
                Test.assertEquals(
                    Math.pow(r[0],r[1]), l, "your pair (" + r[0] + ", "+ r[1]+ ") doesn't work for "+ l);
                break;
            }
        }
    });
});