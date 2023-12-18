package com.anatkh.buffer;

import java.nio.ByteBuffer;

public class BufferCreate {

    public static void main(String[] args) {

        //1,创建指定长度的缓冲区，byteBuffer为例
        ByteBuffer allocate = ByteBuffer.allocate(5);
        for (int i = 0; i < 5; i++) {
           System.out.println(allocate.get()); //从缓冲区中拿数据
        }

        //  会报错
        //System.out.println(allocate.get());//从缓冲区中拿数据
        //2，创建有内容的缓冲区
        ByteBuffer wrap = ByteBuffer.wrap("lagou".getBytes());
        for (int i = 0; i < 5; i++) {
            System.out.println(wrap.get(i));
        }
    }
}
