//package kyu_5.can_you_get_the_loop.java;
//
//import java.util.*;
//
//public class LoopInspector {
//
//  public int loopSize(Node node) {
//    ArrayList<Node> loopArr = new ArrayList<Node>();
//    while (!loopArr.contains(node)) {
//      loopArr.add(node);
//      node = node.getNext();
//    }
//    int firstIndex = Math.max(0, loopArr.indexOf(node));
//    return loopArr.size() - firstIndex;
//  }
//
//}