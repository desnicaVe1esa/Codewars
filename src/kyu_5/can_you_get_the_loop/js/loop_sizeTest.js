const loop_size = require("./loop_size");
const assert = require('chai').assert;

describe('sample tests', function () {
    it('should work for some small lists', function () {
        {
            const A = new Node();
            A.setNext(A);
            assert.deepEqual(loop_size(A), 1);
        }
        {
            const A = new Node(), B = new Node();
            A.setNext(B), B.setNext(A);
            assert.deepEqual(loop_size(A), 2);
        }
        {
            const A = new Node(), B = new Node();
            A.setNext(B), B.setNext(B);
            assert.deepEqual(loop_size(A), 1);
        }
        {
            const A = new Node(), B = new Node(), C = new Node();
            A.setNext(B), B.setNext(C), C.setNext(C);
            assert.deepEqual(loop_size(A), 1);
        }
        {
            const A = new Node(), B = new Node(), C = new Node();
            A.setNext(B), B.setNext(C), C.setNext(B);
            assert.deepEqual(loop_size(A), 2);
        }
        {
            const A = new Node(), B = new Node(), C = new Node();
            A.setNext(B), B.setNext(C), C.setNext(A);
            assert.deepEqual(loop_size(A), 3);
        }
    });
});