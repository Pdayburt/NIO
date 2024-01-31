package com.anatkh.buffer;

import lombok.extern.slf4j.Slf4j;

import java.nio.ByteBuffer;
@Slf4j
public class BufferCreate {

    public static void main(String[] args) {

        //1，创建指定长度的缓冲区，以byteBuffer为例子
        ByteBuffer allocate = ByteBuffer.allocate(5);
        for (int i = 0; i < 5; i++) {
            System.out.println(allocate.get());
        }
        //System.out.println(allocate.get()); 此处继续调用会报错。
        ByteBuffer wrap = ByteBuffer.wrap("lagou".getBytes());
        for (int i = 0; i < 5; i++) {
            System.out.println(wrap.get());
        }

    }
}
