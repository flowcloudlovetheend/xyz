package com.example.xyz.algorithm.code;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

// 图
// 宽度优先遍历、深度优先遍历
// 栈实现队列，队列实现栈
public class c_link_stack_01 {

    public static class twoStackQueue {
        private Stack<Integer> push;
        private Stack<Integer> pop;

        public twoStackQueue() {
            push = new Stack<>();
            pop = new Stack<>();
        }

        // 从push栈倒数据到pop栈
        private void pushToPop() {
            if (pop.isEmpty()) {
                while (!push.isEmpty()) {
                    pop.push(push.pop());
                }
            }
        }

        public void add(int pushInt) {
            push.push(pushInt);
            pushToPop();
        }

        public Integer poll() {
            if (pop.isEmpty() && push.isEmpty()) {
                throw new RuntimeException("queue is empty");
            }
            pushToPop();
            return pop.pop();
        }

        public Integer peek() {
            if (pop.isEmpty() && push.isEmpty()) {
                throw new RuntimeException("queue is empty");
            }
            pushToPop();
            return pop.peek();
        }
    }

    // 2个队列组栈
    public static class twoQueueStack {

        private Queue<Integer> push;
        private Queue<Integer> help;

        public twoQueueStack() {
            push = new LinkedList<>();
            help = new LinkedList<>();
        }

        public void push(int pushInt) {
            push.offer(pushInt);
        }

        public int poll() {
            while (push.size() > 1) {
                help.offer(push.poll());
            }
            int ans = push.poll();
            Queue<Integer> tmp = push;
            push = help;
            help = tmp;
            return ans;
        }

        public int peek() {
            while (push.size() > 1) {
                help.offer(push.poll());
            }
            int ans = push.poll();
            help.offer(ans);
            Queue<Integer> tmp = push;
            push = help;
            help = tmp;
            return ans;
        }

        public Boolean isEmpty() {
            return push.isEmpty();
        }


    }


    public static void main(String[] args) {
        Queue<Integer> push = new LinkedList<>();
        push.add(1);
        push.add(2);
        System.out.println(push.poll());
        System.out.println(push.size());
    }

}
