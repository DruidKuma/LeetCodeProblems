package com.druidkuma.leetcode.snap;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * Created by Yurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 31.10.2024
 */
class MaxStack {
    Stack<Node> stack;
    PriorityQueue<Node> pq;
    int seq = 0;
    
    public MaxStack() {
        stack = new Stack<>();
        pq = new PriorityQueue<>((a, b) -> {
            if(a.value == b.value) {
                return b.idx - a.idx;
            }
            return b.value - a.value;
        });
    }

    public void push(int x) {
        seq++;
        Node n = new Node(x, seq);
        stack.push(n);
        pq.offer(n);
    }

    public int pop() {
        seq--;
        while(!stack.isEmpty() && stack.peek().value==Integer.MIN_VALUE) {
            stack.pop();
        }
        Node n = stack.pop();
        pq.remove(n);
        return n.value;
    }

    public int top() {
        while(!stack.isEmpty() && stack.peek().value==Integer.MIN_VALUE) {
            stack.pop();
        }
        return stack.peek().value;
    }

    public int peekMax() {
        return pq.peek().value;
    }

    public int popMax() {
        seq--;
        Node n = pq.remove();
        int ret = n.value;
        n.update();
        while(!stack.isEmpty() && stack.peek().value==Integer.MIN_VALUE) {
            stack.pop();
        }
        return ret;
    }

    static class Node{
        int value;
        int idx;
        public Node(int value, int idx) {
            this.value = value;
            this.idx = idx;
        }
        public void update() {
            this.value = Integer.MIN_VALUE;
        }
    }
}
