package com.example.xyz.algorithm.code;

import java.util.Stack;

// arr 实现队列
public class c_queue_stack_01 {

    public static class MyQueue{
        private int[] arr;
        private int size;
        private int push;
        private int poll;
        private final int limit;

        public MyQueue(int limit){
            arr = new int[limit];
            this.push = 0;
            this.poll = 0;
            this.size = limit;
            this.limit = limit;
        }

        private void push(int value){
            if(size==value){
                throw new RuntimeException("队列满了。。。。。");
            }
            size++;
            arr[push] = value;
            push = nextPush(push);
        }

        private int pop (){
            if(size == 0){
                throw new RuntimeException("没有了。。。。。");
            }
            size--;
            int num = arr[poll];
            poll = nextPush(poll);
            return num;
        }

        private boolean isEmpty(){
            return size ==0;
        }


        private int nextPush(int i){
            return i< limit -1 ? i+1:0;
        }

    }



}
